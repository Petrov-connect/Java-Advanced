package IteratorsAndComparators.Library;
//created by J.M.

import java.util.Iterator;

public class Library implements Iterable<Book>{

    Book[] books;

    public Library(Book...books) {
        this.books = books;
    }

    @Override
    public Iterator<Book> iterator() {

        Iterator<Book> bookIterator = new Iterator<>() {
            private int index = 0;
            @Override
            public boolean hasNext() {
                return index<books.length;
            }

            @Override
            public Book next() {
                return books[index++];
            }
        };
        return bookIterator;
    }
}
