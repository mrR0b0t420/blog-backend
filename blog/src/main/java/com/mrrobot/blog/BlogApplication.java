package com.mrrobot.blog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Clase principal de la aplicación del Blog
 *
 * Esta es la clase que inicia toda la aplicación Spring Boot. Es como el "interruptor principal"
 * que enciende todo el sistema.
 *
 * ¿Qué hace la anotación @SpringBootApplication?
 * - Le dice a Spring que esta es la clase principal
 * - Configura automáticamente muchas cosas que necesita la aplicación
 * - Busca otros componentes (como controllers, services, etc.) en este paquete y subpaquetes
 * - Es como decirle a Spring: "Desde aquí arranca todo"
 *
 * Piénsalo como el director de una orquesta que coordina a todos los músicos (componentes)
 * @version 1.0
 * @since 15/09/2025
 */
@SpringBootApplication
public class BlogApplication {

	/**
	 * Método principal que inicia la aplicación
	 *
	 * Este es el punto de entrada de nuestra aplicación, como el "main" en cualquier
	 * programa Java. Cuando ejecutas la aplicación, este método se ejecuta primero.
	 *
	 * ¿Qué hace SpringApplication.run()?
	 * - Inicia el servidor web embebido (como Tomcat)
	 * - Configura la base de datos
	 * - Carga todos los componentes (controllers, services, repositories)
	 * - Deja la aplicación lista para recibir peticiones HTTP
	 *
	 * @param args Argumentos de línea de comandos (como parámetros adicionales al ejecutar)
	 */
	public static void main(String[] args) {
		// Aquí arrancamos toda la aplicación Spring Boot
		SpringApplication.run(BlogApplication.class, args);
	}

}
