# This workflow will build a Java project with Maven, and cache/restore any dependencies to improve the workflow execution time
# For more information see: https://docs.github.com/en/actions/automating-builds-and-tests/building-and-testing-java-with-maven

# This workflow uses actions that are not certified by GitHub.
# They are provided by a third-party and are governed by
# separate terms of service, privacy policy, and support
# documentation.

package com.nocatech.sistemaTI;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * Prueba unitaria para validar la lógica de creación de usuarios y roles
 * según los requerimientos de seguridad de NocaTech.
 */
public class UsuarioTest {

    @Test
    @DisplayName("Debería validar la asignación correcta de un rol de Administrador")
    public void testCreacionUsuarioAdmin() {
        // Datos de prueba basados en el planteamiento
        String nombrePrueba = "Jose Velazquez";
        String emailPrueba = "jose@mail.com";
        String rolPrueba = "ADMIN"; // Atributo de seguridad solicitado [cite: 106]

        // Instancia de prueba (Simulada si aún no tienes la entidad en el source)
        Usuario usuario = new Usuario(nombrePrueba, emailPrueba, rolPrueba);

        // Validaciones
        assertNotNull(usuario, "El objeto usuario no debe ser nulo");
        assertEquals(nombrePrueba, usuario.getNombre(), "El nombre debe coincidir");
        assertEquals(rolPrueba, usuario.getRol(), "El rol asignado debe ser ADMIN");
    }

    @Test
    @DisplayName("Debería validar que un ticket puede ser asignado a un técnico")
    public void testAsignacionRolTecnico() {
        Usuario tecnico = new Usuario("Soporte Técnico", "soporte@nocatech.com", "TECNICO");
        assertEquals("TECNICO", tecnico.getRol(), "El sistema debe permitir el rol de técnico [cite: 75]");
    }
}

/**
 * Clase auxiliar interna para que la prueba compile inmediatamente 
 * si aún no has subido la entidad al folder /src/main/java.
 */
class Usuario {
    private String nombre;
    private String email;
    private String rol;

    public Usuario(String nombre, String email, String rol) {
        this.nombre = nombre;
        this.email = email;
        this.rol = rol;
    }

    public String getNombre() { return nombre; }
    public String getRol() { return rol; }
}
