package com.southwind.springboottest.repository;

import com.southwind.springboottest.entity.Book;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@SpringBootTest
class BookRepositoryTest {
    @Autowired
    private BookRepository repository;
    @Test
    void findAll(){
        System.out.println(repository.findAll());
    }

    @Test
    void save(){
        Book book = new Book();
        book.setName("spring boot");
        book.setAuthor("张三");
        Book book1=repository.save(book);
        System.out.println(book1);
    }

    @Test
    void findById(){
        Book book=repository.findById(1).get();
        System.out.println(book);
    }

    @Test
    void update(){
        Book book = new Book();
        book.setId(18);
        book.setName("测试");
        Book book1=repository.save(book);
        System.out.println(book1);
    }

    @Test
    void delete(){
        repository.deleteById(18);
    }
}