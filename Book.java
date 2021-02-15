public class Book extends Items{

    String isbn;
    Book(String name, float price, int units, String isbn) {
        super(name, price, units);
        this.isbn=isbn;
    }

    public String getIsbn(){
        return isbn;
    }

    public String toString() {
        return super.toString() + "\tISBN: " + isbn + "\n";
    }
}
