package Shopping;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		AltGiyim k1=new AltGiyim("Pantolon", 145.99, "Siyah");
		AltGiyim k2=new AltGiyim("Etek", 104.99, "Bordo");
		UstGiyim k3=new UstGiyim("Kazak", 121.99, "Lacivert");
		UstGiyim k4=new UstGiyim("Gömlek", 90.99, "Beyaz");
		UstGiyim k5=new UstGiyim("Elbise", 245.99, "Yeşil");
		DisGiyim k6=new DisGiyim("Kaban", 1045.99, "Siyah");
		DisGiyim k7=new DisGiyim("Yağmurluk", 1000.99, "Lacivert");
		
		Product[] altGiyim= {k1,k2};
		Product[] ustGiyim= {k3,k4,k5};
		Product[] disGiyim= {k6,k7};
		
		ShoppingCard<Product> altGiyim1=new ShoppingCard<Product>(altGiyim);
		ShoppingCard<Product> ustGiyim1=new ShoppingCard<Product>(ustGiyim);
		ShoppingCard<Product> disGiyim1=new ShoppingCard<Product>(disGiyim);
		
		Ayakkabi a1=new Ayakkabi("Spor Ayakkabı", 799.90, "Beyaz");
		Ayakkabi a2=new Ayakkabi("Stiletto", 299.90, "Beyaz");
		Ayakkabi a3=new Ayakkabi("Bot", 1729.90, "Beyaz");
		Ayakkabi a4=new Ayakkabi("Loafer", 127.90, "Beyaz");
		Ayakkabi a5=new Ayakkabi("Terlik", 99.90, "Beyaz");
		
		Product[] ayakkabilar= {a1,a2,a3,a4,a5};
		ShoppingCard<Product> ayakkabilar1=new ShoppingCard<Product>(ayakkabilar);
		
		Aksesuar ak1=new Aksesuar("Kolye", 75.00, "Gümüş");
		Aksesuar ak2=new Aksesuar("Kolye", 75.00, "Altın");
		Aksesuar ak3=new Aksesuar("Küpe", 25.99, "Rose Gold");
		Aksesuar ak4=new Aksesuar("Bileklik", 35.99, "Gümüş");
		Aksesuar ak5=new Aksesuar("Çanta", 475.00, "Gri");
		
		Product[] aksesuarlar= {ak1,ak2,ak3,ak4,ak5};
		ShoppingCard<Product> aksesuarlar1=new ShoppingCard<Product>(aksesuarlar);
		
		SofraMutfak ev1=new SofraMutfak("Fincan Takımı", 149.90, "Renkli Desen");
		SofraMutfak ev2=new SofraMutfak("Yemek Takımı", 1349.90, "Renkli Desen");
		SofraMutfak ev3=new SofraMutfak("Çelik Tencere", 459.90, "Çelik");
		SofraMutfak ev4=new SofraMutfak("Düdüklü Tencere", 849.90, "Çelik");
		SofraMutfak ev5=new SofraMutfak("Su Bardağı Takımı", 219.90, "Cam");
		Banyo ev6=new Banyo("Paspas Takımı", 198.90, "Pembe");
		Banyo ev7=new Banyo("Sabunluk", 88.90, "Gri");
		Banyo ev8=new Banyo("Çamaşır Sepeti", 298.90, "Beyaz");
		Banyo ev9=new Banyo("Bornoz", 156.90, "Beyaz");
		Dekorasyon ev10=new Dekorasyon("Yapay Çiçek", 99.90, "Yeşil");
		Dekorasyon ev11=new Dekorasyon("Biblo", 79.90, "Bej");
		Dekorasyon ev12=new Dekorasyon("Tablo", 399.90, "Renkli Desenli");
		
		Product[] sofraMut= {ev1, ev2, ev3, ev4, ev5};
		Product[] banyo= {ev6,ev7,ev8,ev9};
		Product[] deko= {ev10,ev11,ev12};
		ShoppingCard<Product> sofraMut1=new ShoppingCard<Product>(sofraMut);
		ShoppingCard<Product> banyo1=new ShoppingCard<Product>(banyo);
		ShoppingCard<Product> deko1=new ShoppingCard<Product>(deko);

		Scanner scn=new Scanner(System.in);
		System.out.println(RenkCo.YELLOW+"MAĞAZAMIZA HOŞGELDİNİZ !"+RenkCo.RESET);
		
		int a=0;
		while(1==1) {
			System.out.println("\nZİYARET ETMEK İSTEDİĞİNİZ KATEGORİYİ SEÇİNİZ: ");
			System.out.println("[1] GİYİM"+"\n[2] AYAKKABI"+"\n[3] AKSESUAR"+"\n[4] EV-YAŞAM"+"\n[5] ÖDEMEYE GEÇ");
			a++;
			int secim1=scn.nextInt();
			
		
			if(secim1==1) {
				
				System.out.println("\n[1] ÜST GİYİM"+"\n[2] ALT GİYİM"+"\n[3] DIŞ GİYİM");
				int secim2=scn.nextInt();
					if(secim2==1) {
						ustGiyim1.addBasket();
					
					}else if(secim2==2) {
						altGiyim1.addBasket();
					
					}else if(secim2==3) {
						disGiyim1.addBasket();
					}
				
			}else if(secim1==2) {
				a++;
				ayakkabilar1.addBasket();
			
			}else if(secim1==3) {
				a++;
				aksesuarlar1.addBasket();
			
			}else if(secim1==4) {
				a++;
				System.out.println("\n[1] SOFRA-MUTFAK"+"\n[2] BANYO"+"\n[3] DEKORASYON");
				int secim3=scn.nextInt();
			
					if(secim3==1) {
						sofraMut1.addBasket();
				
					}else if(secim3==2) {
						banyo1.addBasket();
				
					}else if(secim3==3) {
						deko1.addBasket();
				
					}
				}else if(secim1==5) {
					
					if(a==1) {
						System.out.println(RenkCo.RED+"Sepetinize Ürün Ekleyin"+RenkCo.RESET);
					}else {
						System.out.println("Ödeme adımına geçiliyor.");
						break;
					}
					
				
			
			}
		}
	}
}

