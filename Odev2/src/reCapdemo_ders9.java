
public class reCapdemo_ders9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// DERS 9 - IF
		int sayi1 = 20;
		int sayi2 = 30;
		int sayi3 = 35;

		int enBuyuk = sayi1;

		if (enBuyuk < sayi2) {
			enBuyuk = sayi2;
		}
		if (enBuyuk < sayi3)

		{
			enBuyuk = sayi3;
		}

		System.out.println("En büyük =" + enBuyuk);

		// DERS 10 - SWITCH

		char grade = 'D';

		switch (grade) {
		case 'A':
			System.out.println("Mükkemmel: Geçtiniz");
			break;
		case 'B':
			System.out.println("Çok iyi: Geçtiniz");
			break;
		case 'C':
			System.out.println("İyi: Geçtiniz");
			break;
		case 'D':
			System.out.println("Kötü: Geçtiniz");
			break;
		}
		deafult: System.out.println("Geçersiz not girdiniz");

	}

}
