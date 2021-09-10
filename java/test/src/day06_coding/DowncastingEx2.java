package day06_coding;

class Person2 {
	String name;
	String id;

	public Person2(String name) {
		this.name = name;
	}
}

class Student2 extends Person2 {
	String grade;
	String department;

	public Student2(String name) {
		super(name);
	}
}

public class DowncastingEx2 {
	public static void main(String[] args) {
		Person2 p = new Student2("이재문"); // 업캐스팅(발생
		Student2 s;
		s = (Student2) p; // 다운캐스팅
		System.out.println(s.name); // 오류(없음
		s.grade = "A"; // 오류(없음
	}
}