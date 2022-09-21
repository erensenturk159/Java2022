
public class odev2_mükemmelSayi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// kendinden başka pozitif tam bölenlerin sayısı kendisine eşit olan sayılar.
		// örnek olarak 6 --> 1,2,3 bölünür ve toplamı 6 yapar.
		// örnek olarak 28 --> 1,2,4,7,14 bölünür ve toplamı 28 yapar.

		int number = 27;
		int newNumber = 0;
		
		for (int i = 1; i < number; i++) {
			
			if(number%i == 0) {
				newNumber = newNumber + i;
			}
		}
		
		if(newNumber == number) {
			System.out.println("Sayı mükemmel sayıdır");
		}else
			System.out.println("Sayı mükemmel sayı değildir");

	}

}
