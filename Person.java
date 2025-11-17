package practice1;

public class Person {
	
	
	// Field
	private String name;
	private int age;
	private double height;
	private double weight;
	private String address;
	private String phone;
	private String email;
	
	
	// Constructor
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	
	// Getters and Setters
	public void setBodyInfo (double height, double weight) {
		if(height < 0 || weight < 0) {
			System.out.println("잘못된 값입니다.");
			return;
		}
		this.height = height;
		this.weight = weight;
	}
	
	public void setContactInfo (String address, String phone, String email) {
		this.address = address;
		this.phone = phone;
		this.email = email;
	}
	
	
	// Method
	// 인적사항 메소드
	public void introduce() {
		System.out.println("이름 : " + name + "\n나이 : " + age + "\n주소 : " + address + "\n휴대폰 번호 : " + phone + "\n이메일 : " + email);
	}
	
	// 신체 스펙
	public void showBodyInfo() {
		System.out.println("키 : " + height + "cm");
		System.out.println("몸무게 : " + weight + "kg");
	}
	
	// BMI 계산
	public double calculateBmi() {
		double meter = height / 100.0;
		return weight / (meter*meter);
	}
	
	// BMI 출력
	public void printBmiResult() {
		double bmi = calculateBmi();
		System.out.println("BMI : " + bmi);
		
		if(bmi < 18.5)
			System.out.println("-저체중-");
		else if(bmi < 25)
			System.out.println("-정상체중-");
		else if(bmi < 30)
			System.out.println("-과체중-");
		else 
			System.out.println("-비만-");
	}
	
	
}
