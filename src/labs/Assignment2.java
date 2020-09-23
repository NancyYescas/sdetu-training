package labs;

public class Assignment2 {

	public static void main(String[] args) {
		// Create a Student
		Student st1 = new Student("Jose","123456789");
		Student st2 = new Student("Ana","987654321");
		Student st3 = new Student("Peter","678912345");
		
		st1.enroll("Math");
		st1.enroll("Biology");
		st1.showCourses();
		st1.checkBalance();
		st1.pay(100);
		st1.checkBalance();
		System.out.println(st1.toString());

	}

}

class Student{
	
	//Properties
	private static int iD=100;
	private String userId;
	private String name;
	private String ssn;
	private String email;
	private String phone;
	private String city;
	private String state;
	private String classes = "";
	private static int costOfClass = 100;
	private int balance = 0;
	
	
	public Student(String name, String ssn) {
		iD++;
		this.name = name;
		this.ssn = ssn;
		setUserId();
		setEmail();
	}
	
	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	
	private void setEmail() {
		email = name + "@studentmail.com";
		System.out.println("Your email is: " + email);
	}
	
	public String getEmail() {
		return email;
	}
	
	private void setUserId() {
		int max = 9000;
		int min = 1000;
		int randomNumber = (int)(Math.random()*(max - min));
		randomNumber = randomNumber + min;
		userId = iD + "" + randomNumber + ssn.substring(5);
		System.out.println("User ID: " + userId);
	}
	
	public void enroll(String classes) {
		this.classes= this.classes + "\n" + classes;
		balance = balance + costOfClass;
	}
	
	public void pay(int amount) {
		System.out.println("You paid: " +amount);
		balance = balance - amount;
	}
	
	public void checkBalance() {
		System.out.println("Balance: " +balance);
	}
	
	public String toString() {
		return "Name: " +name+ "\nClasses: " +classes+ "\nBalance: " +balance ;
	}
	
	public void showCourses() {
		System.out.println(classes);
	}
}
