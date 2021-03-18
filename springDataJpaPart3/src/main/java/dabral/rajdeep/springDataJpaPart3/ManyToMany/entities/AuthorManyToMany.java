package dabral.rajdeep.springDataJpaPart3.ManyToMany.entities;


import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "authorManyToMany")
public class AuthorManyToMany {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="authorId")
    private int authorId;
    @Column(name="authorName")
    private String authorName;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name="author_Book_ManyToMany" ,
    joinColumns = @JoinColumn(name="author_Id", referencedColumnName = "authorId"),
    inverseJoinColumns = @JoinColumn(name="book_Id", referencedColumnName = "bookId")
    )
    private List<BookManyToMany> bookList;

    public int getAuthorId() {
        return authorId;
    }

    public void setAuthorId(int authorId) {
        this.authorId = authorId;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public List<BookManyToMany> getBookList() {
        return bookList;
    }

    public void setBookList(List<BookManyToMany> bookList) {
        this.bookList = bookList;
    }
}
