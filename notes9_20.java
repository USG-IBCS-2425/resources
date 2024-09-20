class Person {
	//encapsulation
	private String address;

	public String getAddress() {
		return address;
	}

	public String getAddress(boolean dorm) {
		if (dorm) {
			return "827 N. Tacoma Ave.";
		}
		else {
			return address;
		}
	}

	public Person() {
		address = "123 Sesame St.";
	}
}
//inheritance
class Student extends Person {
	double grade;
	String tieColor;

	public Student() {
		super();
		grade = 100.0;
		tieColor = "green";
	}
}

class notes9_20 {

	public static void main(String[] args) {
		
		Person elmo = new Person();
		//polymorphism
		System.out.println(elmo.getAddress());
		System.out.println(elmo.getAddress(true));

		Student abby = new Student();
		System.out.println(abby.getAddress());


	}
}