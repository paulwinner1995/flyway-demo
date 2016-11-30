package ua.paulwinner.flywaydemo.school.restrepository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import ua.paulwinner.flywaydemo.school.entity.School;

@RepositoryRestResource(path = "schools")
public interface SchoolRestRepository extends CrudRepository<School, Long> {
}
