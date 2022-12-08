public class fibonnacciUsingRecursion {

    public static void Jio(int n1, int n2, int upto) {
        int s1 = 0;

        if (n1 > upto) {
            return;
        }

        System.out.println(n1);
        s1 = n1 + n2;
        n1 = n2;
        n2 = s1;
        Jio(n1, n2, upto);

    }

    public static void main(String[] args) {
        Jio(0, 1, 10);
    }
}
