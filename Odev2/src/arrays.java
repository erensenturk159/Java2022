
public class arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ogrenci1 = "Eren";
		String ogrenci2 = "Ali";
		String ogrenci3 = "Mehmet";
		String ogrenci4 = "Ceren";
		String ogrenci5 = "Fevzi";

		System.out.println(ogrenci1);
		System.out.println(ogrenci2);
		System.out.println(ogrenci3);
		System.out.println(ogrenci4);
		System.out.println(ogrenci5);

		
		System.out.println("--------------------");

		String[] ogrenciler = new String[5]; //java.lang.ArrayIndexOutOfBoundsException: dizi sayısından fazla değer atamak istenince alınan hata

		ogrenciler[0] = "Eren";
		ogrenciler[1] = "Ali";
		ogrenciler[2] = "Mehmet";
		ogrenciler[3] = "Ceren";
		ogrenciler[4] = "Fevzi";

		for (int i = 0; i < ogrenciler.length; i++) {

			System.out.println(ogrenciler[i]);

		}
		
		System.out.println("--------------------");

		for(String ogrenci:ogrenciler) {
			System.out.println(ogrenci);
		}

	}

}
