package ua.paulwinner.flywaydemo.wizard.restrepository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import ua.paulwinner.flywaydemo.wizard.entity.Wizard;

@RepositoryRestResource(path = "wizards")
public interface WizardRestRepository extends CrudRepository<Wizard, Long> {
}
