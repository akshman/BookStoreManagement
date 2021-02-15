import java.util.*;


interface  PaymentStrategy
{
	void pay(float  amount);
}

class Card implements PaymentStrategy {
	String name;
	String cardNumber;
	int cvv;
	int dateOfExpiry;

	Card(String name, String cardNumber, int cvv, int dateOfExpiry) {
		this.name = name;
		this.cardNumber = cardNumber;
		this.cvv = cvv;
		this.dateOfExpiry = dateOfExpiry;
	}

	public String toString() {
		return name + ":" + cardNumber + ":" + cvv + ":" + dateOfExpiry;
	}

	public void pay(float amount) {
		System.out.println(amount + " Paid via Card");
	}
}

class Cash implements PaymentStrategy {
	String customerName;

	Cash(String customerName) {
		this.customerName = customerName;
	}

	public String toString() {
		return customerName;
	}

	public void pay(float amount) {
		System.out.println(amount + " Paid via Cash");
	}
}
//End of interface
public class Items extends Shop {

	String name;
	float price;
	int units;
	public Items(String n,float p,int u) {
		name=n;
		price=p;
		units=u;
	}
	int getUnits()
	{
		return units;
	}
	String getName()
	{
		return name;
	}
	float getPrice()
	{
		return price;
	}
	void addUnits(int a)
	{
		units=+a;
	}
	void removeUnits(int a)
	{
		units=-a;
	}
	
	public String toString() {
		return "Name :" + name + "\tPrice: " + price + "\tUnits: " + units;
	

}
}