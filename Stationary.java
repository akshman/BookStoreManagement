public class Stationary extends Items{
    String brand;
    Stationary(String name, float price, int units,String brand) {
        super(name, price, units);
        this.brand = brand;
    }
    public String getBrand(){
        return brand;
    }

    public String toString() {
        return super.toString() + "\tBrand: " + brand+ "\n";
    }
}
