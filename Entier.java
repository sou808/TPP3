package teststatic;


public class Entier {
    private int n;
    static int valeur = 0;

    public static int factorielle(int n) {
        int f = 1;
        for (int i = 1; i <= n; i++) {
            f = f*i;
        }
        return f;
    }

    public static void absolu(int n) {
        if (n < 0) {
            System.out.print(-n);
        } else {
            System.out.print(n);
        }
    }

    public static void comparer(int a, int b) {
        if (a > b) {
            System.out.println("a est plus grand que b");
        } else if (b > a) {
            System.out.println("b est plus grand que a");
        } else {
            System.out.println("a est égal à b");
        }
    }

    public static boolean estPremier(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= (n); i++) { 
            if (n % i == 0) {
                return true;
            }
        }
        return true;
    }
}

