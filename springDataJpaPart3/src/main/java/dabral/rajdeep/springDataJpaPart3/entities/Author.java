package dabral.rajdeep.springDataJpaPart3.entities;

import javax.persistence.*;
import java.util.LinkedList;
import java.util.List;

@Entity
@Table(name="Author")
public class Author {
    @Id
    private String authorId;
    private String authorName;
    @Embedded
    private Address address;
    @OneToMany(mappedBy = "author",cascade = CascadeType.ALL)
    private List<Subject> subjectList;

    public Author(String authorId, String authorName, Address address) {
        this.authorId = authorId;
        this.authorName = authorName;
        this.address = address;
        this.subjectList=null;
    }
    public Author(){
        this.authorId = null;
        this.authorName = null;
        this.address = null;
        this.subjectList =  null;
    }

    public String getAuthorId() {
        return authorId;
    }

    public void setAuthorId(String authorId) {
        this.authorId = authorId;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public List<Subject> getSubjectList() {
        return subjectList;
    }

    public void setSubject(Subject subject) {
        if(this.subjectList==null){
            this.subjectList = new LinkedList<Subject>();
        }
        this.subjectList.add(subject);
    }
    public void setSubjectList(List<Subject> subjectList) {
        if(this.subjectList==null){
            this.subjectList = new LinkedList<Subject>();
        }
        this.subjectList=subjectList;
    }
}
