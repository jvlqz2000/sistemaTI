# Arquitectura de la Aplicación - NocaTech

Este documento describe la arquitectura técnica del **Sistema de Tickets e Inventario TI**, diseñado para centralizar y optimizar los procesos de soporte técnico de NocaTech S.A. de C.V.

## 1. Objetivo y Alcance
El sistema tiene como objetivo principal eliminar la dependencia de medios informales (WhatsApp, correos) mediante una plataforma estructurada bajo el patrón MVC.

### Objetivos técnicos:
* **Exponer un endpoint REST** para la gestión de tickets y activos.
* **Servir una interfaz web responsiva** para usuarios y técnicos.
* **Validar el funcionamiento** mediante pruebas unitarias y de integración continua.

### Alcance actual:
* **Monolito basado en Java:** Una sola aplicación robusta bajo Spring Boot.
* **Persistencia Relacional:** Almacenamiento estructurado en MySQL.
* **Seguridad:** Control de acceso basado en roles (Admin, Técnico, Usuario).

## 2. Vista General (Contenedores)
La arquitectura se divide en tres capas principales que garantizan un tiempo de respuesta menor a 3 segundos.

### Diagrama de Flujo:
`[ Cliente Web / Navegador ] <--- HTTP ---> [ Servidor Spring Boot ] <--- JDBC ---> [ Base de Datos MySQL ]`

### Componentes Principales:
1. **Frontend (Capa de Presentación):** Desarrollado en HTML5, CSS3 y JavaScript. Es la interfaz con la que interactúa el usuario para crear tickets o administrar el inventario.
2. **Backend (Capa de Negocio):** API REST construida con **Java Spring Boot 3.x**. Gestiona la lógica de autenticación, asignación de tickets y validación de formularios.
3. **Persistencia (Capa de Datos):** Servidor **MySQL** que almacena el esquema `gestion_ti`, incluyendo tablas de usuarios, roles, registros de tickets e historial de inventario.

## 3. Atributos de Calidad
De acuerdo con la planeación estratégica, la arquitectura soporta:
* **Seguridad:** Encriptación de contraseñas y validación contra datos inválidos.
* **Escalabilidad:** Estructura modular que permite agregar funciones futuras (como notificaciones en tiempo real).
* **Usabilidad:** Interfaz intuitiva compatible con Google Chrome y Microsoft Edge.

## 4. Gestión de Tareas y Código
* **Repositorio:** GitHub (Control de versiones).
* **CI/CD:** GitHub Actions para la validación automática de pruebas JUnit.
* **Ramas:** Flujo de trabajo basado en `develop` (Etapa Beta) y `master` (General Availability).
