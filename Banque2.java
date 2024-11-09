public class Banque2 {
    public static void main(String[] args){
        double taux1= 0.01;
        double taux2= 0.02;
    // donnees des clients 
        String nom1 ="Chanone";
        String ville1 ="Bagangte";
        double solde1PremierClient = 5000.0;
        double solde2PremierClient = 25000.0;

        String nom2 ="Helena";
        String ville2 ="Douala";
        double solde1DeuxièmeClient = 4000.0;
        double solde2DeuxièmeClient = 45000.0;

    // afficher les donnees des clients
        afficherClient(nom1, ville1, solde1PremierClient, solde2PremierClient);

        afficherClient(nom2, ville2, solde1DeuxièmeClient, solde2DeuxièmeClient);


        solde1PremierClient = bouclerCompte(solde1PremierClient, taux1);
        solde2PremierClient = bouclerCompte(solde2PremierClient, taux2);

        solde1DeuxièmeClient = bouclerCompte(solde1DeuxièmeClient, taux1);
        solde2DeuxièmeClient = bouclerCompte(solde2DeuxièmeClient, taux2);


        afficherClient(nom1, ville1, solde1PremierClient, solde2PremierClient);
        
        afficherClient(nom2, ville2, solde1DeuxièmeClient, solde2DeuxièmeClient);

    }
    // donnees des clients
    static void afficherClient(String nom, String ville, double solde1, double solde2){
        System.out.println("Client "+ nom + " de "+ ville);
        System.out.println("Compte prive:"+ solde1 +"francs");
        System.out.println("Compte d'epargne"+ solde2 +"francs");
    }
    static double bouclerCompte(double solde, double taux){
        double interets= taux*solde;
        double nouveauSolde= solde+interets;
        return nouveauSolde;
    }
}
