package by.bsuir.wt.lab_1.task_12.comparators;

import by.bsuir.wt.lab_1.task_12.Book;
import java.util.Comparator;

public class AuthorTitlePriceComparator implements Comparator<Book> {

    @Override
    public int compare(Book o1, Book o2) {
        int authorCompareRes = o1.getAuthor().compareTo(o2.getAuthor());
        if (authorCompareRes == 0) {
            int titleCompareRes = o1.getTitle().compareTo(o2.getTitle());
            if (titleCompareRes == 0) {
                return o1.getPrice() - o2.getPrice();
            } else {
                return titleCompareRes;
            }
        } else {
            return authorCompareRes;
        }
    }
}
