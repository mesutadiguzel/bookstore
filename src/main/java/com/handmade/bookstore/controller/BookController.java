package com.handmade.bookstore.controller;

import com.handmade.bookstore.dto.BookDto;
import java.util.ArrayList;
import java.util.List;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/books")
public class BookController {

  @GetMapping
  public ResponseEntity<List<BookDto>> getBooks() {
    BookDto bookDto = BookDto.builder().title("my title").build();

    List<BookDto> books = new ArrayList<BookDto>();
    books.add(bookDto);
    return ResponseEntity.ok(books);
  }
}
