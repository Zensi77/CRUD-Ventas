# Sistema de Gestión de Ventas para Comercio

¡Bienvenido al repositorio del Sistema de Gestión de Ventas para Comercio! Este proyecto es una aplicación Java diseñada para ayudar a los comercios a gestionar sus ventas de manera eficiente.

## Descripción

El Sistema de Gestión de Ventas para Comercio es una aplicación Java que ofrece funcionalidades clave para la gestión de ventas, incluyendo:

- Registro de productos y clientes.
- Realización de ventas.
- Generación de reportes de ventas.
- Gestión de inventario.

## Requisitos

Para ejecutar la aplicación en tu entorno local, necesitarás tener instalado:

- Java Development Kit (JDK) 8 o superior.
- Un servidor de base de datos MySQL.

## Configuración

1. Clona este repositorio en tu máquina local.
2. Importa el proyecto en tu IDE de preferencia.
3. Configura la conexión a la base de datos en la clase `Constants.java`, asi como la ruta en tu maquina local, se han tenido que usar rutas absolutas. 
    - Asegúrate de cambiar las rutas absolutas por las correspondientes a tu entorno local.

## Base de Datos

El archivo `database.sql` contiene el script SQL necesario para crear la base de datos y cargar datos de prueba. 
¡No olvides ejecutar este script en tu servidor de base de datos antes de ejecutar la aplicación!

## Ejecución

Una vez configurada la conexión a la base de datos, puedes ejecutar la aplicación desde tu IDE o mediante el siguiente comando en la terminal:

## Demo de la aplicacion

Enlace demo de la aplicacion: https://youtu.be/GhH9JhdV2Do

```bash
java -jar gestion-ventas.jar

