package teststatic;


public class compt {
    private int num; 
    private float solde = 0; 
    private static int compteur = 0;


    public compt() {
        compteur++; 
        this.num = compteur;
        this.solde = 0;
    }

    
    public void deposer(float m) {
        this.solde += m;
        System.out.println( m + " montant a deposer : " + this.solde);
    }


    public void retirer(float m) {
        if (m <= this.solde) {
            this.solde -= m;
            System.out.println( m + " montant a retirer " + this.solde);
        } else {
            System.out.println("Retrait impossible  Solde insuffisant.");
        }
    }

    
    public float getSolde() {
        return this.solde;
    }

    public void transferer(float m, compt c) {
        if (m <= this.solde) {
            this.retirer(m);
            c.deposer(m);
            System.out.println("Transfert réussi de " + m + " vers le compte numéro " + c.getNum());
        } else {
            System.out.println("Transfert impossible : Solde insuffisant.");
        }
    }

    
    public int getNum() {
        return this.num;
    }}
 
}
