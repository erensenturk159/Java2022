
public class odev2_sesliHarfler {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char harf = 'A';

		//sesli harf girildiği varsayıldığı takdirde, yoksa sesli-sessiz kontrolü konulmalı.
		switch (harf) {
		case 'A':
		case 'I':
		case 'O':
		case 'U':
			System.out.println("Kalın sesli harf");
			break;
		default:
			System.out.println("İnce sesli harf");
		}

	}

}
