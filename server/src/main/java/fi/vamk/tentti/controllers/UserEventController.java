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
import org.springframework.web.bind.annotation.CrossOrigin;

import fi.vamk.tentti.entities.UserEvent;
import fi.vamk.tentti.repositories.UserEventRepository;

@RestController
public class UserEventController {
    @Autowired
    UserEventRepository repository;

    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping("/userevents")
    public Iterable<UserEvent> getAll() {
        return repository.findAll();
    }

    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping("/userevent/{id}")
    public Optional<UserEvent> getOne(@PathVariable("id") int id) {
        return repository.findById(id);
    }

    @CrossOrigin(origins = "http://localhost:3000")
    @PostMapping("/userevent")
    public UserEvent create(@RequestBody UserEvent item) {
        return repository.save(item);
    }

    @CrossOrigin(origins = "http://localhost:3000")
    @PutMapping("/userevent")
    public UserEvent update(@RequestBody UserEvent item) {
        return repository.save(item);
    }

    @CrossOrigin(origins = "http://localhost:3000")
    @DeleteMapping("/userevent/{id}")
    public void delete(@PathVariable("id") int id) {
        repository.deleteById(id);
    }
}
