# 🏫 API de Gestión de Estudiantes Universitarios  

[![Spring Boot](https://img.shields.io/badge/Spring_Boot-6DB33F?style=for-the-badge&logo=spring&logoColor=white)](https://spring.io/projects/spring-boot)  
Una API RESTful desarrollada con Spring Boot para administrar estudiantes en una universidad.  

## 🌟 Funcionalidades  
- ✅ Soporte completo para operaciones CRUD  
- 🔄 Métodos de almacenamiento:  
  - **Memoria** (modo desarrollo, utilizando `ConcurrentHashMap`)  
- 🛡️ Validación de datos mediante DTOs  
- 📊 Compatible con pruebas en Postman  

## 🛠 Tecnologías Utilizadas  
| Tecnología         | Descripción                      |  
|--------------------|--------------------------------|  
| Java 17           | Lenguaje de programación       |  
| Spring Boot 3.x   | Framework backend              |  
| Lombok            | Eliminación de código repetitivo |  
| Maven             | Gestión de dependencias        |  

## 📂 Estructura del Proyecto  
```plaintext
src/
├── main/
│   ├── java/
│   │   └── com/universidad/
│   │       ├── controller/    # Controladores REST
│   │       ├── dto/           # Objetos de Transferencia de Datos (DTO)
│   │       ├── model/         # Entidades JPA
│   │       ├── repository/    # Acceso a datos
│   │       └── service/       # Lógica de negocio
│   └── resources/
│       └── application.properties
└── test/                     # Pruebas unitarias

¡Listo para usar! 🚀
