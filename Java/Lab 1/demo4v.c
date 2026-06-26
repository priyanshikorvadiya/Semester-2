//           *
//          * *
//         * * *
//        * * * *
//         * * *
//          * *
//           *

#include<stdio.h>
void main(){
    int n=4,i,j,k;
    //upper part
    for(i=1;i<=n;i++){
        for(k=1;k<=n-i;k++){
            printf(" ");
        }
        for(j=1;j<=i;j++){
            printf("* ");
        }
    }
    //lower part
    for(i=n-1;i>=1;i--){
        for(k=1;k<=n-i;k++){
            printf(" ");
        }
        for(j=1;j<=i;j++){
            printf("* ");
        }
        printf("\n");
    }

}