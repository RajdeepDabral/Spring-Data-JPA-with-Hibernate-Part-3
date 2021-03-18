package dabral.rajdeep.springDataJpaPart3.ManyToMany.Repository;

import dabral.rajdeep.springDataJpaPart3.ManyToMany.entities.AuthorManyToMany;
import org.springframework.data.repository.CrudRepository;

public interface AuthorManyToManyRepository extends CrudRepository<AuthorManyToMany , Integer> {
}
