<h1 align="center">Spring Boot</h1>
<p><b>Spring Boot</b> es un framework basado en Spring que simplifica el desarrollo de aplicaciones <b>Java</b>, especialmente aplicaciones web y servicios RESTful. Su objetivo principal es reducir la complejidad de configuración manual, proporcionando una forma rápida y eficiente de crear aplicaciones robustas y escalables.</p>

<p>En programación, un <b>'framework'</b> es un conjunto de herramientas, bibliotecas y buenas prácticas diseñadas para facilitar el desarrollo de software. Proporciona una estructura predefinida sobre la cual los desarrolladores pueden construir sus aplicaciones sin tener que escribir todo desde cero.</p>

<h3><ins>Características principales de un <b>'framework'</b></ins>:</h3>

- <b>Estructura predefinida</b>: Proporciona una arquitectura base para el desarrollo de aplicaciones.
- <b>Código reutilizable</b>: Incluye funciones y bibliotecas listas para usar.
- <b>Convención sobre configuración</b>: En muchos casos, sigue principios como "convención sobre configuración", lo que reduce la cantidad de configuraciones manuales necesarias.
- <b>Modularidad</b>: Permite extender o modificar su funcionalidad con módulos o plugins.
- <b>Automatización de tareas comunes</b>: Manejo de bases de datos, seguridad, autenticación, enrutamiento, etc.

<p>Un <b>'framework'</b> no es lo mismo que una biblioteca, ya que impone una forma específica de organizar y estructurar el código, mientras que una biblioteca solo proporciona funcionalidades específicas sin imponer una estructura.</p>

<h3><ins>Características principales de <b>'Spring Boot'</b></ins>:</h3>

- <b>Configuración automática (Auto-Configuration)</b>: Configura automáticamente los componentes de una aplicación en función de las dependencias presentes en el proyecto.
- <b>Servidor embebido</b>: Incluye servidores como Tomcat, Jetty o Undertow, lo que elimina la necesidad de desplegar manualmente aplicaciones en un servidor externo.
- <b>Sistema de dependencias simplificado</b>: Utiliza Spring Boot Starter Dependencies para incluir configuraciones predefinidas según las necesidades del proyecto.
- <b>Soporte para pruebas</b>: Integra herramientas para realizar pruebas unitarias y de integración fácilmente.
- <b>Creación rápida</b>: Genera proyectos iniciales con configuraciones básicas a través de Spring Initializr.

<h3><ins>¿Para qué se usa?</ins></h3>

- <b>Aplicaciones web</b>: Desarrollo de aplicaciones con interfaces dinámicas y backend robusto.
- <b>Servicios RESTful</b>: Creación de API para integrar sistemas o aplicaciones.
- <b>Microservicios</b>: Es ideal para el desarrollo de arquitecturas de microservicios por su facilidad de configuración y despliegue independiente.
- <b>Aplicaciones empresariales</b>: Desarrollo de sistemas complejos con acceso a bases de datos, mensajería, y más.

<h1 align="center">Spring Framework</h1>
<p><b>Spring Framework</b> es un framework de código abierto para el desarrollo de aplicaciones Java empresariales. Es modular y versátil, diseñado para simplificar la creación de aplicaciones robustas, escalables y fáciles de mantener, ofreciendo herramientas para resolver problemas comunes en el desarrollo empresarial.</p>

<h3><ins>Características principales</ins>:</h3>

- <b>Inyección de dependencias (DI)</b>: Implementa el patrón de inversión de control (IoC) para gestionar objetos y sus dependencias, lo que promueve un código modular y fácilmente testeable.
- <b>Programación orientada a aspectos (AOP)</b>: Permite manejar funcionalidades transversales, como la seguridad, el registro de actividades y la gestión de transacciones, sin afectar el código principal.
- <b>Acceso simplificado a bases de datos</b>: Proporciona herramientas como Spring JDBC y soporte para ORM como Hibernate.
- <b>Flexibilidad y modularidad</b>: Es modular, por lo que se puede usar solo los componentes que se necesitan (por ejemplo, Spring MVC, Spring Data, Spring Security, etc.).
- <b>Compatibilidad con múltiples entornos</b>: Funciona tanto para aplicaciones locales como distribuidas, en la nube o microservicios.

