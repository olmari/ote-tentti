package fi.vamk.tentti.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import fi.vamk.tentti.entities.Event;
import fi.vamk.tentti.repositories.EventRepository;

@RestController
public class EventController {
    @Autowired
    EventRepository repository;

    @GetMapping("/events")
    public Iterable<Event> getAll() {
        return repository.findAll();
    }

    @GetMapping("/event/{id}")
    public Optional<Event> getOne(@PathVariable("id") int id) {
        return repository.findById(id);
    }

    @PostMapping("/event")
    public Event create(@RequestBody Event item) {
        return repository.save(item);
    }

    @PutMapping("/event")
    public Event update(@RequestBody Event item) {
        return repository.save(item);
    }

    @DeleteMapping("/event/{id}")
    public void delete(@PathVariable("id") int id) {
        repository.deleteById(id);
    }
}
