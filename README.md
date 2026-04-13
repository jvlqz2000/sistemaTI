🚀 **Sistema de Tickets e Inventario TI - NocaTech**

📋 **1. Descripción del Proyecto**

Este sistema es una solución integral diseñada para el área de Tecnología de la Información 
de la empresa NocaTech S.A. de C.V.. Su objetivo principal es centralizar la gestión de solicitudes 
de soporte y el control de activos tecnológicos, eliminando la dependencia de medios informales como 
WhatsApp o correos.

Problemáticas a Resolver:

-Pérdida de solicitudes y falta de seguimiento.
-Mala organización del inventario físico y falta de historial de incidencias.
-Tiempos de respuesta ineficientes.

🛠️ **2. Tecnologías y Arquitectura**

El desarrollo se basa en una arquitectura MVC (Modelo-Vista-Controlador) para garantizar la escalabilidad y el mantenimiento del código.

Backend: Java Spring Boot.Base de Datos: MySQL.
Frontend: HTML/CSS/JavaScript con diseño responsivo.
Comunicación: API REST.CI/CD: GitHub Actions para integración continua y pruebas automáticas.

⚙️ **3. Requerimientos Funcionales**

De acuerdo con la fase de planeación, el sistema incluye los siguientes módulos principales:

-Módulo de Usuarios (Prioridad Alta)
Autenticación mediante Login y control de acceso por roles: Admin, Técnico y Usuario.

-Módulo de Tickets (Prioridad Alta)
Creación, edición, asignación a técnicos y gestión de estados: Abierto, En Proceso y Cerrado.

-Módulo de Inventario (Prioridad Media)
Registro de equipos tecnológicos y asignación de activos a usuarios finales.

🏗️ **4. Atributos y Seguridad**

-Seguridad: Implementación de encriptación de contraseñas y validación de formularios contra datos inválidos.
-Rendimiento: El sistema está optimizado para ofrecer una respuesta en menos de 3 segundos.
-Usabilidad: Interfaz intuitiva compatible con Google Chrome y Microsoft Edge.

📦 **5. Instalación y Configuración**

1. Clonar el repositorio: git clone https://github.com/jvlqz2000/sistemaTI.git.
2. Base de Datos: Configurar el esquema gestion_ti en MySQL.
3. ropiedades: Ajustar credenciales en src/main/resources/application.properties.
4. Ejecución: Correr el proyecto desde NetBeans o vía Maven con mvn spring-boot:run.




















































































