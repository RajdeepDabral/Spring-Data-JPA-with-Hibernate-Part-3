package dabral.rajdeep.springDataJpaPart3.OneToMany.entities;

import dabral.rajdeep.springDataJpaPart3.ManyToMany.entities.AuthorManyToMany;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="bookOneToMany")
public class BookOneToMany {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "bookId")
    private int bookId;
    @Column(name = "bookName")
    private String bookName;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="author_Id")
    private AuthorOneToMany author;

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public AuthorOneToMany getAuthor() {
        return author;
    }

    public void setAuthor(AuthorOneToMany author) {
        this.author = author;
    }
}
