<h1 align="center">Java + Spring Boot</h1>
<p>Este es mi primer proyecto utilizando <b>Spring Boot</b>, y me ha servido como una excelente introducción al framework. El objetivo de este proyecto es aplicar operaciones <b>CRUD</b> (Crear, Leer, Actualizar, Eliminar) a una <b>Base de Datos</b> de usuarios, utilizando las herramientas y tecnologías que <b>Spring Boot</b> proporciona para desarrollar aplicaciones web de manera rápida y eficiente.</p>

<h2><ins>Descripción del Proyecto</ins></h2>
<p>El proyecto implementa una <b>API RESTful</b> que permite gestionar una <b>Base de Datos</b> de usuarios, realizando operaciones <b>CRUD</b> sobre los datos. La <b>Base de Datos</b> utilizada es <b>MySQL</b> y la interfaz del sistema está generada dinámicamente con <b>Thymeleaf</b>, lo que facilita la creación de vistas en el lado del servidor.</p>

<h2><ins>Características Principales del Proyecto</ins></h2>

- **Operaciones CRUD**: Implementación de operaciones para **crear**, **leer**, **actualizar** y **eliminar** usuarios desde una **Base de Datos MySQL** a través de una **API RESTful**.
- **Interfaz Web Dinámica**: Uso de **Thymeleaf** para renderizar vistas dinámicas y hacer la interfaz amigable para el usuario.
- **Validación de Datos**: **Spring Validation** se utiliza para garantizar que los datos ingresados por los usuarios sean válidos y correctos.
- **Seguridad Básica**: Implementación de **Spring Security** para asegurar que solo los usuarios autorizados puedan realizar ciertas operaciones.

<h2><ins>Imagenes del Proyecto</ins></h2>

<h1 align="center">Spring Boot</h1>
<p><b>Spring Boot</b> es un framework basado en <b>Spring</b> que simplifica el desarrollo de aplicaciones <b>Java</b>, especialmente aplicaciones web y servicios RESTful. Su objetivo principal es reducir la complejidad de configuración manual, proporcionando una forma rápida y eficiente de crear aplicaciones robustas y escalables.</p>

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

<h1 align="center">Clase Controlador (UserController)</h1>

La clase `UserController` es un ***controlador*** **Spring MVC** que gestiona las operaciones relacionadas con la entidad `User`. Su función principal es proporcionar puntos de acceso para **listar**, **crear**, **editar** y **eliminar** usuarios. Este ***controlador*** también administra las **vistas** correspondientes para cada operación y utiliza `SessionAttributes` para mantener datos temporales de **usuario** durante la ***sesión***.

<h3><ins>Anotaciones en la clase 'UserController'</ins></h3>

```java
@Controller
@RequestMapping("/users")
@SessionAttributes({"user"})
public class UserController {

}
```
- `@Controller`
  - **Significado**: Esta anotación marca la clase como un ***controlador*** **Spring MVC**. Indica que la clase ***maneja solicitudes web y devuelve vistas o datos como respuesta***.
  - **Funcionamiento**: Spring detecta esta clase durante el escaneo del contexto y la registra como un componente que ***gestiona las solicitudes HTTP***.
- `@RequestMapping("/users")`
  - **Significado**: Especifica la ***URL base*** o prefijo para las rutas que manejará esta clase. En este caso, todas las rutas definidas en la clase tendrán como prefijo `/users`.
- `@SessionAttributes({"user"})`
  - **Significado**: Indica que el atributo especificado (en este caso, `"user"`) se almacenará en la **sesión HTTP** mientras dure la interacción del **usuario** con el ***controlador***.
  - **Funcionamiento**: Los datos almacenados en la **sesión** están disponibles entre **solicitudes HTTP** en un contexto temporal, lo cual es útil para mantener información mientras el usuario interactúa con formularios. Cuando se llama a `SessionStatus.setComplete()`, el atributo almacenado en la sesión es eliminado.

<h3><ins>Anotaciones @GetMapping y @PostMapping</ins></h3>

- `@GetMapping`: Anotación utilizada para mapear **solicitudes HTTP GET** a un ***método*** del **controlador**. Se usa generalmente para ***obtener y mostrar información en una vista***, como cargar formularios o listar datos.
- `@PostMapping`: Anotación utilizada para mapear **solicitudes HTTP POST** a un ***método*** del **controlador**. Se emplea principalmente para ***enviar datos al servidor***, como procesar formularios o realizar operaciones de creación y actualización en la base de datos.

<h3><ins>Atributos y Métodos de la clase 'UserController'</ins></h3>

- `service`
```java
    private final UserService service;

    public UserController(UserService service) { /*Para inyectar de forma automática UserService*/
        this.service = service;
    }
```
**<ins>Descripción</ins>**: Instancia de `UserService` que gestiona la lógica de negocio y el acceso a la **Base de Datos** de **usuarios**. Se inyecta automáticamente mediante el constructor.

- `view(Model model)`
```java
    @GetMapping({"/view", "/another"})
    public String view(Model model) {
        model.addAttribute("title", "1 - Spring Boot - MVC");
        model.addAttribute("message", "Esta es una aplicación de ejemplo usando Spring Boot!!!");
        model.addAttribute("user", new User("Cristian", "Cirstaldo"));
        return "view";
    }
```
**<ins>Descripción</ins>**: El método `view(Model model)` maneja las **solicitudes GET** a las rutas `"/view"` y `"/another"`, utilizando el objeto `Model` para agregar atributos como `title`, `message` y un objeto `User`. Luego, retorna el nombre de la **vista** `view`, que será renderizada con **Thymeleaf**. En **Spring Boot** con **Thymeleaf**, ***el valor de retorno debe coincidir con el nombre de la plantilla sin la extensión .html***.

