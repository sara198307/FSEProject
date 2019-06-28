package com.fse.boot.repository;

import org.springframework.data.repository.CrudRepository;

import com.fse.boot.model.Book;

public interface BookRepository extends CrudRepository<Book, Long>{

}
