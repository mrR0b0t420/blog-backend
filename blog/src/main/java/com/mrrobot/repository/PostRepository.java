package com.mrrobot.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 * Repositorio para manejar las operaciones de base de datos de los Posts
 *
 * Esta clase es como el "bibliotecario" de nuestro blog. Su trabajo es:
 * - Guardar posts en la base de datos
 * - Buscar posts existentes
 * - Actualizar posts
 * - Eliminar posts
 *
 * ¿Por qué necesitamos un Repository?
 * - Separa la lógica de base de datos del resto de la aplicación
 * - Hace que el código sea más fácil de mantener y testear
 * - Si cambiamos de base de datos, solo modificamos esta clase
 *
 * La anotación @Repository le dice a Spring:
 * "Esta clase maneja datos, por favor configúrala automáticamente"
 *
 * Piénsalo como el empleado del archivo que sabe exactamente dónde están
 * guardados todos los documentos y cómo encontrarlos rápidamente.
 *
 * @author MrRobot
 * @version 1.0
 * @since 15/09/2025
 */
@Repository
public class PostRepository {

    /**
     * JdbcTemplate es una herramienta de Spring para trabajar con base de datos
     *
     * Es como tener un asistente que se encarga de:
     * - Abrir conexiones a la base de datos
     * - Ejecutar consultas SQL
     * - Cerrar conexiones automáticamente
     * - Manejar errores de base de datos
     *
     * @Autowired le dice a Spring: "Por favor, proporciona esta herramienta automáticamente"
     */
    @Autowired
    private JdbcTemplate jdbcTemplate;
}
