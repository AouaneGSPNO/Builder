package Maison;

import Maison.MaisonBuilder;

public class Director {

	public void MaisonNormale(MaisonBuilder builder) {
		builder
			.construireSousSol("Petit sous-sol")
			.construireMurs("Murs en briques")
			.construireToit("Toit en ciment")
			.construireInterieur("Intérieur conventionnel")
			.construireMaison();
	}

	public void MaisonEnBois(MaisonBuilder builder) {
		builder
			.construireSousSol("Petit sous-sol")
			.construireMurs("Murs en bois")
			.construireToit("Toit en bois")
			.construireInterieur("Intérieur traditionnel")
			.construireMaison();
	}

	public void GrandeMaison(MaisonBuilder builder) {
		builder
			.construireSousSol("vaste sous-sol")
			.construireMurs("Murs en briques")
			.construireToit("Toit en ciment")
			.construireInterieur("Intérieur traditionnel de grande qualité")
			.construireMaison();
	}
}
