package dabral.rajdeep.springDataJpaPart3.OneToOne.Repository;

import dabral.rajdeep.springDataJpaPart3.OneToOne.entities.BookOneToOne;
import org.springframework.data.repository.CrudRepository;

public interface BookOneToOneRepository extends CrudRepository<BookOneToOne,Integer> {
}
