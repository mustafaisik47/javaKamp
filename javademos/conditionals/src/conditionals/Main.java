package conditionals;

public class Main {

	public static void main(String[] args) {
		int sayi = 200;
		if (sayi > 30) {
			System.out.println(sayi);
			System.out.println("Say� 30'dan b�y�kt�r");
		}

		// �art bloklar�nda, tek e�ittir say�ya de�er atar
		if (sayi < 15) {
			System.out.println("say� 15'den k���kt�r");
		} else if (sayi == 20) {
			System.out.println("Say� 15'den k���k de�ildir");
		}
	}

}
