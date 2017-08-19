package info.paringandhi.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import info.paringandhi.domain.Person;
import info.paringandhi.repositories.PersonRepository;

@Service
public class PersonService {

	@Autowired
	private PersonRepository personRepository;

	public List<Person> getAll() {
		List<Person> people = (List<Person>) personRepository.findAll();
		return people;
	}

	public void addPerson(Person person) {
		personRepository.save(person);
	}

}
