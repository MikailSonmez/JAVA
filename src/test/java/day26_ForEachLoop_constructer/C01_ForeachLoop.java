package day26_ForEachLoop_constructer;

public class C01_ForeachLoop {

	public static void main(String[] args) {
		// iki String array olusturunuz ve bu array�lerdeki 
		//ortak elemanlari For-each loop kullanarak bulunuz.
		//Sonucu ekrana yazdiriniz.
		//Ortak eleman yoksa ekrana �Ortak eleman yok� yazdiriniz
		
		
		String arr1[]= {"A","C","B"};
		String arr2[]= {"A","R","O"};
		
		int flag=0;
		
		for (String each1 : arr1) {
			
			for (String each2 : arr2) {
				
				if (each1.equals(each2)) {
					System.out.println(each1 + " "); // A
					flag++;
				}
				
			}
		}
		
		if (flag==0) {
			System.out.println("Ortak eleman yok");
		}


	}

}