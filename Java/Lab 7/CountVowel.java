/*Create a class which ask the user to enter a sentence, and it should display count of 
each vowel type in the sentence. The program should continue till user enters a word 
“quit”. Display the total count of each vowel for all sentences. [B] */ 

import java.util.Scanner;
class Sentence{
    int countofA;
    int countofE;
    int countofI;
    int countofO;
    int countofU;

    void isVowel(){
        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.print("Enter Sentence :");
            String s = sc.nextLine();

            if(s.equals("quit")){
                break;
            }

        for(int i = 0 ; i < s.length() ; i++){
            char c = s.charAt(i);
            if ( c == 'a' || c == 'a'){
                countofA++;
            }
            else if ( c == 'e' || c == 'E'){
                countofE++;
            }
            else if ( c == 'i' || c == 'I'){
                countofI++;
            }
            else if ( c == 'o' || c == 'O'){
                countofO++;
            }
            else if ( c == 'u' || c == 'U'){
                countofU++;
            }
        }
        }

        System.out.println("Number of A :" + (countofA));
        System.out.println("Number of E :" + (countofE));
        System.out.println("Number of I :" + (countofI));
        System.out.println("Number of O :" + (countofO));
        System.out.println("Number of U :" + (countofU));

        sc.close();
    }
}
public class CountVowel {
    public static void main(String[] args) {
        Sentence s = new Sentence();
        s.isVowel();
    }
}
