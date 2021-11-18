package by.bsuir.wt.lab_1.task_12;

public class Book implements Cloneable, Comparable<Book> {
    private int isbn;
    private String title;
    private String author;
    private int price;
    private static int edition;


    public Book(int isbn, String title, String author, int price) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.price = price;
    }

    @Override
    public boolean equals(Object b) {
        if (this == b) return true;
        if (b == null || getClass() != b.getClass()) return false;
        Book book = (Book) b;
        return price == book.price && title.equals(book.title) && author.equals(book.author);
    }

    @Override
    public int hashCode() {
        int result = 31 * price;
        result = 31 * result + (title != null ? title.hashCode() : 0);
        return result + (31 * result + (author != null ? author.hashCode() : 0));
    }

    @Override
    public String toString() {
        StringBuilder string = new StringBuilder("Book [");
        string.append("Title: ")
                .append(title)
                .append(", author: ")
                .append(author)
                .append(", price: ")
                .append(price)
                .append("]");
        return string.toString();
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return new Book(this.isbn, this.title, this.author, this.price);
    }

    @Override
    public int compareTo(Book o) {
        return (isbn < o.isbn) ? -1 : ((isbn == o.isbn) ? 0 : 1);
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPrice() {
        return price;
    }
}