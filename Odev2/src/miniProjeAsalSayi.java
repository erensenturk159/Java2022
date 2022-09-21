
public class miniProjeAsalSayi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 5;
		int moderation = number % 2;
		boolean result = true;
		System.out.println(moderation);
		
		if(number==1) {
			System.out.println("Sayı asal değildir");
			return;
		}else if(number<1) {
			System.out.println("Geçersiz sayı");

		}

		for (int i = 2; i < number; i++) {
			
			if(number%i == 0) {
			result = false;
			}
		}
		
		if(result) {
			System.out.println("Sayı asaldır");
		}else {
			System.out.println("Sayı asal değildir");
		}
		
		
		
		for (int i = number-1; i >=2 ; i--)
		{
			if(number%i == 0) {
				result = false;
			}else 
				result= true;
		}
		
		if(result) {
			System.out.println("Sayı asaldır");
		}else {
			System.out.println("Sayı asal değildir");
		}
		
	}

}
