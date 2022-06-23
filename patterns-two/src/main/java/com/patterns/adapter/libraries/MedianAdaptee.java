package com.patterns.adapter.libraries;

import com.patterns.adapter.libraries.libraryb.Book;
import com.patterns.adapter.libraries.libraryb.BookSignature;
import com.patterns.adapter.libraries.libraryb.BookStatistics;
import com.patterns.adapter.libraries.libraryb.Statistics;

import java.util.Map;

public class MedianAdaptee implements BookStatistics {

    @Override
    public int averagePublicationYear(Map<BookSignature, Book> books) {
        Statistics statistics = new Statistics();
        return statistics.averagePublicationYear(books);
    }

    @Override
    public int medianPublicationYear(Map<BookSignature, Book> books) {
        Statistics statistics = new Statistics();
        return statistics.medianPublicationYear(books);
    }
}
