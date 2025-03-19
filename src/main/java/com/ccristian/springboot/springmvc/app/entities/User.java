package com.ccristian.springboot.springmvc.app.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;

import java.time.LocalDate;

@Entity
@Table(name = "users")  /*Esta entidad está asociada a la tabla 'users' de la base de datos y debe coincidir con el nombre de la misma*/
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotEmpty   //Asegura que no sea null ni una cadena vacía "". Se usa en String, List, Set, etc.
    private String name;

    @NotEmpty
    private String lastname;

    @NotEmpty
    @Email      //Verifica que el valor sea una dirección de correo válida.
    private String email;
    // ❌ No permite valores como "correo@", "@gmail.com", "texto sin @".
    // ✅ Ejemplos válidos: "usuario@gmail.com", "test@example.org".

    @NotEmpty
    @Size(min = 4, max = 16)    //El campo debe contener entre 4 y 16 caracteres.
    private String username;

    @NotEmpty
    private String password;

    // Mapea el atributo 'createdAt' a la columna 'created_at' en la base de datos,
    // permitiendo usar una convención de nombres diferente (camelCase en Java, snake_case en la BD).
    @Column(name = "created_at")
    private LocalDate createdAt;

// 🔹 Validación en el controlador:
// Para que Spring Boot valide automáticamente los datos enviados en una petición,
// usa @Valid en el @RequestBody o @ModelAttribute del método correspondiente en el controlador.

    public User() {
    }

    public User(String name, String lastname) {
        this.name = name;
        this.lastname = lastname;
        this.createdAt = LocalDate.now();
    }

    @PrePersist /*Para asignarle automáticamente el valor antes de que se guarde en la base de datos*/
    public void prePersist() {
        this.createdAt = LocalDate.now();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public LocalDate getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDate createdAt) {
        this.createdAt = createdAt;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
