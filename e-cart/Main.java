
/**
 * Write a description of Main2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
//import required packages here
import java.util.Scanner;
class Item
{
  private int price;
  //create various method to return attribute value(s)
  public void setPrice(int price){
      this.price = price;
  }
  public int getPrice(){
      return price;
  }
}
   
class Customer extends Item
{
  private String product;
  private int quantity;
  //create various method to return attribute value(s
  public void setProduct(String product){
      this.product = product;
  }
  public void setQuantity(int quantity){
      this.quantity = quantity;
  }
  public String getProduct(){
      return product;
    }
  public int getQuantity(){
      return quantity;
    }
}

class Bill extends Customer
{
  //implement your logic to calculate total price
  void Calculate(int quantity, int price){
      System.out.println("Total Price is : "+quantity*price);
    }
}
public class Main
{
  public static void main(String[] args)
  {
      Scanner in= new Scanner(System.in);
      /*String product = in.nextLine();
      int price = in.nextInt();
      int quantity = in.nextInt();*/
      Bill b= new Bill();
      b.setProduct(in.nextLine());
      b.setPrice(in.nextInt());
      b.setQuantity(in.nextInt());
      b.Calculate(b.getQuantity(),b.getPrice());
  }
}
