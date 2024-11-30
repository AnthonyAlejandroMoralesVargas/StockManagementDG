# Especificación de Tecnologías y Herramientas

## Objetivo:

Este documento tiene como objetivo especificar las tecnologías y herramientas que se utilizarán en el desarrollo de la aplicación de escritorio para gestionar acciones.

---

## 1. Lenguaje de Programación

El lenguaje de programación elegido para el desarrollo de esta aplicación es Java, debido a su amplia documentación, su activa comunidad y la gran cantidad de librerías y frameworks disponibles. Entre estas razones, la existencia de JavaFX destaca como una de las más relevantes, ya que es uno de los frameworks más utilizados para crear interfaces gráficas de usuario. Además, Java ofrece diversas bibliotecas para interactuar con APIs RESTful, lo que, sumado a su flexibilidad para gestionar solicitudes HTTP y analizar respuestas en formato JSON, facilita la integración con servicios externos de manera eficiente.

## 2. Desarrollo del Frontend

El entorno de desarrollo integrado (IDE) utilizado para desarrollar el frontend de la aplicación es Apache NetBeans, puesto que es ideal para trabajar con Java y proporciona soporte completo para el desarrollo de interfaces gráficas de usuario (GUI) mediante tecnologías como JavaFX.

## 3. Desarrollo del Backend

El IDE principal para el desarrollo del backend es IntelliJ IDEA, dado que proporciona un entorno potente para el desarrollo en Java, con soporte integrado para herramientas de construcción como Maven.

## 4. Control de dependencias

Maven será la herramienta de gestión de dependencias que se utilizará para facilitar la construcción y administración del proyecto, asegurando que las bibliotecas y dependencias necesarias estén correctamente gestionadas.

## 5. Control de Versiones

Git será el sistema de control de versiones que se utilizará para llevar un registro de todos los cambios en el código fuente, gestionar ramas para nuevas funcionalidades y facilitar la colaboración entre los miembros del equipo. Esto en compañia de GitHub que servirá como el repositorio principal para almacenar el código fuente.

## 6. API de Alpha Vantage

La API de Alpha Vantage proporcionará los precios de las acciones en tiempo real. Utilizando esta API, el backend de la aplicación podrá obtener información actualizada sobre los precios de las acciones.

#### 1.6 Manejo de Datos

El formato en el que la API de Alpha Vantage devuelve los datos será JSON. La aplicación utilizará la librería como org.json para parsear las respuestas JSON y extraer la información necesaria.
