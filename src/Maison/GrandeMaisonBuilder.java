package Maison;

import Maison.Maison;
import Maison.MaisonBuilder;

public class GrandeMaisonBuilder implements MaisonBuilder {
	private String sousSol;
	private String murs;
	private String toit;
	private String interieur;

	public GrandeMaisonBuilder() {}

	@Override
	public MaisonBuilder construireSousSol(String sousSol) {
		this.sousSol = sousSol;
		return this;
	}

	@Override
	public MaisonBuilder construireMurs(String murs) {
		this.murs = murs;
		return this;
	}

	@Override
	public MaisonBuilder construireToit(String toit) {
		this.toit = toit;
		return this;
	}

	@Override
	public MaisonBuilder construireInterieur(String interieur) {
		this.interieur = interieur;
		return this;
	}

	@Override
	public Maison construireMaison() {
		return new Maison(sousSol, murs, toit, interieur);
	}
}