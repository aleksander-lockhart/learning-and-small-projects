package testing.kodilla;

public class Book {

    private String bookName;
    private int issueDate;

    public Book(String bookName, int issueDate) {
        this.bookName = bookName;
        this.issueDate = issueDate;
    }

    public String getBookName() {
        return bookName;
    }

    public int getIssueDate() {
        return issueDate;
    }
}
