package teststatic;


public class maison {
    private String type;
    private String adr;
    private int nbchambre;
    private float surface;

    public maison(String adr, String t, int n) {
        this.adr = adr;
        this.type = t;
        this.nbchambre = n;
        this.surface = 0; 
    }

   
    public maison(String a, String t, int n, float s) {
        this.adr = a;
        this.type = t;
        this.nbchambre = n;
        this.surface = s;
    }


    public void setSurface(float s) {
        this.surface = s;
    }

   
    public float calculPrix(float pmc) {
        return pmc * this.surface;
    }

    public float calculPrix() {
        return 2100 * this.surface;
    }

    
    public String toChaine() {
        return "Un " + this.type + " de " + this.surface + "m² à " + this.adr + 
               " avec " + this.nbchambre + " chambres.";
    }

   
    public static void main(String[] args) {
       
        maison m1 = new maison("Tunis", "duplex", 4, 210);
        maison m2 = new maison("Nabeul", "villa", 5);

      
        System.out.println("maison 1 : " + m1.toChaine());
        System.out.println("maison 2 : " + m2.toChaine());

      
        m2.setSurface(230);

        
        System.out.println("Prix de maison 1 (pmc fixe) : " + m1.calculPrix());
        System.out.println("Prix de maison 1 (pmc donné) : " + m1.calculPrix(2000));

        System.out.println("Prix de  maison 2 (pmc fixe) : " + m2.calculPrix());
        System.out.println("Prix de  maison 2 (pmc donné) : " + m2.calculPrix(2000));
    }
}
