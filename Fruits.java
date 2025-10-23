package src;

public class Fruits {
	private int degréAcidité;
	private int quantité;
	private String nom;
	
	public Fruits(int degréAcidité,int quantité,String nom) {
		this.setDegréAcidité(degréAcidité);
		this.setQuantité(quantité);
		this.setNom(nom);
	}

	public int getDegréAcidité() {
		return degréAcidité;
	}

	public void setDegréAcidité(int degréAcidité) {
		this.degréAcidité = degréAcidité;
	}

	public int getQuantité() {
		return quantité;
	}

	public void setQuantité(int quantité) {
		this.quantité = quantité;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}
	
	public void Afficher() {
		System.out.println("Le fruit : " + this.nom + " a un degré d'acidité de : "+ this.degréAcidité+ " et avec une quantité de : "+ this.quantité);
	}
	public String toString() {
		return "Le fruit : " + this.nom + " a un degré d'acidité de : "+ this.degréAcidité+ " et avec une quantité de : "+ this.quantité;
	}
	

}
