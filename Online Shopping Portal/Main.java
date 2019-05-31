import java.util.Scanner;
class Users{
	protected int id;
	protected String name;
	protected long mobileNumber;
	protected String address;
	Users(int id, String name, long mobile, String address){
		this.id  =id;
		this.name = name; 
		this.mobileNumber = mobile;
		this.address= address;
	}
	//setter methods for user
	public void setId( int id ) {
		this.id = id;
	}
	public void setName( String name ) {
		this.name = name;
	}
	public void setMobileNumber( long mobileNumber ) {
		this.mobileNumber = mobileNumber;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	//getter method for user
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public long getMobileNumber() {
		return mobileNumber;
	}
	public String getAddress() {
		return address;
	}
	
	//Method of user
	public void editAddress(String newAddress) {
		System.out.println(name+", "+address );
		address = newAddress;
		System.out.println(name+", "+address);
	}
	public void displayProfileDetails() {
		System.out.println(name+", "+mobileNumber);
	}
}

class Customers extends Users{
	String dob;
	char gender;
	String orderHistory;
	Customers(int id, String name, long mobile, String address, String dob, char gender, String orderHistory){
		super(id, name, mobile, address);
		this.dob = dob;
		this.gender = gender;
		this.orderHistory = orderHistory;
	}
	public void placeOrder() {
		System.out.println("Order placed successfully!");
	}
}
class Suppliers extends Users{
	int itemsStock;
	String paymentStatus;
	float feedbackRating;
	Suppliers(int id, String name, long mobile, String address, int itemsStock, String paymentStatus, float feedbackRating){
		super(id, name, mobile, address);
		this.itemsStock = itemsStock;
		this.paymentStatus = paymentStatus;
		this.feedbackRating = feedbackRating;
	}
	
	public void increaseStockLevel( int level ) {
		System.out.println(name+", "+(itemsStock+level));
	}
}
public class Main{
	public static void main(String args[]) {
		Customers customerObj1 = new Customers(1001,"Saakshi",9000000000l,"Bangalore","16-Jul-1990",'F',"Lakme Kajal, Salwar");
		Customers customerObj2 = new Customers(1008,"Rahul",9000000001l,"Chennai","27-Jan-1992",'M',"T-Shirt, Jeans");
		Suppliers supplierObj1 = new Suppliers(7901,"ABC Traders",8000000000l,"Mumbai",10,"Paid",4.75f);
		Suppliers supplierObj2 = new Suppliers(7972,"XYZ Enterprises",8000000900l,"Kolkata",7, "Unpaid",4.35f);
		
		//Task 1
		customerObj1.displayProfileDetails();
		customerObj2.displayProfileDetails();
		supplierObj1.displayProfileDetails();
		supplierObj2.displayProfileDetails();
		
		//task2
		customerObj1.editAddress("Coimbatore");
		supplierObj1.editAddress("Delhi");
		
		//task3
		customerObj1.placeOrder();
		
		//task4
		supplierObj1.increaseStockLevel(5);
		supplierObj2.increaseStockLevel(10);
		
	}
	
}