package com.vti.frontend;

import com.vti.entity.Mentor;
import com.vti.entity.Person;

public class Demo {
	public static void main(String[] args) {
//		System.out.println("Hello VTI!!");
//		Viết chương trình tính tổng 2 số
//		10 20
//		Scanner scanner = new Scanner(System.in);
//
//		System.out.println("Mời bạn nhập vào số thứ 1: ");
//		int number1 = scanner.nextInt();
//
//		System.out.println("Mời bạn nhập vào số thứ 2: ");
//		int number2 = scanner.nextInt();
//
//		int resutlSum = number1 + number2;
//
//		System.out.println("Tổng của 2 số là: " + resutlSum);

//		Viết chương trình quản lý học viên(Person)
//		Học viên
//		id, name, address
		System.out.println("CHƯƠNG TRÌNH QUẢN LÝ");
		Person person1 = new Person();
		person1.setId(1);
		person1.setName("daonq1");
		person1.setAddress("HN");

		Person person2 = new Person();
		person2.setId(2);
		person2.setName("daonq2");
		person2.setAddress("HN");

		Person person3 = new Person();
		person3.setId(3);
		person3.setName("daonq3");
		person3.setAddress("HN");

		System.out.println("Thông tin person1: ");
		System.out.println("id: " + person1.getId());
		System.out.println("name: " + person1.getName());
		System.out.println("address: " + person1.getAddress());

		person1.say();
		System.out.println(person1.toString());
		System.out.println(person2.toString());

//		Access Modifier
//		Phạm vi truy cập
//		Public
//		Private
//		Protected
//		Default

//		Package

//		4 tính chât trong lập trình hướng đối tượng
//		Tính đóng gói: private getter() setter()
//		Tính kế thừa: Extend, supper
//		Tính đa hình: overload, override
//		Tình trừu tượng: abtract, interface

		System.out.println("---------------------------------");
//		Demo kế thừa
//		Tạo Mentor
		Mentor mentor1 = new Mentor();
		mentor1.setId(1);
		mentor1.setName("Mentor 1");
		mentor1.setAddress("HN");
		mentor1.setYearsofexperience(10);
		mentor1.intro();
	}
}
