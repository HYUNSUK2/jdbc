package com.bigdata2017.jdbc.bookshop.main;

import java.util.Scanner;

public class BookShopApp {

	public static void main(String[] args) {
		//Book 객체의 정보를 출력
		System.out.println("*****도서 정보 출력하기******");
		displayBookInfo();
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("대여 하고 싶은 책의 번호를 입력하세요:");
		int num = scanner.nextInt();
		scanner.close();
		
		/*  state 정보 setting */
		
		
		//Book 객체의 정보를 출력
		System.out.println("*****도서 정보 출력하기******");
		displayBookInfo();		
	}
	
	private static void displayBookInfo() {
		
	}
}
