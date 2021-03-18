package dabral.rajdeep.springDataJpaPart3.repository;

import dabral.rajdeep.springDataJpaPart3.entities.Author;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author , String> {

    @Query("Delete from Subject")
    @Modifying
    void deleteAuthor();

}
