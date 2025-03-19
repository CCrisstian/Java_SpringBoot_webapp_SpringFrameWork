package com.ccristian.springboot.springmvc.app.repositories;

import com.ccristian.springboot.springmvc.app.entities.User;
import org.springframework.data.repository.CrudRepository;

/*CrudRepository<Entidad, Tipo del ID>*/
public interface UserRepository extends CrudRepository<User, Long> {
}

/*
 * Interfaz que extiende 'CrudRepository' para la entidad 'User'.
 * Proporciona métodos CRUD básicos para interactuar con la base de datos,
 * como save(), findById(), findAll(), deleteById(), entre otros.
 * **No es necesario implementar ningún método**, ya que Spring Data JPA genera automáticamente la implementación
 * de estos métodos en tiempo de ejecución, gracias a la capacidad de Spring para crear implementaciones dinámicas
 * de interfaces mediante proxies.
 *
*/