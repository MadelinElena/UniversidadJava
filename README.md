# UniversidadJava
Ejercicio de organizar cursos con profesores y salarios de profesores en Java
# University Tracker – Proyecto Final Módulo Java Basics

Este proyecto fue desarrollado como entrega final del módulo Java Basics. El objetivo es construir un sistema en Java para gestionar la información de profesores, estudiantes y clases de una universidad.

## Descripción general

El sistema permite registrar profesores de tiempo completo y medio tiempo, estudiantes y clases. Cada clase está asociada a un profesor y un grupo de estudiantes. El sistema también ofrece un menú que permite visualizar la información, agregar estudiantes y clases, y consultar en qué clases está inscrito un estudiante.

## Reglas del sistema

- Los profesores de tiempo completo tienen un salario que se calcula multiplicando su salario base por el 110% de sus años de experiencia.
- Los profesores de medio tiempo tienen un salario que se calcula multiplicando su salario base por la cantidad de horas activas por semana.
- Cada estudiante tiene un nombre, un número de identificación y una edad.
- Cada clase tiene un nombre, un salón asignado, un profesor y una lista de estudiantes.

## Funcionalidades del menú

1. Mostrar todos los profesores registrados con sus datos.
2. Mostrar todas las clases existentes y permitir seleccionar una para ver sus detalles, incluyendo profesor y estudiantes.
3. Crear un nuevo estudiante y agregarlo a una clase existente.
4. Crear una nueva clase seleccionando un profesor y estudiantes ya registrados.
5. Consultar todas las clases en las que está inscrito un estudiante, buscando por su número de identificación.
6. Salir del programa.

## Estructura del proyecto


## Requisitos cumplidos del proyecto

- Se implementó un diagrama de diseño del sistema (UML).
- Se usaron modificadores de acceso adecuados.
- Se aplicó encapsulamiento a los atributos de las clases.
- Se implementó herencia (clase `Teacher` con sus subclases `FullTimeTeacher` y `PartTimeTeacher`).
- Se aplicó polimorfismo sobrescribiendo métodos.
- Se utilizaron constructores con y sin parámetros.
- Se implementaron métodos estáticos donde fueron necesarios.
- Se creó una clase principal (`Main`) que ejecuta el programa.
- El proyecto está organizado en paquetes por capas: modelo, servicio, ejecución principal y utilidades.
- Se separaron claramente los datos del modelo de la lógica de impresión y entrada.

## Observaciones

El proyecto fue desarrollado usando buenas prácticas básicas de Java y organización por capas. La lógica del negocio se encuentra en la clase `UniversityService`, mientras que la interacción con el usuario se gestiona desde la clase `Main`.
