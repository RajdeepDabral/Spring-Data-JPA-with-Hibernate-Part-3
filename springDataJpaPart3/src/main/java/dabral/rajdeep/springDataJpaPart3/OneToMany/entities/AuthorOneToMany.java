package dabral.rajdeep.springDataJpaPart3.OneToMany.entities;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="authorOneToMany")
public class AuthorOneToMany {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="authorId")
    private int authorId;
    @Column(name="authorName")
    private String authorName;

    @OneToMany(mappedBy = "author",cascade = CascadeType.ALL)
    private List<BookOneToMany> bookList;


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
    public List<BookOneToMany> getBookList() {
        return bookList;
    }
    public void setBookList(List<BookOneToMany> bookList) {
        this.bookList = bookList;
    }
}
