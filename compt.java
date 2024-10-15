package teststatic;

public class compt {
	private int num; 
	private float solde=0; 
	private static int compteur=0;
	public compt() {
		
		compteur++; 
		this.num=compteur;
		this.solde=0;
	}
	public void deposer(float m) {
           
			this.solde += m;
            System.out.println(m + " montant a deposer "+ this.solde);
       
    }
 public  void retirer(float m) {
	 this.solde-=m;
	 System.out.println(m+"montant a retirer"+this.solde);
 }
 public static float avoirsolde(float solde) {
	 return solde; 
 }
 public void transferer(float  m,compt c) {
	 this.retirer(m);
	 c.deposer(m);
 }
 
}