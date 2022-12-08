public class Fact1 {
    public static int Jio(int n,int m) {
        

        if (m > n) {
            return 1;
        }
        int x = Jio(n, m+1)* m;
        return x;
        

    }

    public static void main(String[] args) {
        int x = Jio(5,1);
        System.out.println(x);
    }
}
