package Maison;

public class Maison {
  private String sousSol;
  private String murs;
  private String toit;
  private String interieur;

  public Maison(String sousSol, String murs, String toit, String interieur) {
    this.sousSol = sousSol;
    this.murs = murs;
    this.toit = toit;
    this.interieur = interieur;
  }

  // Méthodes getters pour accéder aux attributs
  public String getSousSol() {
    return sousSol;
  }

  public String getMurs() {
    return murs;
  }

  public String getToit() {
    return toit;
  }

  public String getInterieur() {
    return interieur;
  }

}