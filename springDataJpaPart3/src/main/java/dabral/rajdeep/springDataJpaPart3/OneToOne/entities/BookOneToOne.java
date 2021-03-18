package dabral.rajdeep.springDataJpaPart3.OneToOne.entities;

import org.hibernate.engine.internal.Cascade;

import javax.persistence.*;

@Entity
@Table(name = "bookOneToOne")
public class BookOneToOne {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "bookId")
    private int bookId;
    @Column(name = "bookName")
    private String bookName;

    @OneToOne(cascade= CascadeType.ALL)
    @JoinColumn(name="authorId")
    private AuthorOneToOne authorOneToOne;

    public AuthorOneToOne getAuthorOneToOne() {
        return authorOneToOne;
    }

    public void setAuthorOneToOne(AuthorOneToOne authorOneToOne) {
        this.authorOneToOne = authorOneToOne;
    }

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
}
