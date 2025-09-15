package com.mrrobot.blog;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * Clase de pruebas para la aplicación Blog
 *
 * Esta clase contiene las pruebas automáticas que verifican que nuestra aplicación
 * funciona correctamente. Es como tener un inspector de calidad que revisa
 * que todo esté en orden antes de entregar el producto.
 *
 * ¿Por qué son importantes las pruebas?
 * - Nos aseguran que el código funciona como esperamos
 * - Detectan errores antes de que lleguen a producción
 * - Nos dan confianza para hacer cambios sin romper funcionalidad existente
 * - Sirven como documentación de cómo debe comportarse el sistema
 *
 * La anotación @SpringBootTest le dice a Spring:
 * "Inicia toda la aplicación en modo de pruebas para poder probarla completamente"
 *
 * Piénsalo como hacer un ensayo general antes de la obra de teatro:
 * verificas que todos los actores sepan sus papeles y que todo funcione bien juntos.
 *
 * @author MrRobot
 * @version 1.0
 * @since 15/09/2025
 */
@SpringBootTest
class BlogApplicationTests {

	/**
	 * Prueba que verifica que el contexto de Spring se carga correctamente
	 *
	 * Esta es la prueba más básica pero muy importante. Verifica que:
	 * - La aplicación puede iniciarse sin errores
	 * - Todas las configuraciones están correctas
	 * - Spring puede crear e inyectar todos los componentes (controllers, services, repositories)
	 * - Las dependencias están configuradas correctamente
	 *
	 * Es como verificar que el motor de un coche arranca antes de salir a manejar.
	 * Si esta prueba falla, significa que hay un problema fundamental en la configuración.
	 *
	 * La anotación @Test le dice a JUnit (el framework de pruebas):
	 * "Este es un método que debe ejecutarse como prueba"
	 *
	 * Si este método se ejecuta sin lanzar excepciones, la prueba pasa.
	 * Si hay algún error al cargar el contexto, la prueba falla automáticamente.
	 */
	@Test
	void contextLoads() {
		// Este método está intencionalmente vacío.
		// La magia sucede en @SpringBootTest: Spring intenta cargar toda la aplicación.
		// Si no hay errores de configuración, esta prueba pasa automáticamente.

		// En el futuro, aquí podrías agregar más verificaciones como:
		// - Verificar que ciertos beans estén disponibles
		// - Comprobar que las propiedades se carguen correctamente
		// - Validar que las conexiones a base de datos funcionen
	}

}