- `list(Model model)`
```java
    @GetMapping
    public String list(Model model) {
        model.addAttribute("title", "Listado de Usuarios");
        model.addAttribute("users", service.findAll());
        return "list";
    }
```
**<ins>Descripción</ins>**: El método `list(Model model)` maneja las **solicitudes GET** a la raíz de la aplicación (`http://localhost:8080/`), utilizando el objeto `Model` para agregar los **atributos** `title`, con el título de la página, y `users`, que contiene la lista de usuarios obtenida mediante el método `findAll()` del atributo `service`. Luego, retorna el nombre de la vista `list`, que será renderizada con **Thymeleaf**.

- `String form(Model model)`
```java
    @GetMapping("/form")
    public String form(Model model) {
        model.addAttribute("title", "Crear Usuario");
        model.addAttribute("user", new User());
        return "form";
    }
```
**<ins>Descripción</ins>**: El método `form(Model model)` maneja las **solicitudes GET** a la ruta `"/form"`, ***permitiendo visualizar el formulario para crear un nuevo usuario***. Utiliza el objeto `Model` para agregar los **atributos** `title`, con el título de la página, y `user`, ***que es una nueva instancia de*** `User`. Luego, retorna el nombre de la vista `form`, que será renderizada con **Thymeleaf**.

- `form(@PathVariable Long id, Model model, RedirectAttributes redirect)`
```java
    @GetMapping("/form/{id}")   /*form se 'visualiza' con el método Get pero en este caso con el objetivo de 'editar'*/
    public String form(@PathVariable Long id, Model model, RedirectAttributes redirect) {

        Optional<User> optionalUser = service.finById(id);

        if (optionalUser.isPresent()) {
            model.addAttribute("title", "EDITAR Usuario");
            model.addAttribute("user", optionalUser.get());
            return "form";
        } else {
            redirect.addFlashAttribute("error",
                    "El usuario con el id: " + id + " NO EXISTE en la Base de Datos");
            return "redirect:/users";
        }
    }
```

- `form(@Valid User user, BindingResult result, Model model, RedirectAttributes redirect, SessionStatus status)`
```java
    @PostMapping
    public String form(@Valid User user, BindingResult result, Model model, RedirectAttributes redirect, SessionStatus status) {

        if (result.hasErrors()) {
            model.addAttribute("title", "Validando Formulario");
            return "form";
        }

        String message = user.getId() != null && user.getId() > 0 ?
                "El usuario: " + user.getName() + " se ha ACTUALIZADO con éxito!"
                :"El usuario: " + user.getName() + " se ha CREADO con éxito!";

        service.save(user);
        status.setComplete();
        redirect.addFlashAttribute("success", message);
        return "redirect:/users";
    }
```
**<ins>Descripción</ins>**: El método `form(User user, BindingResult result, Model model, RedirectAttributes redirect, SessionStatus status)` maneja las **solicitudes POST**, permitiendo ***procesar el formulario de creación o actualización de un usuario***. Si el objeto `user` contiene ***errores de validación***, se regresa a la vista `form` con un título de validación. Si los datos son correctos, el usuario se guarda en la **Base de Datos** y se genera un mensaje de éxito, diferenciando entre creación y actualización según el valor de `id`. Esto se logra gracias al método `service.save(user);`, que determina automáticamente si debe realizar un **INSERT** o **UPDATE** sin necesidad de lógica adicional. Si el `id` es nulo o no existe, realiza una **creación** del usuario; de lo contrario, realiza una **actualización** del registro existente.
El método también utiliza `status.setComplete();`, que ***finaliza la sesión de la conversación*** en **Spring MVC** cuando se usa la anotación `@SessionAttributes`. Esto garantiza que los datos del usuario no queden almacenados en la sesión después de completar la operación, evitando posibles inconsistencias o reutilización de datos en futuras solicitudes.
Finalmente, se redirige a la dirección principal con un mensaje de confirmación.

- `delete(@PathVariable Long id, RedirectAttributes redirect)`
```java
    @GetMapping("/delete/{id}")
    public String delete(@PathVariable Long id, RedirectAttributes redirect) {

        Optional<User> optionalUser = service.finById(id);

        if (optionalUser.isPresent()) {
            service.remove(id);
            redirect.addFlashAttribute("success",
                    "El usuario: " + optionalUser.get().getName() + " se ha ELIMINADO con éxito!");
            return "redirect:/users";
        }

        redirect.addFlashAttribute("error",
                "El usuario con el id: " + optionalUser.get().getId() + " NO EXISTE en el sistema");
        return "redirect:/users";
    }
```
<ins>Descripción</ins>: El método `delete(@PathVariable Long id, RedirectAttributes redirect)` maneja las **solicitudes GET** para eliminar un usuario basado en su `id`, ***pasando este valor como parámetro en la URL***. Si el usuario con el `id` especificado existe en la **Base de Datos**, se elimina y se agrega un mensaje de éxito con el nombre del usuario a los atributos de redirección. Luego, se redirige a la vista de listado de usuarios (`/users`). Si el usuario no existe, se agrega un mensaje de error y también se redirige a la misma vista. Esta operación asegura que, después de realizar la **eliminación**, la información más actualizada de los usuarios se muestre al usuario final.

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
