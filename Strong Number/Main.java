

#include <stdio.h>
int main() {
	 int c, n,sum=0,rem=0,i,res=0,r,a;
 
 // printf("Enter a number to calculate its factorial\n");
  scanf("%d",&n);
  r=n;
  a=n;
 while(n>0)
 {
   int fact=1;
     	a=n%10;
       for(c=a;c>0;c--)
      {
        fact = fact*c;
      }
    // sum=sum+fact;
     n=n/10;
     res=fact+res;
     //  printf("%d ",fact);

   }
 // printf("%d",res);
  if(res==r)
  printf("Yes");
  else
    printf("No");
    
	return 0;
}


