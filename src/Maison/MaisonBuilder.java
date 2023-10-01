package Maison;

public interface MaisonBuilder {
	MaisonBuilder construireSousSol(String sousSol);
	MaisonBuilder construireMurs(String murs);
	MaisonBuilder construireToit(String toit);
	MaisonBuilder construireInterieur(String interieur);
	Maison construireMaison();
}
