public class NewsPaper extends Items {
    String publisher;
    NewsPaper(String name, float price, int units,String publisher) {
        super(name, price, units);
        this.publisher=publisher;
    }
    public String getPublisher(){
        return publisher;
    }

    public String toString() {
        return super.toString() + "\tPublisher: " + publisher+ "\n";
    }
}
