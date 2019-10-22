#include <stdio.h>
int main() {
	int n,i=0,rem=0,sum=0;
  scanf("%d",&n);
  while(i<n)
  {
    rem=n%10;
    sum=sum+rem;
    n=n/10;
  }
  printf("%d",sum);
	return 0;
}