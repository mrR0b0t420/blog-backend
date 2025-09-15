# blog-backend
Repositorio para el backend del blog; desarrollado con Spring Boot.

## 🎯 ¿Qué es este proyecto?

Este es un **backend de blog** construido con **Spring Boot**, que es como el "motor" que maneja toda la información de un blog desde atrás de escena. 

**Imagínalo así**: Si un blog fuera un restaurante, este backend sería la cocina - donde se prepara toda la comida (datos) que después se sirve a los clientes (frontend/usuarios).

### ¿Qué hace exactamente?
- Guarda y recupera posts del blog en una base de datos Oracle
- Permite crear, leer, actualizar y eliminar posts (operaciones CRUD)
- Proporciona una API REST que otros sistemas pueden usar
- Maneja toda la lógica de negocio del blog

## 🏗️ Estructura del Proyecto

```
blog/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/
│   │   │       └── mrrobot/
│   │   │           ├── blog/
│   │   │           │   └── BlogApplication.java
│   │   │           ├── controller/
│   │   │           │   └── PostController.java
│   │   │           ├── model/
│   │   │           │   └── PostModel.java
│   │   │           ├── repository/
│   │   │           │   └── PostRepository.java
│   │   │           └── service/
│   │   │               └── PostService.java
│   │   └── resources/
│   │       └── application.properties
│   └── test/
│       └── java/
│           └── com/
│               └── mrrobot/
│                   └── blog/
│                       └── BlogApplicationTests.java
└── pom.xml
```

## 📋 Responsabilidades de cada Paquete/Clase

### 🎪 **blog/** - El Director de la Orquesta
- **`BlogApplication.java`** - Punto de entrada de la aplicación
- **Responsabilidad**: Inicia toda la aplicación Spring Boot
- **Analogía**: Es como el interruptor principal que enciende todo el sistema
- **¿Qué hace?**: 
  - Arranca el servidor web
  - Configura automáticamente todos los componentes
  - Deja la aplicación lista para recibir peticiones

### 🎭 **controller/** - El Recepcionista
- **`PostController.java`** - Maneja las peticiones HTTP relacionadas con los posts
- **Responsabilidad**: Recibe las peticiones web y llama a los servicios
- **Analogía**: Como el mesero de un restaurante que toma tu orden y te trae la comida
- **¿Qué hace?**: 
  - Recibe peticiones HTTP (GET, POST, PUT, DELETE)
  - Convierte JSON en objetos Java y viceversa
  - Maneja códigos de respuesta HTTP (200, 404, 500, etc.)
  - Llama al service para procesar la lógica

**Endpoints disponibles**:
- `GET /api/posts` - Obtener todos los posts
- `GET /api/posts/{id}` - Obtener un post específico
- `POST /api/posts` - Crear un nuevo post
- `PUT /api/posts/{id}` - Actualizar un post existente
- `DELETE /api/posts/{id}` - Eliminar un post
- `GET /api/posts/health` - Verificar que el servicio funciona

### 🧠 **service/** - El Gerente/Cerebro
- **`PostService.java`** - Implementa la lógica de negocio para la gestión de posts
- **Responsabilidad**: Contiene la lógica de negocio principal
- **Analogía**: Como el gerente que decide qué se puede hacer y cómo
- **¿Qué hace?**: 
  - Aplica reglas de negocio (validaciones)
  - Procesa y transforma datos
  - Coordina entre controller y repository
  - Maneja la lógica compleja

**Validaciones que implementa**:
- Un post debe tener título, contenido y autor
- Asigna automáticamente la fecha de creación
- Limpia espacios extra en los textos
- Verifica que los posts existan antes de modificarlos

### 📚 **repository/** - El Bibliotecario
- **`PostRepository.java`** - Maneja el acceso a datos y operaciones CRUD
- **Responsabilidad**: Se comunica con la base de datos
- **Analogía**: Como el empleado del archivo que sabe dónde está todo guardado
- **¿Qué hace?**: 
  - Ejecuta consultas SQL en la base de datos Oracle
  - Convierte filas de BD en objetos Java
  - Maneja conexiones y errores de base de datos
  - Implementa operaciones CRUD (Create, Read, Update, Delete)

**Métodos disponibles**:
- `findAll()` - Busca todos los posts
- `findById(id)` - Busca un post por ID
- `save(post)` - Guarda un nuevo post
- `update(post)` - Actualiza un post existente
- `deleteById(id)` - Elimina un post

### 📦 **model/** - La Plantilla de Datos
- **`PostModel.java`** - Representa la entidad Post con sus atributos
- **Responsabilidad**: Define las entidades (los datos) de la aplicación
- **Analogía**: Como un formulario que define qué información debe tener cada post
- **¿Qué contiene?**:
  - `id` - Identificador único del post
  - `titulo` - Título del post
  - `contenido` - Contenido completo del artículo
  - `autor` - Nombre del autor
  - `fechaCreacion` - Cuándo se creó el post

