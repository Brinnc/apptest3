package org.sp.testapp3.gittest;

public class Dog {
	String name;
	int age;
	String type;
	String color;

	public Dog(String name) {
		this.name = name;
		age=3;
		type="shiba";
		color="brown";
	}

	public static void main(String[] args) {
		new Dog("멍멍");
		System.out.println("강아지 탄생");
	}
}
