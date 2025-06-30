interface printable{
    void print();
}
interface showable{
    void show();
}
class Document implements printable, showable {
    public void print() {
        System.out.println("Printing document");
    }
    
    public void show() {
        System.out.println("Showing document");
    }
}
public class Multipleinherits {
    public static void main(String[] args) {
        Document doc = new Document();
        doc.print();
        doc.show();
    }
    
}