<h3><ins>¿Para qué se usa?</ins></h3>

- <b>Desarrollo de aplicaciones empresariales</b>: Proyectos complejos que requieren escalabilidad y robustez.
- <b>Creación de APIs y servicios web</b>: Desarrollo de aplicaciones RESTful y SOAP.
- <b>Microservicios</b>: Base para el desarrollo de arquitecturas modernas gracias a su soporte para Spring Boot.
- <b>Gestión de transacciones y datos</b>: Manejo de bases de datos y operaciones transaccionales de manera segura.
- <b>Seguridad</b>: Implementación de autenticación y autorización en aplicaciones con Spring Security.

<h3><ins>Diferencias clave entre <b>'Spring Boot'</b> y <b>'Spring Framework'</b></ins></h3>

| **Aspecto**               | **Spring Framework**                           | **Spring Boot**                                    |
|---------------------------|-----------------------------------------------|--------------------------------------------------|
| **Configuración**         | Manual (XML o anotaciones).                   | Automática con *Auto-Configuration*.            |
| **Enfoque**               | Flexible y modular, pero con más esfuerzo.    | Opinión por defecto para empezar rápido.        |
| **Servidor web**          | Externo (Tomcat, Jetty, etc.).                | Embebido por defecto.                           |
| **Dependencias**          | Se deben seleccionar y configurar manualmente.| Incluye dependencias predefinidas (*Starters*). |
| **Inicio rápido**         | Menos optimizado para proyectos pequeños.     | Ideal para proyectos rápidos o microservicios.  |

<h1 align="center">pom.xml (dependencies)</h1>

- `spring-boot-starter-data-jpa`: Proporciona soporte para trabajar con **JPA** (Java Persistence API). Incluye herramientas para implementar repositorios y gestionar la persistencia de datos con ***bases de datos relacionales***.
- `mysql-connector-j`: Driver **JDBC** para conectar la aplicación con una base de datos **MySQL**. Se utiliza para establecer la comunicación entre la aplicación y la base de datos.
- `spring-boot-starter-web`: Incluye todo lo necesario para construir aplicaciones web. Proporciona soporte para controladores **REST**, servidores web embebidos (como **Tomcat**) y manejo de solicitudes **HTTP**.
- `spring-boot-devtools`: Facilita el desarrollo con herramientas como recarga automática de la aplicación al realizar cambios en el código. Se ejecuta en tiempo de desarrollo y es opcional en entornos de producción.
- `spring-boot-starter-test`: Proporciona dependencias necesarias para realizar pruebas en la aplicación, como **JUnit**, **AssertJ**, y **Mockito**. Está configurado específicamente para testear aplicaciones **Spring Boot**.
- `spring-boot-starter-actuator`: Añade **endpoints** para monitorizar y gestionar la aplicación en tiempo de ejecución. Proporciona información sobre métricas, estado de salud y estadísticas.
- `spring-boot-starter-thymeleaf`: Incluye todo lo necesario para trabajar con **Thymeleaf**, un motor de plantillas para generar vistas dinámicas en aplicaciones web.
- `spring-boot-starter-validation`: Proporciona soporte para la validación de datos mediante anotaciones estándar como `@Valid` o `@NotNull`, facilitando la validación en controladores y entidades.

<h1 align="center">'application.properties' y 'Application'</h1>
<h2>application.properties</h2>
<p>Este archivo contiene la configuración de la aplicación <b>Spring Boot</b>, permitiendo personalizar su comportamiento sin modificar el código fuente</p>

