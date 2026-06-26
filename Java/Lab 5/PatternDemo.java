import java.util.Scanner;
public class PatternDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n");
        int  n = sc.nextInt();
        String s = "darshan";
        
        //Method calling
        P1(n);
        P2(n);
        P3(n);
        P4(n);
        P5(n);
        P6(n);
        P7(n);
        P8(n);
        P9(n);
        P10(n);
        P11(n);
        P12(s);

        sc.close();
    }

/*
*****
*****
*****
*****
*****
*/

public static void P1(int n){
    System.out.print("Print Square");
    for(int i = 0; i < n ; i++){
        for(int j = 0; j < n ; j++){
            System.out.print("*");
        }
        System.out.println();
    }
}

/*
*
**
***
****
*****
*/

public static void P2(int n){
    System.out.print("Print Left triangle");
    for(int i = 0; i < n ; i++){
        for(int j = 0; j <= i ; j++){
            System.out.print("*");
        }
        System.out.println();
    }
}

/*
*****
****
***
**
*
*/

public static void P3(int n){
    System.out.print("Print Left triangle reverse");
    for(int i = 0; i < n ; i++){
        for(int j = 0; j < n - i ; j++){
            System.out.print("*");
        }
        System.out.println();
    }
}

/* 
      *
     **
    ***
   ****
  *****    
*/

public static void P4(int n){
    System.out.print("Print Right triangle ");
    for(int i = 0; i < n ; i++){
        for(int j = 0; j < n-i-1 ; j++){
            System.out.print(" ");
        }
        for(int k = 0; k <= i ; k++){
            System.out.print("*");
        }
        System.out.println();
    }
}

/*
*****
 ****
  ***
   **
    *
*/

public static void P5(int n){
    System.out.print("Print Right triangle reverse");
    for(int i = 0; i < n ; i++){
        for(int j = 0; j < i - 1 ; j++){
            System.out.print(" ");
        }
        for(int k = n - 1; k > i ; k--){
            System.out.print("*");
        }
        System.out.println();
    }
}

/*
*****
*   *
*   *
*   *
*****
*/

public static void P6(int n){
    System.out.print("Print Hollow Square");
    for(int i = 0; i < n ; i++){
        for(int j = 0; j < n ; j++){
            if( i == 0 || j == 0 || i == n - 1 || j == n - 1){
                System.out.print("*");
            }
            else{
                System.out.print(" ");
            }    
        }
        System.out.println();
    }
}

/*
    *
   * * 
  * * *
 * * * *
* * * * *
*/

public static void P7(int n){
    System.out.print("Print Middle triangle");
    for(int i = 0; i < n ; i++){
        for(int j = 0; j < n - i -1 ; j++){
            System.out.print(" ");
        }
        for(int k = 0 ; k <= i; k++){
            System.out.print("* ");
        }
        System.out.println();
    }
}

/*
    *
   * * 
  * * *
 * * * *
* * * * *
 * * * *
  * * *
   * *
    * 
*/

public static void P8(int n){
    System.out.print("Print Diamond");
    for(int i = 0; i < n - 1 ; i++){
        for(int j = 0; j < n - i -1 ; j++){
            System.out.print(" ");
        }
        for(int k = 0; k <= i; k++){
            System.out.print("* ");
        }
        System.out.println();
    }
    //rev
    for(int i = 0; i < n; i++){
        for(int j = 0; j < i; j++){
            System.out.print(" ");
        }
        for(int k = n - 1; k >= i;k--){
            System.out.print("* ");
        }
        System.out.println();
    }
}

/*
    *
   * * 
  *   *
 *     *
*       *
 *     *
  *   *
   * *
    *
*/

public static void P9(int n){
    System.out.print("Print Hollow Diamond");
    for(int i = 0;i < n - 1;i++){
        for(int j = 0 ; j < n - i - 1;j++){
            System.out.print(" ");
        }
        for(int k = 0; k <= i;k++){
            if(k == n || k == i || k == 0 || k == n - 1){
            System.out.print("* ");
            }
            else{
                System.out.print(" ");
            }
        }
        System.out.println();
    }

    //rev
    for(int i = 0; i < n;i++){
        for(int j = 0; j < i ; j++){
            System.out.print(" ");
        }
        for(int k = n - 1; k >= i; k++){
            if(k == i || k == 0 || k== n-1){
                System.out.print("* ");
            }
            else{
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}

/*
1
22
333
4444
55555
*/

public static void P10(int n){
    for(int i = 0; i < n ; i++){
        for(int j = 0; j <= i ; j++){
            System.out.print(i);
        }
        System.out.println();
    }
}

/*
1
12
123
1234
12345
*/

public static void P11(int n){
    for(int i = 0; i < n ; i++){
        for(int j = 0; j <= i ; j++){
            System.out.print(j);
        }
        System.out.println();
    }
}

/*
d
da
dar
dars
darsh
darsha
darshan
*/

public static void P12(String s){
    System.out.print("Print Left triangle");
    for(int i = 0; i < s.length() ; i++){
        for(int j = 0; j <= i ; j++){
            System.out.print(s.charAt(j));
        }
        System.out.println();
    }
}

}