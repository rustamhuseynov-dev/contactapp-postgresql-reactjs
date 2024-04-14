package io.rustam.contactapi.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import io.rustam.contactapi.domain.Contact;

public interface ContactRepo extends JpaRepository<Contact, String> {

}
