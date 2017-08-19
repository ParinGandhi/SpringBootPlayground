package info.paringandhi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import info.paringandhi.domain.Person;
import info.paringandhi.services.PersonService;

@RestController
@RequestMapping("/person")
public class MainController {

	@Autowired
	private PersonService personService;

	@RequestMapping(value = "/all", method = RequestMethod.GET)
	public List<Person> getAll() {
		return personService.getAll();
	}

	@RequestMapping(value = "/addPerson", method = RequestMethod.POST)
	public @ResponseBody List<Person> addPerson(@RequestBody Person person) {
		personService.addPerson(person);
		return personService.getAll();
	}

}
