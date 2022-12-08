public class fibonnacciUsingLoop {
    public static void Jio(int n,int m,int x) {
        
        int s1= 0;
        
        for (int i = 0; i < x; i++) {
            System.out.println(n);
            //System.out.println(m);
            s1=n+m;
            n=m;
            m=s1;
        }
    }
    public static void main(String[] args) {
        Jio(0,1,10);
    }
}
