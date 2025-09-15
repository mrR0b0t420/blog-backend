# blog-backend
Repositorio para el backend del blog; desarrollado con Spring Boot.

## Estructura del Proyecto

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

## Responsabilidades de cada Paquete/Clase

### 📁 controller
- **Responsabilidad**: Recibe las peticiones web y llama a los servicios.
- **Clases**: 
  - `PostController.java` - Maneja las peticiones HTTP relacionadas con los posts del blog.

### 📁 service  
- **Responsabilidad**: Contiene la lógica de negocio principal.
- **Clases**: 
  - `PostService.java` - Implementa la lógica de negocio para la gestión de posts.

### 📁 repository
- **Responsabilidad**: Se comunica con la base de datos.
- **Clases**: 
  - `PostRepository.java` - Maneja el acceso a datos y operaciones CRUD para los posts.

### 📁 model
- **Responsabilidad**: Define las entidades (los datos) de la aplicación.
- **Clases**: 
  - `PostModel.java` - Representa la entidad Post con sus atributos y propiedades.

### 📁 blog
- **Responsabilidad**: Contiene la clase principal de la aplicación.
- **Clases**: 
  - `BlogApplication.java` - Punto de entrada de la aplicación Spring Boot.
