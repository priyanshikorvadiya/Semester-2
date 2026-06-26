import java.util.Scanner;
public class practice{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 5;
        int b = ++a + a++ + --a + a--;
        System.out.println(a+" "+b);
        sc.close();
    }
}