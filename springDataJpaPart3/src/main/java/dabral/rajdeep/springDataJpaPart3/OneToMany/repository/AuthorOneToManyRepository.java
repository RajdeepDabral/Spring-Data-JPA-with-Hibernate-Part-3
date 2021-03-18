package dabral.rajdeep.springDataJpaPart3.OneToMany.repository;

import dabral.rajdeep.springDataJpaPart3.OneToMany.entities.AuthorOneToMany;
import org.springframework.data.repository.CrudRepository;

public interface AuthorOneToManyRepository extends CrudRepository<AuthorOneToMany, Integer>{
}
