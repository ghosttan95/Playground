
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyModel2T model = new MyModel2T();
	}

}
class MyModel1{
	protected String camera = "2";
	protected String lock = "No Lock";
	protected String display = "5";
	public MyModel1(){
		System.out.println("Features of MyModel 1");
		System.out.println("Camera mega pixels: "+camera);
	}
}
class MyModel2 extends MyModel1{
	protected String camera = "5";
	protected String lock = "Fingerprint";
	MyModel2(){
		System.out.println("Features of MyModel 2");
		System.out.println("Camera mega pixels: "+camera);
		System.out.println("Lock mechanism: "+lock);
		System.out.println("Display size: "+display);
	}
}
class MyModel2T extends MyModel2{
	protected String camera = "16";
	protected String display = "6";
	MyModel2T(){
		System.out.println("Features of MyModel 2T");
		System.out.println("Camera mega pixels: "+camera);
		System.out.println("Lock mechanism: "+lock);
		System.out.println("Display size: "+display);
	}
}