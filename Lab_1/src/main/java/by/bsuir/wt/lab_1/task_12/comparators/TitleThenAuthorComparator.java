package by.bsuir.wt.lab_1.task_12.comparators;

import by.bsuir.wt.lab_1.task_12.Book;

import java.util.Comparator;

public class TitleThenAuthorComparator implements Comparator<Book> {

    @Override
    public int compare(Book o1, Book o2) {
        int compareTitleRes = o1.getTitle().compareTo(o2.getTitle());
        return compareTitleRes != 0 ? compareTitleRes : o1.getAuthor().compareTo(o2.getAuthor());
    }
}
