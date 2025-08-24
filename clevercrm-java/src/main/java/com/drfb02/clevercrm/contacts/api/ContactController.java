package com.drfb02.clevercrm.contacts.api;

import com.drfb02.clevercrm.contacts.domain.Contact;
import com.drfb02.clevercrm.contacts.repo.ContactRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/api/contacts")
public class ContactController {

    private final ContactRepository repo;

    public ContactController(ContactRepository repo) {
        this.repo = repo;
    }

    @GetMapping
    public List<Contact> all() {
        return repo.findAll();
    }

    @PostMapping
    public ResponseEntity<Contact> create(@RequestBody Contact c) {
        if (repo.findByEmail(c.getEmail()).isPresent()) {
            return ResponseEntity.badRequest().build();
        }
        Contact saved = repo.save(c);
        return ResponseEntity.created(URI.create("/api/contacts/" + saved.getId())).body(saved);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Contact> one(@PathVariable Long id){
        return repo.findById(id).map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
    }
}