```properties
spring.application.name=1-springboot-mvc
spring.thymeleaf.prefix=classpath:/templates/
spring.thymeleaf.suffix=.html
spring.thymeleaf.mode=HTML
spring.datasource.url=jdbc:mysql://localhost:3306/db_springboot 
spring.datasource.username=root
spring.datasource.password=sasa
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
spring.jpa.show-sql=true
spring.jpa.hibernate.ddl-auto=update
```

<h3><ins>Funciones principales</ins>:</h3>

- Configuración del nombre de la aplicación:
  - `spring.application.name=1-springboot-mvc`: Define el nombre de la aplicación dentro del contexto de **Spring**.
- Configuración de **Thymeleaf** (motor de plantillas):
  - `spring.thymeleaf.prefix=classpath:/templates/` → Indica la ubicación de las plantillas HTML.
  - `spring.thymeleaf.suffix=.html` → Define la extensión de los archivos de vista.
  - `spring.thymeleaf.mode=HTML` → Especifica el modo de procesamiento de las plantillas.
- Configuración de la base de datos **MySQL**:
  - `spring.datasource.url=jdbc:mysql://localhost:3306/db_springboot` → Define la URL de conexión.
  - `spring.datasource.username=root` → Usuario de la base de datos.
  - `spring.datasource.password=sasa` → Contraseña de la base de datos.
  - `spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver` → Define el driver de **MySQL** que usará **Spring Boot**.
- Configuración de **JPA** e **Hibernate**:
  - `spring.jpa.show-sql=true` → Muestra las consultas **SQL** ejecutadas en la consola.
  - `spring.jpa.hibernate.ddl-auto=update` → Permite que **Hibernate** actualice automáticamente la estructura de la base de datos.

<h2>Application.java</h2>
<p>Esta es la clase principal de la aplicación <b>Spring Boot</b>. Su función es iniciar la aplicación y configurar automáticamente todos los componentes de <b>Spring</b>.</p>

```java
package com.ccristian.springboot.springmvc.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
```

<h3><ins>Funciones principales</ins>:</h3>

- `@SpringBootApplication`
  - Indica que esta es la clase de inicio de **Spring Boot**.
  - Habilita la configuración automática (`@EnableAutoConfiguration`).
  - Escanea los componentes (`@ComponentScan`).
  - Configura la persistencia (`@EnableJpaRepositories`).
- Método `main`
  - Llama a `SpringApplication.run(Application.class, args);`
  - Esto inicia el contexto de **Spring** y arranca el servidor web embebido (**Tomcat** por defecto).

<h1 align="center">Controlador (UserController)</h1>

La clase `UserController` es un controlador Spring MVC que gestiona las operaciones relacionadas con la entidad `User`. Su función principal es proporcionar puntos de acceso para listar, crear, editar y eliminar usuarios. Este controlador también administra las vistas correspondientes para cada operación y utiliza `SessionAttributes` para mantener datos temporales de usuario durante la sesión.

<h3><ins>Anotaciones en la clase UserController</ins></h3>

- `@Controller`
  - Significado:
    - Esta anotación marca la clase como un controlador Spring MVC. Indica que la clase maneja solicitudes web y devuelve vistas o datos como respuesta.
  - Funcionamiento:
    - Spring detecta esta clase durante el escaneo del contexto y la registra como un componente que gestiona las solicitudes HTTP.

- `@RequestMapping("/users")`
  - Significado:
    - Especifica la URL base o prefijo para las rutas que manejará esta clase. En este caso, todas las rutas definidas en la clase tendrán como prefijo `/users`.

- `@SessionAttributes({"user"})`
  - Significado:
    - Indica que el atributo especificado (en este caso, `"user"`) se almacenará en la sesión HTTP mientras dure la interacción del usuario con el controlador.
  - Funcionamiento:
    - Los datos almacenados en la sesión están disponibles entre solicitudes HTTP en un contexto temporal, lo cual es útil para mantener información mientras el usuario interactúa con formularios. Cuando se llama a `SessionStatus.setComplete()`, el atributo almacenado en la sesión es eliminado.

