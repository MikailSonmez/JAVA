package day_Practice8_While_DoWhile;

import java.util.Scanner;

public class Q07 {

	public static void main(String[] args) {
		 // Kullanıcıda x  girilene kadar ekrana "Program çalışıyor" yazan
        // ve x girildiğinde ise "Program bitti" yazan programı yazınız.
		
		Scanner scan = new Scanner(System.in);
		String str = "";
		
		
		do {
			str = scan.nextLine();
			if (str.equalsIgnoreCase("X")) break;  // donguyu kiriyor
				
			System.out.println("Program calisiyor");
		} while (!str.equalsIgnoreCase("X"));
		
		
		System.out.println("Program bitti");
		
		
		scan.close();
	}

}
