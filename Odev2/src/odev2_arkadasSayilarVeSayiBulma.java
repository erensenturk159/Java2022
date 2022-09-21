
public class odev2_arkadasSayilarVeSayiBulma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sayi1 = 220;
		int sayi2 = 284;
		int toplam1 = 0;
		int toplam2 = 0;
		
		for (int i=1;i<sayi1;i++)
		{
			if(sayi1%1==0) {
				toplam1=toplam1+i;
			}
		}
		
		for(int i=1;i<sayi2;i++) {
			toplam2 = toplam2 + i;
		}
	
	
	if(sayi1==toplam2 && sayi2 == toplam1)
	{
		System.out.println("Sayılar arkadaştır.");
	}else {
		System.out.println("Sayılar arkadaş değildir.");
	}

	int [] sayilar = new int[] {1,2,5,7,9,0};
	int aranacak = 5;
	boolean varMi = false;
	
	for (int sayi:sayilar) {
		if(sayi==aranacak)
			varMi = true;
		break;
	}
	
	if(varMi) {
		System.out.println("Sayı mevcuttur");
	}else {
		System.out.println("Sayi mevcut degildir");
	}
	
	
}
}
