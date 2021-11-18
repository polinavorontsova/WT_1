package by.bsuir.wt.lab_1.task_12.comparators;

import by.bsuir.wt.lab_1.task_12.Book;

import java.util.Comparator;

public class AuthorThenTitleComparator implements Comparator<Book> {

    @Override
    public int compare(Book o1, Book o2) {
        int compareAuthorRes = o1.getAuthor().compareTo(o2.getAuthor());
        return compareAuthorRes != 0 ? compareAuthorRes : o1.getTitle().compareTo(o2.getTitle());
    }
}
