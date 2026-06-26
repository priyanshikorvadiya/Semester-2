//           d
//          d a
//         d a r
//        d a r s
//       d a r s h
//      d a r s h a
//     d a r s h a n
#include<stdio.h>
void main(){
    int i,j;
    char name[100]="darshan";
    for(i=0;i<7;i++){
        for(j=0;j<12-i;k++){
            printf(" ");
        }
        for(j=0;j<=i;j++){
            printf(" %c ",name[j]);
        }
        printf("\n");
    }
}