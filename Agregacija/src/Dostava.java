public class Dostava {
	public static void main (String[]args) {
	String lokacija = new String ("Naselba1, Zgrada2");
	AdresaLok adresa1 = new AdresaLok (15, lokacija);
	Kupovac Tom = new Kupovac (1212, adresa1);
	System.out.println("Kupovac ID: " + Tom.getKupovacID());
	System.out.println("Stan br: " + Tom.getAdresaLinija().getstanBr());
	System.out.println("Lokacija: " + Tom.getAdresaLinija().getlokacija());
	System.out.println();
	AdresaLok adresa2 = new AdresaLok (32, lokacija);
	Kupovac Marko = new Kupovac (1673, adresa2);
	System.out.println("Kupovac ID: " + Marko.getKupovacID());
	System.out.println("Stan br:" + Marko.getAdresaLinija().getstanBr());
	System.out.println("Lokacija: " + Marko.getAdresaLinija().getlokacija());
	}

}