<h3><ins>Métodos de la clase 'UserController'</ins></h3>

<h3>Clase 'Model'</h3>
<p>La clase `Model` en Spring MVC tiene la función principal de <b>almacenar atributos que se pasan a la vista</b> (generalmente un archivo de plantilla como un archivo HTML con <b>Thymeleaf</b>). Esta clase proporciona una forma de agregar datos a la vista y es utilizada con frecuencia en los <b>controladores</b> para enviar información al frontend.</p>

<h1 align="center">Estructura del Proyecto</h1>

- ***src.main***
  - ***java***
    - ***com.ccristian.springboot.springmvc.app***
      - `Application.java`: Clase principal que inicia la aplicación **Spring Boot**. Contiene el método `main` que ejecuta `SpringApplication.run()`, arrancando el servidor y configurando el contexto de la aplicación.
      - ***controllers***
        - `UserController.java`: Controlador que maneja las solicitudes **HTTP** relacionadas con los usuarios. Contiene métodos para **listar**, **crear**, **editar**, **eliminar** y **visualizar** usuarios. Utiliza `UserService` para interactuar con la **base de datos** y las vistas **Thymeleaf** para mostrar los datos al usuario. Implementa ***validaciones en los formularios*** de **creación** y **edición** de usuarios.
      - ***entities***
        - `User.java`: Contiene atributos y está mapeada a la tabla `users` en la **base de datos**. Incluye **validaciones** sobre los campos y además, define un método `prePersist()` que ***establece la fecha de creación antes de insertar un nuevo usuario en la base de datos***.
     - ***repositories***
       - `UserRepository.java`: Interfaz que extiende `CrudRepository` de **Spring Data JPA**, ***proporcionando métodos CRUD básicos para interactuar con la base de datos*** y realizar operaciones sobre la entidad `User`. No es necesario implementar los métodos, ya que **Spring Data JPA** los genera automáticamente. Para mayor informacion sobre metodos personalizados al heredar de `CrudRepository` ir a [Defining Query Methods](https://docs.spring.io/spring-data/jpa/reference/repositories/query-methods-details.html#repositories.query-methods.query-creation), [Query Creation](https://docs.spring.io/spring-data/jpa/reference/jpa/query-methods.html#jpa.query-methods.query-creation) o usando lenguaje de consulta SQL [Using @Query](https://docs.spring.io/spring-data/jpa/reference/jpa/query-methods.html#jpa.query-methods.at-query)
     - ***services***
       - `UserService.java`: Interfaz que define los métodos para la lógica de negocio relacionada con los usuarios.
       - `UserServiceImpl.java`: Implementación de la interfaz `UserService`, encargada de la ***lógica de negocio relacionada con los usuarios**. Actúa como un intermediario entre el controlador y la capa de persistencia, utilizando `UserRepository` para ***interactuar con la base de datos***. Los métodos están anotados con `@Transactional` para garantizar la ***gestión adecuada de las transacciones***. Al centralizar la lógica en esta capa de servicio, se mejora la organización del código, facilitando su mantenimiento y reutilización.
  - ***resources***
    - ***templates***
      - `form.html`: Vista que muestra un formulario para crear o editar un usuario. Utiliza Thymeleaf para el enlazado dinámico de datos con el objeto `user`.
      - `list.html`: Vista que muestra una lista de usuarios en una tabla. Utiliza Thymeleaf para mostrar dinámicamente la información de los usuarios. Además, ofrece opciones para editar o eliminar cada usuario. También incluye alertas para mostrar mensajes de éxito o error.
      - `view.html`: Vista que muestra los detalles de un usuario. Utiliza **Thymeleaf** para enlazar dinámicamente los valores del modelo y mostrarlos en la página.
    - `application.properties`: Archivo de configuración de **Spring Boot**, que establece configuraciones para **Thymeleaf** para las vistas **HTML**, la **base de datos** y habilita la visualización de las **consultas SQL** ejecutadas por Hibernate.
