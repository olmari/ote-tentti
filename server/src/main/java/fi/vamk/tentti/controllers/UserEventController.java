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

import fi.vamk.tentti.entities.UserEvent;
import fi.vamk.tentti.repositories.UserEventRepository;

@RestController
public class UserEventController {
    @Autowired
    UserEventRepository repository;

    @GetMapping("/userevents")
    public Iterable<UserEvent> getAll() {
        return repository.findAll();
    }

    @GetMapping("/userevent/{id}")
    public Optional<UserEvent> getOne(@PathVariable("id") int id) {
        return repository.findById(id);
    }

    @PostMapping("/userevent")
    public UserEvent create(@RequestBody UserEvent item) {
        return repository.save(item);
    }

    @PutMapping("/userevent")
    public UserEvent update(@RequestBody UserEvent item) {
        return repository.save(item);
    }

    @DeleteMapping("/userevent/{id}")
    public void delete(@PathVariable("id") int id) {
        repository.deleteById(id);
    }
}
