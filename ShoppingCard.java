package Shopping;

import java.util.ArrayList;
import java.util.Scanner;

public class ShoppingCard <T> {

	private Product[] urunler;
	private static double toplamTutar;
	private static ArrayList<Product> sepetUrun=new ArrayList<Product>();
		
	public ShoppingCard(Product[] urunler) {
		this.urunler = urunler;
	}
	public static double getToplamTutar() {
		return toplamTutar;
	}
	public Product[] getUrunler() {
		return urunler;
	}

	public void showProduct(Product[] urunler) {
		Scanner in=new Scanner(System.in);
		for (int i = 0; i < urunler.length; i++) {
			System.out.println((i+1)+" - "+urunler[i].info());
		}
	}
	
	public void addBasket() {
		Scanner in=new Scanner(System.in);
		
		showProduct(urunler);
		System.out.print(RenkCo.PURPLE+"\nAlışverişi Bitir: 0"+"\nSepetinize eklemek istediğiniz ürün: "+RenkCo.RESET);
		int basket=in.nextInt();
			
		if(basket==0) {
			if(sepetUrun.isEmpty()) {
				System.out.println(RenkCo.PURPLE+"\nSepetiniz boş"+RenkCo.RESET);
			}else {
				sepetGoster(sepetUrun);
			}
					
		}else if(basket>0) {
			sepetUrun.add(0, urunler[(basket-1)]);	
			sepetTutar(sepetUrun);
			
			System.out.println("\n"+urunler[(basket-1)]+" sepete eklendi.");
			System.out.println(RenkCo.BLUE+"\nSepete Git: 0"+"\nAlışverişe Devam Et: 1"+RenkCo.RESET);
			int sepet=in.nextInt();
				
			if(sepet==0) {
				sepetGoster(sepetUrun);	
			}
		}		
	}

	public void sepetGoster(ArrayList<Product> sepetUrun) {
		System.out.print("\nSepetinizdeki Ürünler: ");
		System.out.println(sepetUrun);
		tutarGoster();
	}
				
	public void sepetTutar(ArrayList<Product> sepetUrun) {
		toplamTutar+=sepetUrun.get(0).getPrice();
	}
	
	public void tutarGoster() {
		System.out.println(RenkCo.RED+"Toplam Tutar: "+toplamTutar+" TL"+RenkCo.RESET);
	}
}
