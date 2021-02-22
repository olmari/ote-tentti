package fi.vamk.tentti.repositories;

import org.springframework.data.repository.CrudRepository;

import fi.vamk.tentti.entities.Event;

public interface EventRepository extends CrudRepository<Event, Integer> {

}
