package loopDemo;

public class Main {

	public static void main(String[] args) {

		// For
		for (int i = 2; i <= 10; i += 2) {
			System.out.println(i);
		}
		System.out.println("For d�ng�s� bitti");

		// while
		int i = 2;
		while (i <= 10) {
			System.out.println(i);
			i += 2;
		}

		// infinite loop / sonsuz d�ng�

		System.out.println("While D�ng�s� Bitti");

		// do-while = program sat�r sat�r ilerledi�i i�in "do" �nce �al��acak. k�sacas� Do-While d�g�s�nde �art uymasa bile kodumuz �al��acakt�r.
		int j = 1;
		do {
			System.out.println(j);
			j += 2;
		} while (j < 10);
		System.out.println("Do-While D�ng�s� Bitti");
		
		
	}

}
