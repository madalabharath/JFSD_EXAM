package com.klef.jfsd.exam.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.klef.jfsd.exam.model.Book;

public interface BookRepository extends JpaRepository<Book, Long> {
}
