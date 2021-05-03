

public class odevuc {
    //1
	public static void main(String[] args) {
		System.out.println("Hello world");
		System.
		         out.
		              println("merhaba java");
		
	//2
		int ogrenciSayisi=17;  //camelCasing
		String mesaj="ogrenci sayisi:";
		System.out.println(mesaj+" "+ogrenciSayisi);
		System.out.println(mesaj+" "+ogrenciSayisi);
		System.out.println(mesaj+" "+ogrenciSayisi);
		System.out.println(mesaj+" "+ogrenciSayisi);
		System.out.println(mesaj+" "+ogrenciSayisi);
		
	//3
		//veriTipleri
		double sayi=12.2;
		sayi=-123;
		char karakter='A';
		boolean dogruMu=false;
		
	//4
		//if bloklarý
		int sayii=55;
		if(sayii<20) {
			System.out.println("sayi 20 den küçüktür");
		}else if(sayii==20)
		{System.out.println("sayi 20 ye eþittir");}
		else
		{System.out.println("sayi 20 den büyüktür");}
		
	//5 
		 //en büyük sayi bulma
		int sayi1=40;
		int sayi2=7;
		int sayi3=9;
		int enBuyuk=sayi1;
		if(sayi1<sayi2) { 
		       enBuyuk=sayi2;
		       }
		if(enBuyuk<sayi3) {
		       enBuyuk=sayi3;}
		       System.out.println("en büyük:"+enBuyuk);
		       
	//6
		  //switch-case bloklarý
		char grade='A';
		
		switch(grade) {
		case 'A':
			System.out.println("Mükemmel");
			break;
		case 'B':
			System.out.println("Çok iyi");
			break;
		case 'C':
			System.out.println("Ýyi");
			break;
		case 'D':
			System.out.println("Biraz daha iyi olabilir");
			break;
		case 'F':
			System.out.println("Kaldýnýz");
			break;
		
		}
	//7
		for(int i=2; i<10; i=i+2)
		{System.out.println(i);}
		System.out.println("döngü bitti");
		
	//8
		int i=1;
		while(i<10) {
			System.out.println(i);
			i=i+2;
		}
		System.out.println("Döngü bitti");
		
	//9
		int j=100;  //þart saðlanmadýðý sürece bile bir kez çalýþýr.
		do {
			System.out.println(j);
			j=j+3;
		}while(j<20);
		System.out.println("do-while döngüsü bitti");
		
	//10
		//array
		String ogrenci1="Engin";
		String ogrenci2="Ela";
		String ogrenci3="Derin";
		String ogrenci4="Ali";
		String ogrenci5="Alp";
		
		System.out.println(ogrenci1);
		System.out.println(ogrenci2);
		System.out.println(ogrenci3);
		System.out.println(ogrenci4);
		System.out.println(ogrenci5);
		//
		String []ogrenciler= {"Engin","Ela","Derin","Ali","Alp"};
		for(int k=0; k<ogrenciler.length; k++) {
			System.out.println(ogrenciler[k]);
		}
		//
		String []ogrenciler2= new String[5];
		 ogrenciler2[0]="Engin";
		 ogrenciler2[1]="Ela";
		 ogrenciler2[2]="Derin";
		 ogrenciler2[3]="Ali";
		 ogrenciler2[4]="Alp";
		 
		 for(int y=0; y<ogrenciler2.length; y++) {
			 System.out.println(ogrenciler2[y]);
		 }
		 for(String ogrenci: ogrenciler2) {
		 System.out.println(ogrenciler2);}
		 
	//11	 
		 double [] mylist= {1.2,1.3,1.4,1.5,1.6};
		 double total=0.0;
		 double maxSayi=mylist[0];
		 
		 for(double number:mylist) {  //mylist teki number lar anlamýnda
			 System.out.println(number);
		    total=total+number;}
		    System.out.println("total:"+total);
		    
		  for(double number: mylist) {
		  if(maxSayi<number) {
			  maxSayi=number;
			 }}System.out.println("max sayi:"+maxSayi);
			
		  for(int z=0; z<mylist.length; z++) {
			  if(maxSayi<mylist[z]) {
				  maxSayi=mylist[z];
			  }}
			  System.out.println("max sayi2:"+maxSayi);
		  
		  
		 //12
			  //çok boyutlu diziler
			  String [][] sehirler= new String [3][3];
			  sehirler[0][0]="istanbul";
			  sehirler[0][1]="ankara";
			  sehirler[0][2]="mugla";
			  sehirler[1][0]="kocaeli";
			  sehirler[1][1]="hatay";
			  sehirler[1][2]="izmir";
			  sehirler[2][0]="antalya";
			  sehirler[2][1]="bolu";
			  sehirler[2][2]="adana";
			  
			  for(int a=0; a<=2; a++) {
				  System.out.println("---------------------");
				  for(int b=0; b<=2; b++) {
					  System.out.println(sehirler[a][b]);
				  }
			  }
			
	     //13
			  String message="    bugün hava çok güzel.    ";
			  System.out.println(message);
			  System.out.println("eleman sayisi:"+message.length());
			  System.out.println("4.eleman: "+message.charAt(3));
			  System.out.println(message.concat("yaþasýn"));  //stringleri birleþtirir.
			  System.out.println(message.startsWith("b"));  //eger b ile baþlýyorsa true döndürür
			  System.out.println(message.endsWith("."));  //. ile bitiyorsa true döndürür
			  char[] karakterlerr=new char[5];
			  message.getChars(0, 5, karakterlerr, 0);   //message da 0 dan 5 e kadar okur karakterlerr dizisine atar
			  System.out.println(karakterlerr);
			  System.out.println(message.indexOf("av"));
			  System.out.println(message.lastIndexOf("e"));
			  
			  
	     //14
			 
			  String yeniMesaj=message.replace(" ", "-");  //boþluða - getir
			  System.out.println(yeniMesaj);  
			  System.out.println(message.substring(2));
			  System.out.println(message.substring(2, 5));
			  
			  for(String kelime: message.split(" ")) {  //alt alta yazar
			  System.out.println(kelime);}
			  
			  System.out.println(message.toLowerCase());
			  System.out.println(message.toUpperCase());
			  
			  System.out.println(message.trim());  //baþtaki ve sonraki boþluklarý siler
			  
	    //15
			  //asal sayý mý?
			  int number2=1;
			  int remainder=number2%2;  //remainder=kalan
			  System.out.println(remainder);
			  boolean isPrime=true; //isPrime asal sayý mý demek
			  
			  if(number2==1) {
				  System.out.println("sayi asal degildir");
				  return;
			  }
			  if(number2<1) {
				  System.out.println("gecersiz sayi");
				  return;
			  }
			  for(int m=2; m<number2; m++) {
				  if(number2%m==0)	
					  {isPrime=false;}
			  
			  }
			  if(isPrime==true) {  //if(isPrime) ayný anlamda
				  System.out.println("sayi asaldir.");
			  }else
				  System.out.println("sayi asal degildir.");
			  
	  //16
			  //kalýn sesli-ince sesli harf
			  

			  char harf ='A';
			  
			  switch(harf) {
			  case 'A':
			  case 'I':
			  case 'O':
			  case 'U':
				  System.out.println("kalýn sesli harf");
				  break;
				  default:
				  System.out.println("ince sesli harf");
			  }
			  
		//17
		         //mükemmel sayýlar
			  int numberr=20; //6 ve 28 mükemmel sayidir
			  int total1=0;
			  for(int n=1; n<numberr; n++) {
				  if(numberr%n==0) {
				  total1=total1+n;
				  }}
				  
				 if(total1==numberr) {
					 System.out.println(numberr+" mükemmel sayidir");}else {
						 System.out.println("mükemmel sayi degildir");
					 }
				 
		//18
				  //arkadaþ sayýlar
				 //220-284
				 int sayi5=220;
				 int sayi6=284;
				 int total5=0;
				 int total6=0;
				 for(int e=1; e<sayi5; e++) {
					 if(sayi5%e==0) {
					   total5=total5+e;
					 }
						 
				 }
				 for(int r=1; r<sayi6; r++) {
					 if(sayi6%r==0) {
						 total6=total6+r;
					 }
				 }
				 if(sayi6==total5 && sayi5==total6) {
				 System.out.println(sayi5+" ve "+sayi6+" arkadas sayilardir");}else {
					 System.out.println("arkadas sayi degillerdir");
				 }
				 
				  
			//19
				 int[] array= {1,2,3,4,5};
				 int aranacakSayi=5;
				 boolean varMi=false;
				 for(int arry : array) {
					 if(arry==aranacakSayi) {
						 varMi=true;
						 break;
					 }
				 }
				 if(varMi) {System.out.println("sayi var");}else {
					 System.out.println("sayi yok");
				 }
				 
				 
				 
				 
				 
			  
			  
			  
			  
			  
			  
		 
		 
		
		
		
		
		

}
}
