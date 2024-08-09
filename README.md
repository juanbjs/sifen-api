# SIFEN-API

SIFEN-API es un proyecto de código abierto desarrollado en Java, utilizando el framework Spring. Esta API está diseñada para facilitar la integración con el Sistema Integrado de Facturación Electrónica Nacional (SIFEN) en Paraguay, utilizando la librería [RSHK jsifenlib](https://github.com/roshkadev/rshk-jsifenlib) de [roshkadev](https://github.com/roshkadev).

## Características

- Integración SIFEN: Proporciona una API sencilla y robusta para interactuar con el SIFEN.
- Configuración basada en Spring: Aprovecha las características del framework Spring para una configuración flexible y escalable.
- Código Abierto: Disponible para la comunidad, permitiendo contribuciones y mejoras continuas.

## Requisitos
- Java 22 o superior
- Maven para la gestión de dependencias
- Spring Boot 3.3.2 o superior

## Instalación

1. Clona el repositorio:
    ```bash
    git clone https://github.com/juanbjs/sifen-api.git
    cd sifen-api
    ```
2. Configura las dependencias:
    ```bash
    mvn clean install
    ```
3. Configura las propiedades:

    Ajusta el archivo application.properties o application.yml en el directorio src/main/resources con las configuraciones necesarias para tu entorno (ej. configuraciones de base de datos, claves API, etc.).

4. Ejecuta la aplicación:
    ```bash
    mvn spring-boot:run
    ```

## Uso
La API proporciona varios endpoints para interactuar con el SIFEN. Puedes consultar la documentación de la API generada automáticamente por Swagger /swagger-ui/index.html.

## Contribuciones
Las contribuciones son bienvenidas. Si deseas mejorar el proyecto, sigue estos pasos:

1. Forkea el repositorio.
2. Crea una rama para tu funcionalidad (git checkout -b feature/nueva-funcionalidad).
3. Commitea tus cambios (git commit -m 'Agrega nueva funcionalidad').
4. Envía tu rama al repositorio principal (git push origin feature/nueva-funcionalidad).
5. Abre un Pull Request.

## Licencia
Este proyecto está licenciado bajo la Licencia MIT. Consulta el archivo LICENSE para más detalles.

## Agradecimientos
Este proyecto se basa en la librería [RSHK jsifenlib](https://github.com/roshkadev/rshk-jsifenlib), desarrollada por [roshkadev](https://github.com/roshkadev), a quien agradecemos por su excelente trabajo y contribución a la comunidad.

## Contacto
Para preguntas, problemas o sugerencias, no dudes en abrir un issue en el repositorio o contactarme directamente a través de [LinkedIn](https://www.linkedin.com/in/zarate-juan/).