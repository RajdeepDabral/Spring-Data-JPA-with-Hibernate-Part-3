package dabral.rajdeep.springDataJpaPart3.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Book {
    @Id
    private int bookId;
    private String bookName;

}
