package example.micronaut.resource.impl

import example.micronaut.domain.Book
import groovy.transform.CompileStatic
import javax.inject.Singleton

@CompileStatic
@Singleton
class BooksRepositoryImpl implements BooksRepository {

    @Override
    List<Book> findAll() {
        [
                new Book("1491950358", "Building Microservices"),
                new Book("1680502395", "Release It!"),
        ]
    }
}