## 🔧 Tecnologías Utilizadas

### **Spring Boot** 🚀
- **¿Qué es?**: Un framework que facilita crear aplicaciones Java
- **¿Por qué?**: Configura automáticamente muchas cosas complejas
- **Beneficios**: Menos código, más funcionalidad, fácil de usar

### **Oracle Database** 🗄️
- **¿Qué es?**: Un sistema de base de datos empresarial
- **¿Por qué?**: Robusto, confiable y muy usado en empresas
- **Conexión**: Via JDBC (Java Database Connectivity)

### **Maven** 📦
- **¿Qué es?**: Herramienta para manejar dependencias y compilar el proyecto
- **¿Por qué?**: Automatiza descargas de librerías y compilación
- **Archivo**: `pom.xml` contiene toda la configuración

### **JUnit** 🧪
- **¿Qué es?**: Framework para hacer pruebas automáticas
- **¿Por qué?**: Asegura que el código funciona correctamente
- **Ubicación**: Carpeta `test/`

## 🏛️ Arquitectura por Capas

Este proyecto sigue el patrón **MVC (Model-View-Controller)** adaptado para APIs REST:

```
┌─────────────────┐    ┌─────────────────┐    ┌─────────────────┐    ┌─────────────────┐
│   🌐 Cliente     │───▶│  📡 Controller   │───▶│   🧠 Service     │───▶│  📚 Repository   │
│   (Frontend)    │    │  (Recepcionista) │    │   (Gerente)     │    │ (Bibliotecario) │
└─────────────────┘    └─────────────────┘    └─────────────────┘    └─────────────────┘
                                  ▲                      ▲                      ▲
                                  │                      │                      │
                                  ▼                      ▼                      ▼
                       ┌─────────────────┐    ┌─────────────────┐    ┌─────────────────┐
                       │   📦 Model       │    │   💼 Business    │    │  🗄️ Database    │
                       │  (Estructura)   │    │     Logic       │    │    (Oracle)     │
                       └─────────────────┘    └─────────────────┘    └─────────────────┘
```

**Flujo de una petición típica**:
1. **Cliente** envía petición HTTP → `POST /api/posts`
2. **Controller** recibe la petición y extrae los datos
3. **Service** valida los datos y aplica reglas de negocio
4. **Repository** guarda los datos en la base de datos Oracle
5. **Respuesta** viaja de vuelta: Repository → Service → Controller → Cliente

## 🚀 Cómo ejecutar el proyecto

### Pre-requisitos
- Java 17 o superior instalado
- Oracle Database configurado y ejecutándose
- Maven instalado (o usar el wrapper incluido)
- IntelliJ IDEA (recomendado)

### Pasos para ejecutar

1. **Configurar la base de datos**:
   - Actualiza `application.properties` con tus credenciales de Oracle
   - Crea la tabla `posts` en tu base de datos

2. **Compilar el proyecto**:
   ```bash
   mvn clean compile
   ```

3. **Ejecutar las pruebas**:
   ```bash
   mvn test
   ```

4. **Iniciar la aplicación**:
   ```bash
   mvn spring-boot:run
   ```

5. **Verificar que funciona**:
   - Abre tu navegador en `http://localhost:8080/api/posts/health`
   - Deberías ver: "Servicio de Posts funcionando correctamente"

## 📚 Para Seguir Aprendiendo

### **Conceptos clave de Spring Boot**:
- **Inversión de Control (IoC)**: Spring maneja la creación de objetos
- **Inyección de Dependencias**: `@Autowired` conecta automáticamente componentes
- **Anotaciones**: `@RestController`, `@Service`, `@Repository` definen roles
- **Auto-configuración**: Spring configura automáticamente muchas cosas

### **Próximos pasos sugeridos**:
1. Agregar validaciones más robustas con `@Valid`
2. Implementar paginación para listas grandes de posts
3. Agregar autenticación y autorización
4. Crear documentación automática con Swagger
5. Implementar cache para mejorar rendimiento
6. Agregar logs más detallados
7. Crear más pruebas unitarias e integración

### **Recursos recomendados**:
- [Documentación oficial de Spring Boot](https://spring.io/projects/spring-boot)
- [Guías de Spring](https://spring.io/guides)
- [Tutorial de Oracle JDBC](https://docs.oracle.com/javase/tutorial/jdbc/)

---

**¡Felicitaciones!** 🎉 Ahora tienes un backend completo y bien documentado para tu blog. Cada componente tiene un propósito claro y trabajan juntos para crear una API robusta y fácil de mantener.
