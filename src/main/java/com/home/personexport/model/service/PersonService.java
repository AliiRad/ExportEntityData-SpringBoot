package com.home.personexport.model.service;

import com.home.personexport.model.entity.Person;
import com.home.personexport.model.repository.PersonRepository;
import com.home.personexport.model.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PersonService implements ServiceImpl<Person,Long> {
    private final PersonRepository personRepository;

    public PersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    @Override
    public Person insert(Person person) {
        return personRepository.save(person);
    }

    @Override
    public Person update(Person person) {
        return personRepository.save(person);
    }

    @Override
    public Person delete(Long id) {
        Optional<Person> person = personRepository.findById(id);
        if (person.isPresent()) {
            person.get().setDeleted(true);
            return person.get();
        }
        return null;
    }

    @Override
    public Person findById(Long id) {
        Optional<Person> person = personRepository.findById(id);
        return person.orElse(null);
    }

    @Override
    public List<Person> findAll() {
        return personRepository.findAll();
    }
}
