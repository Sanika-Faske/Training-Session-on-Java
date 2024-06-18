package company.com;

public class Main {

	public static void main(String[] args) {
	
		System.out.println("Hello");
		Developer developer = new Developer("Sanika", 1, 56000, "JAVA");
		developer.displayDetails();
		
		Manager manager=new Manager("Sanya",2,89000);
		manager.displayDetails();

}

}