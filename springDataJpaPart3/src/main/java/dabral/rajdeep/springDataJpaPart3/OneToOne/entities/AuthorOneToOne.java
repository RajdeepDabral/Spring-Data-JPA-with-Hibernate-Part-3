package dabral.rajdeep.springDataJpaPart3.OneToOne.entities;
import javax.persistence.*;

@Entity
@Table(name = "authorOneToOne")
public class AuthorOneToOne {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int authorId;
    private String authorName;
    @OneToOne(mappedBy = "authorOneToOne")
    private BookOneToOne bookId;

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
}
