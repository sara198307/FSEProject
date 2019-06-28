package com.fse.boot.service;

import java.util.Optional;

import com.fse.boot.model.Book;
import com.fse.boot.model.Subject;

public interface ManageService {
	public Subject addSubject(Subject subject);
	public Optional<Subject> searchSubject(long subId);
	public String deleteSubject(long subId);
	public Book addBook(Book book);
	public Optional<Book> getBookById(long bookId);
	public String deleteBook(long bookId);
	
}
