# Proyecto de API de Foro

Este proyecto es una API REST desarrollada con **Spring Boot**, que permite gestionar tópicos de un foro. Implementa operaciones básicas como crear, leer, actualizar y eliminar (CRUD) tópicos, y utiliza **Flyway** para la gestión de la base de datos.

---

## Tecnologías utilizadas

- **Java 17**
- **Spring Boot**
- **Maven**
- **Flyway** (Migración de la base de datos)
- **MySQL** (Base de datos relacional)
- **Postman** (Pruebas de la API)

## Endpoints disponibles

### 1. Crear un nuevo tópico

- **Método:** POST
- **Ruta:** /topicos
- **Cuerpo de la solicitud (JSON):
  {
    "titulo": "Título del tópico",
    "mensaje": "Contenido del mensaje",
    "autor_nombre": "Nombre del autor",
    "curso_nombre": "Nombre del curso",
    "curso_categoria": "Categoría del curso"
  }

  ### 2. Ver todos tópicos o por id
  - **Método:** GET
- **Ruta:** /topicos o /topicos/id
- **Cuerpo de la respuesta (JSON):
  {
    id": 1,
    "titulo": "Título del tópico",
    "mensaje": "Contenido del mensaje",
    "autor_nombre": "Nombre del autor",
    "curso_nombre": "Nombre del curso",
    "curso_categoria": "Categoría del curso",
    "estado": "ABIERTO",
    "fechaCreacion": "2025-01-20T12:30:00"
  }
   ### 3. Actualizar tópicos por id
  - **Método:** PUT
- **Ruta:** /topicos/id
- **Cuerpo de la respuesta (JSON):
  {
    "titulo": "Nuevo título del tópico",
    "mensaje": "Otro contenido del mensaje",
    "estado": "CERRADA"
  }
  ### 3. Eliminar tópicos por id
  - **Método:** DELETE
- **Ruta:** /topicos/id
- **Sin respuesta por el momento

## Seguridad con JWT disponible
