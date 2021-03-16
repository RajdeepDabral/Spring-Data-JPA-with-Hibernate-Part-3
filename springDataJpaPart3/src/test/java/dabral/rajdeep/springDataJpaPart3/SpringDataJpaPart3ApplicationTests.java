package dabral.rajdeep.springDataJpaPart3;

import dabral.rajdeep.springDataJpaPart3.entities.Address;
import dabral.rajdeep.springDataJpaPart3.entities.Author;
import dabral.rajdeep.springDataJpaPart3.entities.Subject;
import dabral.rajdeep.springDataJpaPart3.repository.AuthorRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.LinkedList;
import java.util.List;

@SpringBootTest
class SpringDataJpaPart3ApplicationTests {

	@Autowired
	AuthorRepository authorRepository;

	@Test
	void contextLoads() {
	}

	@Test
	public void createAuthor(){
		Address address = new Address("A-148","Noida","Uttar Pradesh");
		Subject subject1= new Subject();
		subject1.setSubjectId(101);
		subject1.setSubjectName("computer");
		Subject subject2= new Subject();
		subject2.setSubjectId(102);
		subject2.setSubjectName("computer");
		Subject subject3= new Subject();
		subject3.setSubjectId(103);
		subject3.setSubjectName("computer");
		Subject subject4= new Subject();
		subject4.setSubjectId(104);
		subject4.setSubjectName("computer");
		List<Subject> subjectList = new LinkedList();
		subjectList.add(subject1);
		subjectList.add(subject2);
		subjectList.add(subject3);
		subjectList.add(subject4);
		Author author=  new Author("101","rajdeep dabral",address,subjectList);
		authorRepository.save(author);
	}

}
