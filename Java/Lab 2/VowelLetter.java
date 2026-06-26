import java.util.Scanner;

public class VowelLetter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Letter: ");
        char a = sc.next().charAt(0);

        
        if (a == 'a' || a == 'e' || a == 'i' || a == 'o' || a == 'u' || 
            a == 'A' || a == 'E' || a == 'I' || a == 'O' || a == 'U') {
            System.out.println("It is a vowel");
        } else {
            System.out.println("It is a consonant");
        }
        sc.close(); 
    }
}
