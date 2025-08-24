package com.drfb02.clevercrm.contacts.repo;

import com.drfb02.clevercrm.contacts.domain.Contact;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface ContactRepository extends JpaRepository<Contact, Long> {
    Optional<Contact> findByEmail(String email);
}
