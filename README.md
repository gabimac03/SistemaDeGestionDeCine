🎬 Sistema de Gestion de Cine 🎟️
-----------------------------------
Este es un sistema de gestión para un cine desarrollado en Java, que permite administrar empleados, salas, funciones, películas, ventas y clientes.
-----------------------------------
🚀 Características principales

✔ Gestión de empleados del cine (nombre, DNI, etc.).

✔ Registro de películas con su respectivo género.

✔ Manejo de funciones (horario, sala y película asignada).

✔ Administración de salas y salas VIP.

✔ Venta de entradas, asociando clientes y funciones.

✔ Impresión de detalles de las ventas realizadas.

🛠 Tecnologías utilizadas
Java – Lenguaje principal del proyecto.

Colecciones (ArrayList) – Para almacenar y gestionar listas de datos.

POO (Programación Orientada a Objetos) – Aplicación de clases y objetos.

📌 Estructura del proyecto
bash

Copiar

Editar
📂 src/

 ┣ 📂 models/         # Clases principales del modelo (Cine, Película, Sala, Funcion, etc.)
 
 ┣ 📂 services/       # Lógica de negocio y manipulación de datos
 
 ┣ 📂 utils/          # Métodos auxiliares y utilitarios


 ┗ 📜 Main.java       # Punto de entrada del programa
 
🏁 Cómo ejecutar el proyecto

Clonar el repositorio
----------------------
bash
Copiar

Editar

git clone https://github.com/tuusuario/sistema-gestion-cine.git

cd sistema-gestion-cine

Compilar y ejecutar
---------------------
bash

Copiar

Editar

javac src/Main.java -d out

java -cp out Main
----------------------------------------------------------------------
📌 Próximas mejoras

✅ Implementar persistencia en base de datos (MySQL o MongoDB).

✅ Crear una interfaz gráfica con JavaFX o Swing.

✅ Agregar autenticación de usuarios (roles: administrador, cliente).
