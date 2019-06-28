package com.fse.boot.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.fse.boot.model.Book;
import com.fse.boot.model.Subject;
import com.fse.boot.repository.BookRepository;
import com.fse.boot.repository.SubjectRepository;


@Service
@Transactional(readOnly = true)
public class ManageServiceImpl implements ManageService {

	@Autowired
	BookRepository bookRepository;

	@Autowired
	SubjectRepository subjectRepository;
	

	public Optional<Book> getBookById(long bookId) {
		Optional<Book> book = bookRepository.findById(bookId);
		return book;
	}

	public Book addBook(Book book) {
		Book savebook = bookRepository.save(book);
		return savebook;
	}

	public String deleteBook(long bookId) {
		String status = null;
		try{
		 bookRepository.deleteById(bookId);
		 status = "Book "+bookId+" "+"Deleted Successfully:";
		}
		catch(Exception e){
			status = "Book Not Found to Delete:";
		}
		return status;
		
	}

	public Subject addSubject(Subject subject) {
		Subject saveSubject = subjectRepository.save(subject);
		return saveSubject;
	}	
	
	public Optional<Subject> searchSubject(long subId) {
		Optional<Subject> subject = subjectRepository.findById(subId);
		System.out.println(subject.get().getSubtitle());
		return subject;
	}

	public String deleteSubject(long subId) {
		String status = null;
		try{
			subjectRepository.deleteById(subId);
			 status = "Subject   "+subId+"  "+"Deleted Successfully";
			}
			catch(Exception e){
				status = "Subject Not Found to Delete:";
			}
			return status;
	}
}
