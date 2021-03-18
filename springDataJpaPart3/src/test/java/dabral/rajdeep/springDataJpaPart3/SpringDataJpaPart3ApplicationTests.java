package dabral.rajdeep.springDataJpaPart3;

import dabral.rajdeep.springDataJpaPart3.ManyToMany.Repository.AuthorManyToManyRepository;
import dabral.rajdeep.springDataJpaPart3.ManyToMany.entities.AuthorManyToMany;
import dabral.rajdeep.springDataJpaPart3.ManyToMany.entities.BookManyToMany;
import dabral.rajdeep.springDataJpaPart3.OneToOne.Repository.BookOneToOneRepository;
import dabral.rajdeep.springDataJpaPart3.OneToOne.entities.AuthorOneToOne;
import dabral.rajdeep.springDataJpaPart3.OneToOne.entities.BookOneToOne;
import dabral.rajdeep.springDataJpaPart3.entities.Address;
import dabral.rajdeep.springDataJpaPart3.entities.Author;
import dabral.rajdeep.springDataJpaPart3.entities.Subject;
import dabral.rajdeep.springDataJpaPart3.repository.AuthorRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

@SpringBootTest
class SpringDataJpaPart3ApplicationTests {

	@Autowired
	AuthorRepository authorRepository;

	@Autowired
	BookOneToOneRepository bookOneToOneRepository;

	@Autowired
	AuthorManyToManyRepository authorManyToManyRepository;

	@Test
	void contextLoads() {
	}

	/*
	4. Persist 3 subjects for each author.
	 */
	@Test
	public void createAuthor(){
		Address address = new Address("A-148","Noida","Uttar Pradesh");
		Subject subject1= new Subject("computer");
		Subject subject2= new Subject("Maths");
		Subject subject3= new Subject("English");
		Subject subject4= new Subject("IP");
		Subject subject5= new Subject("Physics");
		Subject subject6= new Subject("Chemistry");
		Author author1=  new Author("101","rajdeep dabral",address);
		author1.setSubject(subject1); author1.setSubject(subject2); author1.setSubject(subject3);
		subject1.setAuthor(author1); subject2.setAuthor(author1); subject3.setAuthor(author1);
		Author author2=  new Author("102","Suraj",address);
		author2.setSubject(subject4); author2.setSubject(subject5); author2.setSubject(subject6);
		subject4.setAuthor(author2); subject5.setAuthor(author2); subject6.setAuthor(author2);
		authorRepository.save(author1); authorRepository.save(author2);
	}
	/*
	3. Introduce a List of subjects for author.
	 */
	@Test
	public void addSubjectListToAuthor(){
		Address address = new Address("Block B-12/234","Delhi","New Delhi");
		Subject subject1= new Subject("computer");
		Subject subject2= new Subject("Maths");
		Subject subject3= new Subject("English");
		LinkedList<Subject> subjectList =  new  LinkedList<Subject>();
		subjectList.add(subject1);
		subjectList.add(subject2);
		subjectList.add(subject3);
		Author author1=  new Author("103","Shubham",address);
		author1.setSubjectList(subjectList);
		subject1.setAuthor(author1);
		subject2.setAuthor(author1);
		subject3.setAuthor(author1);
		authorRepository.save(author1);
	}

	/*
	6. Implement One to One mapping between Author and Book.
	 */
	@Test
	public void testBookOneToOneMapping(){
		AuthorOneToOne author = new AuthorOneToOne();
		author.setAuthorName("rajdeep");
		BookOneToOne book1 = new BookOneToOne();
		book1.setBookName("IP");
		book1.setAuthorOneToOne(author);
		bookOneToOneRepository.save(book1);
	}

	/*
	7. Implement One to Many Mapping between Author and Book(Unidirectional, BiDirectional and without additional table )
		and implement cascade save.
	*/
	




	/*
	8. Implement Many to Many Mapping between Author and Book.

	*/
	@Test
	public void testAuthorManyToManyMapping(){
		AuthorManyToMany author1 =  new AuthorManyToMany();
		author1.setAuthorName("Rajdeep");
		BookManyToMany book1 = new BookManyToMany();
		book1.setBookName("English");
		BookManyToMany book2 = new BookManyToMany();
		book2.setBookName("Maths");
		List<BookManyToMany> bookList = new LinkedList<>();
		bookList.add(book1);
		bookList.add(book2);
		List<AuthorManyToMany> authorList = new LinkedList<>();
		authorList.add(author1);
		author1.setBookList(bookList);
		book1.setAuthorList(authorList);
		book2.setAuthorList(authorList);
		authorManyToManyRepository.save(author1);
	}


	@Test
	@Transactional
	@Rollback(value = false)
	public void deleteAuthor(){
		authorRepository.deleteAuthor();
	}


	/*
	9. Which method on the session object can be used to remove an object from the cache?

	Answer :- We can use session evict() method to remove a single object from the hibernate first level cache or
				We can use session clear() method to clear the cache i.e delete all the objects from the cache.
	 */

	/*
	10. What does @transactional annotation do?

	Answer :- With transactions configured, we can now annotate a bean with @Transactional either at the class or method level.
			The annotation supports further configuration as well :-
    		1. the Propagation Type of the transaction
    		2. the Isolation Level of the transaction
    		3. a Timeout for the operation wrapped by the transaction
    		4. a readOnly flag – a hint for the persistence provider that the transaction should be read only
    		5. the Rollback rules for the transaction

    */

}
