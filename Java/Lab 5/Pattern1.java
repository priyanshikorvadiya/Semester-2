/*Write an interactive program to print a string entered in a pyramid form. For instance, 
the string "stream" has to be displayed as follows:[B] 
s 
st 
str 
stre 
strea 
stream */
public class Pattern1{
    public static void main(String[] args) {
        String str = "stream";

        //Outer loop for rows
        for(int i = 0; i < str.length(); i++){
            //Inner loop for columns
            for(int j = 0; j <= i; j++){
                System.out.print(str.charAt(j));
            }
            //Move to the next line after the inner loop finishes a row
            System.out.println();
        }
    }
}