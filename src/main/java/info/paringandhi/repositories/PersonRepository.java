package info.paringandhi.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import info.paringandhi.domain.Person;

@Repository
public interface PersonRepository extends CrudRepository<Person, Long> {

}
