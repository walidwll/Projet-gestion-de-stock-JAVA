
public class Produit {
	String nom,reference,qte;

	public Produit(String nom, String reference, String qte) {
		this.nom = nom;
		this.reference = reference;
		this.qte = qte;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getReference() {
		return reference;
	}

	public void setReference(String reference) {
		this.reference = reference;
	}

	public String getQte() {
		return qte;
	}


	public void setQte(String qte) {
		this.qte = qte;
	}

	
}
