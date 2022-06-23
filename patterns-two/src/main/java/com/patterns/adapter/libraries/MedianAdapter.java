package com.patterns.adapter.libraries;

import com.patterns.adapter.libraries.librarya.Book;
import com.patterns.adapter.libraries.librarya.Classifier;
import com.patterns.adapter.libraries.libraryb.BookSignature;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MedianAdapter extends MedianAdaptee implements Classifier {

    @Override
    public int publicationYearMedian(Set<Book> books) {
        Map<BookSignature, com.patterns.adapter.libraries.libraryb.Book> bookSignatureMap = new HashMap<>();
        for (com.patterns.adapter.libraries.librarya.Book book: books) {
            bookSignatureMap.put(new BookSignature(book.getSignature()), new com.patterns.adapter.libraries.libraryb.Book(book.getAuthor(), book.getTitle(), book.getPublicationYear()));
        }
        return medianPublicationYear(bookSignatureMap);
    }
}
