package com.mrrobot.service;

import com.mrrobot.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Servicio para manejar la lógica de negocio de los Posts
 *
 * Esta clase es como el "gerente" o "coordinador" del blog. Su trabajo es:
 * - Aplicar las reglas de negocio (por ejemplo: validar que un post tenga título)
 * - Coordinar entre el controlador y el repositorio
 * - Procesar y transformar datos antes de guardarlos
 * - Manejar la lógica compleja que no pertenece ni al controlador ni al repositorio
 *
 * ¿Por qué necesitamos un Service?
 * - Mantiene la lógica de negocio separada de la presentación (controller) y los datos (repository)
 * - Hace el código más organizado y fácil de mantener
 * - Permite reutilizar la lógica en diferentes partes de la aplicación
 * @version 1.0
 * @since 15/09/2025
 */
@Service
public class PostService {

    /**
     * Repositorio para acceso a datos de posts
     *
     * Este es nuestro "bibliotecario" que sabe cómo interactuar con la base de datos.
     * El service usa el repository para obtener o guardar datos, pero no se preocupa
     * por los detalles de cómo funciona la base de datos.
     *
     * @Autowired le dice a Spring: "Por favor, proporciona el repository automáticamente"
     */
    @Autowired
    private PostRepository postRepository;

}
