package ua.paulwinner.flywaydemo.person.restrepository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import ua.paulwinner.flywaydemo.person.entity.Wizard;

@RepositoryRestResource(path = "wizards")
public interface WizardRestRepository extends CrudRepository<Wizard, Long> {
}
