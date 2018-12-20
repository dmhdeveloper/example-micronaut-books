package example.micronaut.controller

import example.micronaut.domain.Book
import example.micronaut.resource.impl.BooksRepository
import groovy.transform.CompileStatic
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get

@CompileStatic
@Controller("/api")
class BooksController {

    private final BooksRepository booksRepository

    BooksController(BooksRepository booksRepository) {
        this.booksRepository = booksRepository
    }

    @Get("/books")
    List<Book> list() {
        booksRepository.findAll()
    }
}