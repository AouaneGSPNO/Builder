package Maison;


public class MainClass {

	public static void main(String[] args) {
         Director director = new Director ();

          MaisonNormaleBuilder builder = new MaisonNormaleBuilder ();
          director.MaisonNormale (builder);
         Maison maisonNormale = builder.construireMaison ();

          MaisonEnBoisBuilder builder1 = new MaisonEnBoisBuilder ();
          director.MaisonEnBois (builder1);
          Maison maisonEnBois = builder1.construireMaison ();

          GrandeMaisonBuilder builder2 = new GrandeMaisonBuilder ();
          director.GrandeMaison (builder2);
          Maison grandeMaison = builder2.construireMaison ();

      // Accéder aux attributs de la maison normale
          System.out.println("******** Accéder aux attributs de la maison normale " );
          System.out.println("Sous-sol : " + maisonNormale.getSousSol());
      System.out.println("Murs : " + maisonNormale.getMurs());
      System.out.println("Toit : " + maisonNormale.getToit());
      System.out.println("Intérieur : " + maisonNormale.getInterieur());
          // Accéder aux attributs de la maison en bois
          System.out.println("******** Accéder aux attributs de la maison en bois " );

          System.out.println("Sous-sol : " + maisonEnBois.getSousSol());
          System.out.println("Murs : " + maisonEnBois.getMurs());
          System.out.println("Toit : " + maisonEnBois.getToit());
          System.out.println("Intérieur : " + maisonEnBois.getInterieur());

          System.out.println("******** Accéder aux attributs de la grande maison " );

          System.out.println("Sous-sol : " + grandeMaison.getSousSol());
          System.out.println("Murs : " + grandeMaison.getMurs());
          System.out.println("Toit : " + grandeMaison.getToit());
          System.out.println("Intérieur : " + grandeMaison.getInterieur());

    }
}