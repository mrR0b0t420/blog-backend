package com.mrrobot.controller;

import com.mrrobot.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Controlador REST para manejar las peticiones HTTP relacionadas con Posts
 *
 * Esta clase es como la "recepcionista" de nuestro blog. Su trabajo es:
 * - Recibir peticiones HTTP de los usuarios (navegadores, apps móviles, etc.)
 * - Validar que las peticiones tengan el formato correcto
 * - Llamar al servicio apropiado para procesar la petición
 * - Devolver la respuesta en formato JSON
 *
 * ¿Por qué necesitamos un Controller?
 * - Es el punto de entrada para todas las peticiones web
 * - Traduce peticiones HTTP en llamadas a métodos Java
 * - Maneja los códigos de respuesta HTTP (200, 404, 500, etc.)
 * - Convierte objetos Java a JSON automáticamente
 *
 * @version 1.0
 * @since 15/09/2025
 */
public class PostController {

    /**
     * Servicio que contiene la lógica de negocio para posts
     *
     * Este es nuestro "gerente" que se encarga de toda la lógica compleja.
     * El controller simplemente recibe peticiones y le dice al service qué hacer.
     *
     * @Autowired le dice a Spring: "Por favor, proporciona el service automáticamente"
     */
    @Autowired
    private PostService postService;

}
