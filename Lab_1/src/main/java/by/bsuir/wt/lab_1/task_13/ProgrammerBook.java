package by.bsuir.wt.lab_1.task_13;

import by.bsuir.wt.lab_1.task_12.Book;


public class ProgrammerBook extends Book {
    private String language;
    private int level;

    public ProgrammerBook(int isbn, String title, String author, int price) {
        super(isbn, title, author, price);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        ProgrammerBook programmerBook = (ProgrammerBook) o;
        return level == programmerBook.level && language.equals(programmerBook.language);
    }

    @Override
    public int hashCode() {
        return 31 * super.hashCode()
                + 31 * (language == null ? 0 : language.hashCode())
                + 31 * level;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("Programmer book [");
        stringBuilder.append("Language: ")
                .append(language)
                .append(", level: ")
                .append(level);
        return stringBuilder.toString();
    }
}
