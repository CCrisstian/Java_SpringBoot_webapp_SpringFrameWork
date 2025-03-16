<h1 align="center">Spring Boot</h1>
<p><b>Spring Boot</b> es un framework basado en Spring que simplifica el desarrollo de aplicaciones <b>Java</b>, especialmente aplicaciones web y servicios RESTful. Su objetivo principal es reducir la complejidad de configuración manual, proporcionando una forma rápida y eficiente de crear aplicaciones robustas y escalables.</p>

<p>En programación, un framework es un conjunto de herramientas, bibliotecas y buenas prácticas diseñadas para facilitar el desarrollo de software. Proporciona una estructura predefinida sobre la cual los desarrolladores pueden construir sus aplicaciones sin tener que escribir todo desde cero.</p>

<h3>Características principales de un framework</h3>:
- <b>Estructura predefinida</b>: Proporciona una arquitectura base para el desarrollo de aplicaciones.
- <b>Código reutilizable</b>: Incluye funciones y bibliotecas listas para usar.
- <b>Convención sobre configuración</b>: En muchos casos, sigue principios como "convención sobre configuración", lo que reduce la cantidad de configuraciones manuales necesarias.
- <b>Modularidad</b>: Permite extender o modificar su funcionalidad con módulos o plugins.
- <b>Automatización de tareas comunes</b>: Manejo de bases de datos, seguridad, autenticación, enrutamiento, etc.

<h3>Características principales de Spring Boot:</h3>

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

<h1 align="center">pom.xml (dependencies)</h1>

- `spring-boot-starter-data-jpa`:
  - Proporciona soporte para trabajar con <b>JPA</b> (Java Persistence API). Incluye herramientas para implementar repositorios y gestionar la persistencia de datos con bases de datos relacionales.
- `mysql-connector-j`:
  - Driver <b>JDBC</b> para conectar la aplicación con una base de datos <b>MySQL</b>. Se utiliza para establecer la comunicación entre la aplicación y la base de datos.
- `spring-boot-starter-web`:
  - Incluye todo lo necesario para construir aplicaciones web. Proporciona soporte para controladores <b>REST</b>, servidores web embebidos (como Tomcat) y manejo de solicitudes <b>HTTP</b>.
- `spring-boot-devtools`:
  - Facilita el desarrollo con herramientas como recarga automática de la aplicación al realizar cambios en el código. Se ejecuta en tiempo de desarrollo y es opcional en entornos de producción.
- `spring-boot-starter-test`:
  - Proporciona dependencias necesarias para realizar pruebas en la aplicación, como JUnit, AssertJ, y Mockito. Está configurado específicamente para testear aplicaciones <b>Spring Boot</b>.
- `spring-boot-starter-actuator`:
  - Añade endpoints para monitorizar y gestionar la aplicación en tiempo de ejecución. Proporciona información sobre métricas, estado de salud y estadísticas.
- `spring-boot-starter-thymeleaf`:
  - Incluye todo lo necesario para trabajar con <b>Thymeleaf</b>, un motor de plantillas para generar vistas dinámicas en aplicaciones web.
- `spring-boot-starter-validation`:
  - Proporciona soporte para la validación de datos mediante anotaciones estándar como `@Valid` o `@NotNull`, facilitando la validación en controladores y entidades.

<h1 align="center">Estructura del Proyecto</h1>

- **src**.**main**
  - **java**
    - **com.ccristian.springboot.springmvc.app**
      - **Application.java**: Clase principal que inicia la aplicación Spring Boot. Contiene el método `main` que ejecuta `SpringApplication.run()`, arrancando el servidor y configurando el contexto de la aplicación.
      - **controllers**
        - UserController.java: Controlador que maneja las solicitudes HTTP relacionadas con los usuarios. Contiene métodos para listar, crear, editar, eliminar y visualizar usuarios. Utiliza `UserService` para interactuar con la base de datos y las vistas Thymeleaf para mostrar los datos al usuario. Implementa validaciones en los formularios de creación y edición de usuarios.
      - **entities**
        - User.java: Entidad que representa a un usuario en la aplicación. Contiene atributos y está mapeada a la tabla `users` en la base de datos. Incluye validaciones sobre los campos y además, define un método `prePersist()` que establece la fecha de creación antes de insertar un nuevo usuario en la base de datos.
     - **repositories**
       - UserRepository.java: Interfaz que extiende `CrudRepository` de Spring Data JPA, proporcionando métodos CRUD básicos para interactuar con la base de datos y realizar operaciones sobre la entidad `User`. No es necesario implementar los métodos, ya que Spring Data JPA los genera automáticamente.
     - **services**
       - UserService.java: Interfaz que define los métodos para la lógica de negocio relacionada con los usuarios.
       - UserServiceImpl.java: Implementación de la interfaz `UserService`. Esta clase maneja la lógica de negocio relacionada con los usuarios. Utiliza `UserRepository` para interactuar con la base de datos. Los métodos están anotados con `@Transactional` para garantizar la gestión adecuada de las transacciones.
  - **resources**
    - **templates**
      - form.html: Vista que muestra un formulario para crear o editar un usuario. Utiliza Thymeleaf para el enlazado dinámico de datos con el objeto `user`.
      - list.html: Vista que muestra una lista de usuarios en una tabla. Utiliza Thymeleaf para mostrar dinámicamente la información de los usuarios. Además, ofrece opciones para editar o eliminar cada usuario. También incluye alertas para mostrar mensajes de éxito o error.
      - view.html: Vista que muestra los detalles de un usuario. Utiliza Thymeleaf para enlazar dinámicamente los valores del modelo y mostrarlos en la página.
    - application.properties: Archivo de configuración de Spring Boot, que establece configuraciones para Thymeleaf para las vistas HTML, la base de datos y habilita la visualización de las consultas SQL ejecutadas por Hibernate.

