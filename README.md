<h1 align="center">Spring Boot</h1>
<p><b>Spring Boot</b> es un framework basado en Spring que simplifica el desarrollo de aplicaciones <b>Java</b>, especialmente aplicaciones web y servicios RESTful. Su objetivo principal es reducir la complejidad de configuración manual, proporcionando una forma rápida y eficiente de crear aplicaciones robustas y escalables.</p>

<h3>Características principales:</h3>

- <b>Configuración automática (Auto-Configuration)</b>: Configura automáticamente los componentes de una aplicación en función de las dependencias presentes en el proyecto.
- <b>Servidor embebido</b>: Incluye servidores como Tomcat, Jetty o Undertow, lo que elimina la necesidad de desplegar manualmente aplicaciones en un servidor externo.
- <b>Sistema de dependencias simplificado</b>: Utiliza Spring Boot Starter Dependencies para incluir configuraciones predefinidas según las necesidades del proyecto.
- <b>Soporte para pruebas</b>: Integra herramientas para realizar pruebas unitarias y de integración fácilmente.
- <b>Creación rápida</b>: Genera proyectos iniciales con configuraciones básicas a través de Spring Initializr.

<h3>¿Para qué se usa?</h3>

- <b>Aplicaciones web</b>: Desarrollo de aplicaciones con interfaces dinámicas y backend robusto.
- <b>Servicios RESTful</b>: Creación de API para integrar sistemas o aplicaciones.
- <b>Microservicios</b>: Es ideal para el desarrollo de arquitecturas de microservicios por su facilidad de configuración y despliegue independiente.
- <b>Aplicaciones empresariales</b>: Desarrollo de sistemas complejos con acceso a bases de datos, mensajería, y más.

<h1 align="center">Spring Framework</h1>
<p><b>Spring Framework</b> es un framework de código abierto para el desarrollo de aplicaciones Java empresariales. Es modular y versátil, diseñado para simplificar la creación de aplicaciones robustas, escalables y fáciles de mantener, ofreciendo herramientas para resolver problemas comunes en el desarrollo empresarial.</p>

<h3>Características principales:</h3>

- <b>Inyección de dependencias (DI)</b>: Implementa el patrón de inversión de control (IoC) para gestionar objetos y sus dependencias, lo que promueve un código modular y fácilmente testeable.
- <b>Programación orientada a aspectos (AOP)</b>: Permite manejar funcionalidades transversales, como la seguridad, el registro de actividades y la gestión de transacciones, sin afectar el código principal.
- <b>Acceso simplificado a bases de datos</b>: Proporciona herramientas como Spring JDBC y soporte para ORM como Hibernate.
- <b>Flexibilidad y modularidad</b>: Es modular, por lo que se puede usar solo los componentes que se necesitan (por ejemplo, Spring MVC, Spring Data, Spring Security, etc.).
- <b>Compatibilidad con múltiples entornos</b>: Funciona tanto para aplicaciones locales como distribuidas, en la nube o microservicios.

<h3>¿Para qué se usa?</h3>

- <b>Desarrollo de aplicaciones empresariales</b>: Proyectos complejos que requieren escalabilidad y robustez.
- <b>Creación de APIs y servicios web</b>: Desarrollo de aplicaciones RESTful y SOAP.
- <b>Microservicios</b>: Base para el desarrollo de arquitecturas modernas gracias a su soporte para Spring Boot.
- <b>Gestión de transacciones y datos</b>: Manejo de bases de datos y operaciones transaccionales de manera segura.
- <b>Seguridad</b>: Implementación de autenticación y autorización en aplicaciones con Spring Security.

<h3>Diferencias clave entre Spring Boot y Spring Framework</h3>

| **Aspecto**               | **Spring Framework**                           | **Spring Boot**                                    |
|---------------------------|-----------------------------------------------|--------------------------------------------------|
| **Configuración**         | Manual (XML o anotaciones).                   | Automática con *Auto-Configuration*.            |
| **Enfoque**               | Flexible y modular, pero con más esfuerzo.    | Opinión por defecto para empezar rápido.        |
| **Servidor web**          | Externo (Tomcat, Jetty, etc.).                | Embebido por defecto.                           |
| **Dependencias**          | Se deben seleccionar y configurar manualmente.| Incluye dependencias predefinidas (*Starters*). |
| **Inicio rápido**         | Menos optimizado para proyectos pequeños.     | Ideal para proyectos rápidos o microservicios.  |
