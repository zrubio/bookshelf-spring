package com.zrubio.bookshelf.controller;

import com.zrubio.bookshelf.model.Book;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Map;

@Controller
public class BookController {

    @GetMapping("book")
    public String getBook(Map<String,Object> model) {
        return "book";
    }

    @PostMapping("book")
    public String addBook(@ModelAttribute ("book")Book book) {
        System.out.println(book.getTitle());
        return "book";
    }

}
