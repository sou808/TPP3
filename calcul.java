package teststatic;

public class calcul {
public static void main(String[] args) {
    int n = 4;

   
    System.out.println("Le nombre factorielle de " + n + " est: " + Entier.factorielle(n));

    
    Entier.comparer(2, 4);

    
    if (Entier.estPremier(11)) {
        System.out.println("Le nombre 11 est un nombre premier.");
    } else {
        System.out.println("Le nombre 11 n'est pas un nombre premier.");
    }

    
    Entier.valeur += 10;
    System.out.println("La valeur de n devient: " + Entier.valeur);

}
}


