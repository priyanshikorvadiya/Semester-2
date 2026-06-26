//wap to find a sum of even number 1D array
#include<stdio.h>
void main(){
    int a[n],i=0,sum=0;
    printf("Enter n:");
    scanf("%d",&n);
    for(i=0;i<n;i++){
        printf("Enter an array element");
        scanf("%d",&a[i];)
    }
    for(i=0;i<n;i++){
        if(a[i]%2==0){
             sum=sum+a[i];
        }
    }
    printf("%d",sum);
}