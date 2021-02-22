package fi.vamk.tentti.repositories;

import org.springframework.data.repository.CrudRepository;

import fi.vamk.tentti.entities.UserEvent;

public interface UserEventRepository extends CrudRepository<UserEvent, Integer> {

}
