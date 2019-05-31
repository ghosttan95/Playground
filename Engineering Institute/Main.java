import java.util.Scanner;
class Faculty{
	int baseSalary;
	public void salary(int baseSalary) {
		System.out.println("Base Salary: "+baseSalary);
	}
	
}
class CSE extends Faculty{
	public void salary(int baseSalary) {
		System.out.println("CSE Faculty: "+(baseSalary+3000));
	}
}
class IT extends Faculty{
	public void salary(int baseSalary) {
		System.out.println("IT Faculty: "+(baseSalary+5000));
	}
}
class ECE extends Faculty{
	public void salary(int baseSalary) {
		System.out.println("ECE Faculty: "+(baseSalary+4500));
	}
}
public class Main{
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		int baseSalary = input.nextInt();
		Faculty f =new Faculty();
		f.salary(baseSalary);
		CSE c = new CSE();
		c.salary(baseSalary);
		IT it = new IT();
		it.salary(baseSalary);
		ECE e = new ECE();
		e.salary(baseSalary);
	}
}