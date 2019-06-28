
import static org.junit.Assert.assertEquals;

import java.util.Optional;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import com.fse.boot.config.SpringDataJPAConfig;
import com.fse.boot.model.Book;
import com.fse.boot.model.Subject;
import com.fse.boot.service.ManageServiceImpl;


@RunWith(SpringRunner.class)
@EnableWebMvc
@DataJpaTest
@SpringBootTest(classes = SpringDataJPAConfig.class)
@AutoConfigureTestDatabase(replace = Replace.NONE)
public class ManagementServiceTest {
	
	@Autowired
    private ManageServiceImpl manageService;
   
	//Adding a Subject
	 @Test
	 public void AddSubject()
	 {
	 Subject sub = new Subject();
	 sub.setSubtitle("NewSubject");
	 sub.setDurationInHours(100);
	 Subject subject = manageService.addSubject(sub);
	  System.out.println("Subject Added"+subject.getSubjectId());
	  assertEquals("NewSubject", subject.getSubtitle());
	  }
	 
// Retrieving the Subject
   @Test
   public void getSubjectById()
   {
      Optional<Subject> subject = manageService.searchSubject(222);
      System.out.println("Subject Exists"+subject.get().getSubtitle());
      assertEquals("Hibernate", subject.get().getSubtitle());
  
    }
// Deleting the Subject
   @Test
   public void deleteSubjectById()
   {
      String subject = manageService.deleteSubject(222);
      System.out.println("Subject Status:"+subject);
      assertEquals(subject,subject);
  
    }
 //Adding a Book
 	 @Test
 	 public void AddBook()
 	 {
 	 Book book = new Book();
 	book.setTitle("NewBook");
 	book.setPrice(100.0);
 	book.setVolume(200);
 	Book book1 = manageService.addBook(book);
 	  System.out.println("book Added"+book1.getBookId());
 	  assertEquals("NewBook", book1.getTitle());
 	  }
 	 
 // Retrieving the book
    @Test
    public void getBookById()
    {
       Optional<Book> book = manageService.getBookById(243);
       System.out.println("book Exists"+book.get().getTitle());
       assertEquals("NewBook", book.get().getTitle());
   
     }
  //Deleting the Book
    @Test
    public void deleteBookById()
    {
       String book = manageService.deleteBook(243);
       System.out.println("book Status:"+book);
       assertEquals(book,book);
   
     }
   
}
