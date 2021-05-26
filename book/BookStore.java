package book;

import java.util.ArrayList;

public class BookStore {
    private String bookStoreName;
    private ArrayList<Book> bookList;

    BookStore(String libraryName, ArrayList<Book> bookList) {
        this.bookStoreName = libraryName;
        this.bookList = bookList;
    }

    void addBook(String nameBook, String author, String publishingHouse, int yearOfPublishing, int numberOfPages, float price, String bindingType) {
        this.bookList.add(new Book(nameBook, author, publishingHouse, yearOfPublishing, numberOfPages, price, bindingType));
    }

    ArrayList<Book> authorsBooks(String author) {
        ArrayList<Book> authorList = new ArrayList<>();
        for (Book book : this.bookList) {
            if (book.getAuthor().equalsIgnoreCase(author)) {
                authorList.add(book);
            }
        }
        return authorList;
    }

    ArrayList<Book> publishersBook(String publisher) {
        ArrayList<Book> publisherList = new ArrayList<>();
        for (Book book : this.bookList) {
            if (book.getPublishingHouse().equalsIgnoreCase(publisher)) {
                publisherList.add(book);
            }
        }
        return publisherList;
    }

    ArrayList<Book> releasedAfter(int year) {
        ArrayList<Book> releasedAfterList = new ArrayList<>();
        for (Book book : this.bookList) {
            if (book.getYearOfPublishing() >= year) {
                releasedAfterList.add(book);
            }
        }
        return releasedAfterList;
    }

    public String getBookStoreName() {
        return bookStoreName;
    }

    public void setBookStoreName(String bookStoreName) {
        this.bookStoreName = bookStoreName;
    }

    public ArrayList<Book> getBookList() {
        return bookList;
    }

    public void setBookList(ArrayList<Book> bookList) {
        this.bookList = bookList;
    }
}


