package dabral.rajdeep.springDataJpaPart3.ManyToMany.entities;


import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="bookManyToMany")
public class BookManyToMany {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "bookId")
    private int bookId;
    @Column(name = "bookName")
    private String bookName;

    @ManyToMany(mappedBy = "bookList")
    private List<AuthorManyToMany> authorList;

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

    public List<AuthorManyToMany> getAuthorList() {
        return authorList;
    }

    public void setAuthorList(List<AuthorManyToMany> authorList) {
        this.authorList = authorList;
    }
}
