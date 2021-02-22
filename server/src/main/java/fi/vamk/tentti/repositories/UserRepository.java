package fi.vamk.tentti.repositories;

import org.springframework.data.repository.CrudRepository;

import fi.vamk.tentti.entities.User;

public interface UserRepository extends CrudRepository<User, Integer> {

}
