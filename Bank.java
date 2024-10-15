package teststatic;



public class Bank {

    public static void main(String[] args) {
       
        compt co1 = new compt();
        compt co2 = new compt();

        
        System.out.println("Compte 1 Numéro : " + co1.getNum() + " Solde : " + co1.getSolde());
        System.out.println("Compte 2 Numéro : " + co2.getNum() + " Solde : " + co2.getSolde());

       
        co1.deposer(1200);
        co2.deposer(500);

      
        System.out.println("Après dépot : ");
        System.out.println("Compte 1 Solde : " + co1.getSolde());
        System.out.println("Compte 2  Solde : " + co2.getSolde());

       
        if (co2.getSolde() >= 700) {
            co2.transferer(700, co1);  
        } else {
            System.out.println("Transfert impossible ");
        }

     
        System.out.println("Après transfert : ");
        System.out.println("Compte 1 | Solde : " + co1.getSolde());
        System.out.println("Compte 2 | Solde : " + co2.getSolde());

      
    
    }
}
