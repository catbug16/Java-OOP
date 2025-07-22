public class Book {
    String title;
    String author;
    double price;


    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }


    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.price = 100.0;
    }

    public void displayInfo() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }

  
    public static void main(String[] args) {
        Book book1 = new Book("1984", "George Orwell", 150.0);
        Book book2 = new Book("The Alchemist", "Paulo Coelho");

        System.out.println("Book 1 Info:");
        book1.displayInfo();

        System.out.println("\nBook 2 Info:");
        book2.displayInfo();
    }
}
``
