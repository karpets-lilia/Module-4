package book;

import java.util.ArrayList;

/*Создать класс Book, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы и
 * метод  toString(). Создать второй класс, агрегирующий массив типа Book, с подходящими конструкторами и
 * методами. Задать критерии выбора данных и вывести эти данные на консоль.
 *    Book: id, название, автор(ы), издательство, год издания, количество страниц, цена, тип переплета.
 *    Найти и вывести:
 *    a) список книг заданного автора;
 *    b) список книг, выпущенных заданным издательством;
 *    c) список книг, выпущенных после заданного года.*/
public class Main {
    public static void main(String[] args) {
        BookStore awesomebook = new BookStore("Book wardrobe", new ArrayList<Book>());
        awesomebook.addBook("1984", "George Orwell", "HarperCollins Canada",
                1949, 432, 22.78f, "hardcover");
        awesomebook.addBook("The Sun also Rises", "Ernest Hemingway", "New York Review of Books",
                1926, 432, 45.12f, "hardcover");
        awesomebook.addBook("Martin Eden", "Jack London", "HarperCollins Canada",
                1909, 432, 16.16f, "hardcover");
        awesomebook.addBook("Farenheit 451", "Ray Bradbury", "New York Review of Books",
                1953, 432, 54.14f, "hardcover");
        awesomebook.addBook("The Call of the Wild", "Jack London", "HarperCollins Canada",
                1903, 432, 22.78f, "hardcover");

        System.out.println("книги Джека Лондона в магазине Awesomebook :");
        ArrayList<Book> autorsBook = awesomebook.authorsBooks("Jack London");
        for (Book book : autorsBook) {
            System.out.println(book);
        }

        System.out.println("\nкниги изданные \"New York Review of Books\":");
        ArrayList<Book> publishersBook = awesomebook.publishersBook("New York Review of Books");
        for (Book book : publishersBook) {
            System.out.println(book);
        }

        System.out.println("\n\n" +
                "книги выпущены после 1905:");
        ArrayList<Book> releasedAfter = awesomebook.releasedAfter(1905);
        for (Book book : releasedAfter) {
            System.out.println(book);
        }
    }
}

