
class Kupovac {
	
	private int kupovacID;
	private AdresaLok adresaLinija;
	public Kupovac (int kupovacID, AdresaLok adresaLinija) {
		this.kupovacID = kupovacID;
		this.adresaLinija = adresaLinija;
	}
	public int getKupovacID() {
		return kupovacID;
	}
	public AdresaLok getAdresaLinija() {
		return adresaLinija;
	}

}
