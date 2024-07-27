package pro.sky.java.course2;

public class Main {
    public static void main(String[] args) {
        Book[] books = new Book[]{
                new Book("Книга 1", "Автор 1"),
                new Book("Book 2", "Author 2")
        };
        System.out.println(books[1]);
    }
}