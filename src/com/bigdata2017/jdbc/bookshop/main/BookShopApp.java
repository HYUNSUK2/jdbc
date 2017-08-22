package com.bigdata2017.jdbc.bookshop.main;

import java.util.Scanner;

public class BookShopApp {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		while( true ) {
			System.out.println("*****도서 정보 출력하기******");
			displayBookInfo();
			
			System.out.print("대여 하고 싶은 책의 번호를 입력하세요:");
			String input = scanner.nextLine();
			
			// quit이면 종료
			if( "quit".equals( input.toLowerCase() ) ) {
				break;
			}
			
			// 숫자가 아님
			if( input.matches("\\d+") == false ) {
				continue;
			}
			
			Long no = Long.parseLong( input );
			System.out.println( no );
			
			/*  state 정보 setting */
		}
		
		scanner.close();
	}
	
	private static void displayBookInfo() {
		
	}
}
