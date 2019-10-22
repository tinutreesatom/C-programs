#include <stdio.h>
int main() {
	int n,i=0,last_digit,sum;
  scanf("%d",&n);
  last_digit=n%10;
  while(n>=10)
  {
        n=n/10;
  }
  sum=last_digit+n;
  printf("%d",sum);
	return 0;
}