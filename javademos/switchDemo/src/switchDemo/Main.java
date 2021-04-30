package switchDemo;

public class Main {

	public static void main(String[] args) {
		char grade = 'C';

		switch (grade) {
		case 'A':
			System.out.println("M�kemmel : Ge�tiniz");
			break;
		case 'B':
			System.out.println("�ok �yi : Ge�tiniz");
			break;
		case 'C':
			System.out.println("�yi : Ge�tiniz");
			break;
		case 'D':
			System.out.println("Fena De�il : Ge�tiniz");
			break;
		case 'F':
			System.out.println("Maalesef Kald�n�z");
			break;
		default:
			System.out.println("Ge�ersiz not girdiniz");
		}

		// Notlar;

		/* Case;
		 Java da bulunan bir di�er karar yap�s�d�r. Switch �al��ma mant��� olarak if �
		 else if yap�s�na benzer �ekildedir.
		 Yukar�da g�r�ld��� gibi switch case yap�s�nda hangi blo�un �al��t�r�laca��n�
		 secim de�i�keni belirler.*/

		/* Break;
		 D�ng�y� aniden sonland�rmak veya d�ng�y� k�rmak i�in break komutunu
		 kullan�r�z.
		 D�ng�n� biti�inin nerede olaca��n� bilmedi�imiz bir d�ng�y� ancak, break
		 komutuyla sonland�rabiliriz.
		 �artlar sa�land���nda, break komutu devreye girer ve d�ng� sonland�r�l�r.*/

		/* Default;
		 Default ise asl�nda if , else yap�lar�ndan else kar��l�k geliyor diyebiliriz.
		 Defaultu kullanabilir veya kullanmayabilirsiniz. Else ile ayn� g�revi g�r�yor
		 yani ko�ullardan hi�biri sa�lanmazsa default un i�inde belirti�iniz i�lem
		 ger�ekle�ecektir.*/

	}

}
