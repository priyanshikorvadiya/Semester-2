import java.util.Scanner;

public class Trycatch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a & b :");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int arr[] = {1,2,3};

        try{
            int ans = a / b;
            System.out.println("Ans :"+(ans));

            System.out.println(arr[4]);
        }

        catch(ArithmeticException ae){
            System.out.println("Arithmatic Exp :"+ae.toString());
        }

        catch(ArrayIndexOutOfBoundsException aie){
            System.out.println("Array Index Out of Bounds Exp :"+aie.toString());
        }

        catch(Exception e){
            System.out.println("Gen Exp :"+e.toString());
        }

        finally{
            sc.close();
        }
    }   
}
