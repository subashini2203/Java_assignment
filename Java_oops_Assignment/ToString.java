class Book {
    String title;
    String author;
    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }
public String toString() {
        return title + " by " + author;
    }
    public boolean equals(Object obj) {
     
        if (obj instanceof Book) {
            Book b = (Book) obj;
            return this.title.equals(b.title) && this.author.equals(b.author);
        }
        return false;
    }
}
public class ToString {
    public static void main(String[] args) {
      
        Book book1 = new Book("Java Basics", "John");
        Book book2 = new Book("Java Basics", "John");

        // Print both objects
        System.out.println("Book 1: " + book1); 
        System.out.println("Book 2: " + book2); 

      
        if (book1.equals(book2)) {
            System.out.println("Both books are equal.");
        } else {
            System.out.println("Books are not equal.");
        }
    }
}





