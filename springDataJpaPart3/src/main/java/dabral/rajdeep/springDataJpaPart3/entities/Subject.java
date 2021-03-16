package dabral.rajdeep.springDataJpaPart3.entities;

import javax.persistence.*;

@Entity
@Table(name="Subject")
public class Subject {
    @Id
    private int subjectId;
    private String subjectName;
    @ManyToOne
    @JoinColumn(name = "authorId")
    private Author author;

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public Subject(int subjectId, String subjectName) {
        this.subjectId = subjectId;
        this.subjectName = subjectName;
//        this.author = author;
    }
    public Subject(){
        subjectId=0;
        subjectName=null;
        author=null;
    }
    public int getSubjectId() {
        return subjectId;
    }
    public void setSubjectId(int subjectId) {
        this.subjectId = subjectId;
    }
    public String getSubjectName() {
        return subjectName;
    }
    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }
}
