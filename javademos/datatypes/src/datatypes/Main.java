package datatypes;

public class Main {

	public static void main(String[] args) {

		// data Tpyes
//Primitive Types
//�lkel tip anlam�na gelirler, bir dilin en temel veri tipleridir .
/*
.
.
.
*/
		
		
/*Boolean, iki farkl� de�er d�nd�ren bir mant�ksal veri tipidir ve bellekte 1 bitlik alan kaplar. Ya 'true' ya da 'false' de�erini d�nd�r�r. 
Yani atand��� de�i�ken veya istenen i�lemin sonucunda bu de�erlerden birini verir.		
�rnek*/
		boolean dogruMu = false;

		int number = 5;
		System.out.println(number > 0);
		System.out.println(number < 0);
		System.out.println(dogruMu);
//*char, veri tipinden bir de�i�ken, belli bir anda bir "tek karekter" tutabilir ve bellekte 2 bitlik bir alan kaplar.
//�rnek
		String sehir = "ANKARA";
		char karakter = 'A';
		System.out.println(karakter);
		System.out.println(sehir);
//*byte, de�er tipidir ve 1 bitlik alan kaplar.		-128 ile 127 say�lar� aras�nda de�er alabilir	
//�rnek

		byte sayi1 = 10;
		sayi1 = 27;

		System.out.println(sayi1);

//*short, de�er tipidir ve 2 bitlik alan kaplar.		-32758 ile 32767 say�lar� aras�nda de�er alabilir.	
//�rnek

		short sayi2 = 30;
		sayi2 = 61;

		System.out.println("�smail Abinin Say�s� = "+sayi2);

//*int, de�er tipidir ve bellekte 4 bitlik alan kaplar.			-21477483548  ile  2147483547 say�lar� aras�nda de�er alabilir. 		
//�rnek 	
		int sayi3 = 12;
		sayi3 = 27;

		System.out.println(sayi3);

//*long, de�er tipidir ve bellekte 8 bitlik alan kaplar.		-9223372035854775808 ile 9223372036854775807 say�ar� aras�nda de�er alabilir.
//�rnek
		long sayi4 = 60;
		sayi4 = 27;

		System.out.println(sayi4);

/*float veri tipi, reel say� tipidir. 32 bitlik b�y�kl��e sahiptir ve bellekte 4 bitlik bir alan kaplar. 		1.4�10^-45 ile 3.4�10^38 aral���nda bir de�er tan�mlanabilir.
float olarak belirlenmi� olan veri tipine integer bir de�er atand��� takdirde java taraf�ndan direk olarak 1.0 �eklinde alg�lan�r. 
Geli�tirme a�amas�nda hata olu�maz. Fakat float veri tan�mlarken (.) noktadan sonra de�i�ken de�erinin sonuna �f� veya �F� koyulmad��� takdirde geli�tirme esnas�nda hata al�nacakt�r. 
Sebebi ise javan�n bu de�i�keni double olarak alg�layacak olmas�d�r.*/
//�rnek
		float floatDeger1 = 35.4f; // dogru tanim
		System.out.println(floatDeger1);

//�rnek2
		float floatDeger2 = 4.5F; // dogru tanim
		System.out.println(floatDeger2);

//double veri tipi, reel say� tipidir. 64 bitlik b�y�kl��e sahiptir ve bellekte 8 bitlik alan kaplar. 		4.9�10^-324 ile 1.8�10^308 aras�nda bir de�er tan�mlanabilir. 
//�rnek
		double doubleDeger = 34.5;
		System.out.println(doubleDeger);
	}

}
