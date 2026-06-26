//Wap to find a sum of numbers entered by user
#include<stdio.h>
void main(){
    int a,i=0,rem=0,sum=0;
    printf("Enter a");
    scanf("%d",&a);
    while(a!=0){
         rem=n%10;
         sum=sum+rem;
         n=n/10;
    }
    printf("%d",sum);
}