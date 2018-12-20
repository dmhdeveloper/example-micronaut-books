package example.micronaut.resource.impl

import example.micronaut.domain.Book

interface BooksRepository {
    List<Book> findAll()
}