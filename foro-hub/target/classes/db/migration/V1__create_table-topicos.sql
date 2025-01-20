CREATE TABLE topicos (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    titulo VARCHAR(255) NOT NULL,
    mensaje TEXT NOT NULL,
    fecha_creacion TIMESTAMP DEFAULT CURRENT_TIMESTAMP NOT NULL,
    estado VARCHAR(50) NOT NULL,
    autor_nombre VARCHAR(255) NOT NULL,
    curso_nombre VARCHAR(255) NOT NULL,
    curso_categoria VARCHAR(50) NOT NULL
);