package stringsDemo;

public class Main {

	public static void main(String[] args) {
		String mesaj = "    Bug�n hava �ok g�zel.    ";
		System.out.println(mesaj);

		System.out.println("Eleman say�s� : " + mesaj.length()); 		// length; String length metodu, String'de yaz�lan
																		// karakter say�s�n� d�nd�r�r.
		System.out.println("5. eleman : " + mesaj.charAt(4)); 			// Bir string dizesi i�indeki karakterlerden belirtilen
																		// s�radaki karakter al�r.
		System.out.println(mesaj.concat(" Ya�as�n !")); 				// Bir string ifadeyi ba�ka bir string ifadeyle birle�tirmek
																		// i�in kullan�l�r.
		System.out.println(mesaj.startsWith("B")); 						// Tan�ml� olan bir stringin hangi karakterle ba�lay�p ba�lamad���
																		// bulmak i�in startsWith metodunu kullan�r�z.
		System.out.println(mesaj.endsWith(".")); 						// Tan�ml� olan bir stringin hangi karakterlerle bitip bitmedi�ini
																		// bulmak i�in ise endsWith kullan�l�r.
		char[] karakterler = new char[5];
		mesaj.getChars(0, 5, karakterler, 0); 							// String nesnesi i�indeki belli say�daki karakeri diziye aktarmam�z� sa�lar.
		System.out.println(karakterler);
		System.out.println(mesaj.indexOf("a"));					    	/*Stringimizin i�erisindeki herhangi bir karakterin hangi s�rada oldu�unu d�nd�r�r.
																	 	Ancak Java s�f�rdan saymaya ba�lar.*/
		System.out.println(mesaj.lastIndexOf("a"));				
		
		String yeniMesaj = mesaj.replace( ' ', '_').replace('_', '*'); 	//Replace; metodu uyguland��� string i�reisinde karakter yada karakter gruplar�n�n de�i�tirmeyi sa�lar.
		System.out.println(yeniMesaj);
		System.out.println(mesaj.substring(2, 4));	 					//Substring; string ifadeyi par�alamaya yarar.
		
		for (String kelime : mesaj.split(" ")) {						//Split metodu, uyguland��� string'i par�alara b�ler ve bu par�alar� bir diziye(array) atar.
			System.out.println(kelime);
		}
		
		System.out.println(mesaj.toLowerCase());						//toLowerCase metodu, b�t�n metini k���k harf ile yazd�r�r.
		System.out.println(mesaj.toUpperCase());						//toUpperCase metodu, b�t�n metini b�y�k harf ile yazd�r�r.
		
		
		System.out.println(mesaj.trim());								//trim metodu, metinin ba��ndaki ve sonunda ki fazla bo�luklar� siler.
		
	}

}
