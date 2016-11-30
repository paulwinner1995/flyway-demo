package ua.paulwinner.flywaydemo.person.restrepository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import ua.paulwinner.flywaydemo.person.entity.Person;

@RepositoryRestResource(path = "persons")
public interface PersonRestRepository extends CrudRepository<Person, Long> {
}
