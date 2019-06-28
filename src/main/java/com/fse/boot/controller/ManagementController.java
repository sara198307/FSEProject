package com.fse.boot.controller;

import java.io.IOException;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fse.boot.bean.BookBean;
import com.fse.boot.bean.SubjectBean;
import com.fse.boot.model.Book;
import com.fse.boot.model.Subject;
import com.fse.boot.service.ManageService;

@RestController
public class ManagementController {
	
	private static final Logger logger = LoggerFactory.getLogger(ManagementController.class);
	ObjectMapper objectMapper = new ObjectMapper();
	
	@Autowired
	ManageService manageService;
	

  /* @RequestMapping("/")
   public String index() {
      return "index";
   }
*/
   @PostMapping("/hello")
   public String sayHello(@RequestParam("name") String name, Model model) {
      model.addAttribute("name", name);
      return "hello";
   }
   
   @RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView Home() {
		return new ModelAndView("index");
	}
	
   @RequestMapping(value = "/addSubject", method = RequestMethod.GET)
	public ModelAndView addsubject() {
		return new ModelAndView("addSubject", "command", new Subject());
	}
	
	@RequestMapping(value = "/searchSubject", method = RequestMethod.GET)
	public ModelAndView searchSubject() {
		return new ModelAndView("searchSubject", "command", new Subject());
	}
	
	@RequestMapping(value = "/deleteSubject", method = RequestMethod.GET)
	public ModelAndView deleteSubject() {
		return new ModelAndView("deleteSubject", "command", new Subject());
	}
	
	@RequestMapping(value = "/addBook", method = RequestMethod.GET)
	public ModelAndView addBook() {
		return new ModelAndView("addBook", "command", new Book());
	}
	
	@RequestMapping(value = "/searchBook", method = RequestMethod.GET)
	public ModelAndView searchBook() {
		return new ModelAndView("searchBook", "command", new Book());
	}
	
	@RequestMapping(value = "/deleteBook", method = RequestMethod.GET)
	public ModelAndView deleteBook() {
		return new ModelAndView("deleteBook", "command", new Book());
	}
	
	@RequestMapping(value = "/back", method = RequestMethod.GET)
	public ModelAndView back() {
		return new ModelAndView("index");
	}	
	@RequestMapping(value = "/saveSubject", method = RequestMethod.POST)
	public ModelAndView addSubject(@ModelAttribute("SpringWeb")SubjectBean subjectbean, ModelMap model) throws IOException {
		  Subject subject = new Subject();
		  subject = preparSubjecteModel(subjectbean);
		  Subject savedSubject  = manageService.addSubject(subject);
	      model.addAttribute("subjectId", savedSubject.getSubjectId());
	      model.addAttribute("subjectTitle", savedSubject.getSubtitle());
	      model.addAttribute("duration", savedSubject.getDurationInHours());
	      return new ModelAndView("subjectDetails");
	   }
	@RequestMapping(value = "/viewSubject", method = RequestMethod.POST)
	public ModelAndView viewSubject(@ModelAttribute("SpringWeb")SubjectBean subjectbean, ModelMap model) throws ClassNotFoundException, IOException {
		String message = null;
		Subject getSubject = new Subject();
		Optional<Subject> subject = manageService.searchSubject(subjectbean.getSubjectId());
		 
			if(subject.isPresent()){
				getSubject = subject.get();
				 if(getSubject.getSubjectId() == subjectbean.getSubjectId()){
					   message = "Subject  "+getSubject.getSubtitle()+"  "+"is available";
					 }
			}
			else{
				message = "The Requested Subject is Not available";
			}
	      model.addAttribute("message", message);
	      return new ModelAndView("Success");
	   }
	
	@RequestMapping(value = "/removeSubject", method = RequestMethod.POST)
	public ModelAndView removeSubject(@ModelAttribute("SpringWeb")SubjectBean subjectBean, ModelMap model) throws ClassNotFoundException, IOException {
		 Subject subject = new Subject();
		 String message = null;
		 message = manageService.deleteSubject(subjectBean.getSubjectId());
	     model.addAttribute("message", message);
	      return new ModelAndView("Success");
	   }
	
	@RequestMapping(value = "/saveBook", method = RequestMethod.POST)
	public ModelAndView saveBook(@ModelAttribute("SpringWeb")BookBean bookbean, ModelMap model) throws IOException {
		  Book book = new Book();
		  book = prepareBookModel(bookbean);
		  Book savedBook = manageService.addBook(book);
	      model.addAttribute("bookId", savedBook.getBookId());
	      model.addAttribute("bookTitle", savedBook.getTitle());
	      model.addAttribute("bookPrice", savedBook.getPrice());
	      model.addAttribute("bookVolume", savedBook.getVolume());
	      model.addAttribute("publishedDate", savedBook.getPublishDate());
	      return new ModelAndView("bookDetails");
	   }
	
	@RequestMapping(value = "/viewBook", method = RequestMethod.POST)
	public ModelAndView viewBook(@ModelAttribute("SpringWeb")BookBean bookbean, ModelMap model) throws ClassNotFoundException, IOException {
		Book returnbook = new Book();
		String message = null;
		Optional<Book> book =  manageService.getBookById(bookbean.getBookId());
		if(book.isPresent()){
			returnbook = book.get();
			if(returnbook.getBookId() == bookbean.getBookId()){
		    message = "Book  "+returnbook.getTitle()+"  "+"is Availabe";
		}
		}
		else{
			message = "The Requested Book is Not available";
		}
		 model.addAttribute("message", message);
	     return new ModelAndView("Success");
	}
	
	@RequestMapping(value = "/removeBook", method = RequestMethod.POST)
	public ModelAndView removeBook(@ModelAttribute("SpringWeb")BookBean bookbean, ModelMap model) throws ClassNotFoundException, IOException {
		String message = null;
	     message = manageService.deleteBook(bookbean.getBookId());
	     model.addAttribute("message", message);
	    return new ModelAndView("Success");
	   }
	
	private Book prepareBookModel(BookBean bookBean){
		Book book = new Book();
		book.setBookId(bookBean.getBookId());
		book.setTitle(bookBean.getTitle());
		book.setVolume(bookBean.getVolume());
		book.setPrice(bookBean.getPrice());
		book.setPublishDate(bookBean.getPublishDate());
		return book;
	}
	private Subject preparSubjecteModel(SubjectBean subjectBean){
		Subject subject = new Subject();
		subject.setSubjectId(subjectBean.getSubjectId());
		subject.setSubtitle(subjectBean.getSubtitle());
		subject.setDurationInHours(subjectBean.getDurationInHours());
		return subject;
	}

   
}
