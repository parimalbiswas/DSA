/**
 * A
 */
public class OnetoNUsingRecursion {

    

    public static int Jio(int n,int m) {
       int x =0;
       
        if (n <= m) {
           x = n + Jio(n + 1,m);
        }
        return x;

    }

    public static void main(String[] args) {
        int n = 2;
        int m = 5;

        int x = Jio(n,m);
        System.out.println(x);
    }
}