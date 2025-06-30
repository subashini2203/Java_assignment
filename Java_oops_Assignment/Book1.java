class Book {
    String title;
    String author;

    // Constructor
    Book(String t, String a) {
        title = t;
        author = a;
    }

    // toString() method
    public String toString() {
        return title + " by " + author;
    }

    // equals() method
    public boolean equals(Object obj) {
        Book b = (Book) obj;
        return this.title.equals(b.title) && this.author.equals(b.author);
    }
}

public class Book1 {
    public static void main(String[] args) {
        Book b1 = new Book("Java", "Hello");
        Book b2 = new Book("Java", "Hello");

      
        System.out.println(b1);  
        System.out.println(b2);  

       
        if (b1.equals(b2)) {
            System.out.println("Both books are same");
        } else {
            System.out.println("Books are different");
        }
    }
}




    

