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

import fi.vamk.tentti.entities.User;
import fi.vamk.tentti.repositories.UserRepository;

@RestController
public class UserController {
    @Autowired
    UserRepository repository;

    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping("/users")
    public Iterable<User> users() {
        return repository.findAll();
    }

    @GetMapping("/user/{id}")
    public Optional<User> getOne(@PathVariable("id") int id) {
        return repository.findById(id);
    }

    @PostMapping("/user")
    public User create(@RequestBody User item) {
        return repository.save(item);
    }

    @PutMapping("/user")
    public User update(@RequestBody User item) {
        return repository.save(item);
    }

    @DeleteMapping("/user/{id}")
    public void delete(@PathVariable("id") int id) {
        repository.deleteById(id);
    }
}