<h1 align="center">Controlador (UserController)</h1>

La clase `UserController` es un controlador Spring MVC que gestiona las operaciones relacionadas con la entidad `User`. Su función principal es proporcionar puntos de acceso para listar, crear, editar y eliminar usuarios. Este controlador también administra las vistas correspondientes para cada operación y utiliza `SessionAttributes` para mantener datos temporales de usuario durante la sesión.

<h3>Anotaciones en la clase UserController</h3>

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

<h3>Métodos de la clase UserController</h3>

```java
    @GetMapping({"/view", "/another"})
    public String view(Model model) {
        model.addAttribute("title", "Hola mundo Spring Boot");
        model.addAttribute("message", "Esta es una aplicación de ejemplo usando Spring Boot!!!");
        model.addAttribute("user", new User("Cristian", "Cirstaldo"));
        return "view";
    }
```

Maneja las solicitudes GET a `/users/view` y `/users/another`, pasando un <b>título</b>, un <b>mensaje</b> de ejemplo y un objeto <b>User</b> a la vista `view`. La clase `Model` es parte del framework Spring MVC y se utiliza para transferir datos desde el controlador hacia las vistas. Es un contenedor que permite almacenar atributos clave-valor que estarán disponibles en la vista para ser procesados o renderizados.

```java
    @GetMapping({"", "/"})
    public String list(Model model) {
        model.addAttribute("title", "Listado de Usuarios");
        model.addAttribute("users", service.findAll());
        return "list";
    }
```

Maneja las solicitudes GET a las rutas `/users` y `/users/`. Pasa un <b>título</b> y la <b>lista de usuarios</b> obtenida del servicio al modelo, y redirige a la vista `list` para mostrar el listado de usuarios.

```java
    @GetMapping("/form/{id}")
    public String form(@PathVariable Long id, Model model, RedirectAttributes redirect) {
        
        Optional<User> optionalUser = service.finById(id);
        
        if (optionalUser.isPresent()) {
            model.addAttribute("title", "EDITAR Usuario");
            model.addAttribute("user", optionalUser.get());
            return "form";
        } else {
            redirect.addFlashAttribute("error", "El usuario con el id: " + id + " NO EXISTE en la Base de Datos");
            return "redirect:/users";
        }
    }
```

Este método está diseñado para manejar la visualización del formulario de edición de un usuario existente, o redirigir al listado de usuarios si el usuario con el ID proporcionado no existe.

```java
    @PostMapping
    public String form(@Valid User user, BindingResult result, Model model, RedirectAttributes redirect, SessionStatus status) {

        if (result.hasErrors()) {
            model.addAttribute("title", "Validando Formulario");
            return "form";
        }

        String message = user.getId() != null && user.getId() > 0 ?
                "El usuario: " + user.getName() + " se ha ACTUALIZADO con éxito!"
                : "El usuario: " + user.getName() + " se ha CREADO con éxito!";

        service.save(user);

        status.setComplete();
        redirect.addFlashAttribute("success", message);
        return "redirect:/users";
    }
```

Anotación `@PostMapping`: Indica que este método se ejecuta cuando el navegador realiza una solicitud HTTP POST hacia la URL que maneja el controlador (en este caso, `/users`). Esto generalmente sucede cuando un formulario se envía.

```java
    @GetMapping("/delete/{id}")
    public String delete(@PathVariable Long id, RedirectAttributes redirect) {
        
        Optional<User> optionalUser = service.finById(id);
        
        if (optionalUser.isPresent()) {
            service.remove(id);
            redirect.addFlashAttribute("success", "El usuario: " + optionalUser.get().getName() + " se ha ELIMINADO con éxito!");
            return "redirect:/users";
        }
        redirect.addFlashAttribute("error", "El usuario con el id: " + optionalUser.get().getId() + " no existe en el sistema");
        return "redirect:/users";
    }
```

Este método maneja las peticiones GET que se hacen a la ruta `/users/delete/{id}`, donde `{id}` es el identificador del usuario que se desea eliminar.
