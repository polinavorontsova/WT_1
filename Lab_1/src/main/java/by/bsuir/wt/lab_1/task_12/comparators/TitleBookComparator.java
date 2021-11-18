package by.bsuir.wt.lab_1.task_12.comparators;

import by.bsuir.wt.lab_1.task_12.Book;

import java.util.Comparator;

public class TitleBookComparator implements Comparator<Book> {

    @Override
    public int compare(Book o1, Book o2) {
        return o1.getTitle().compareTo(o2.getTitle());
    }
}
