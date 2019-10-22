#include <stdio.h>
int main() {
	int n,i=0,quotient;
  scanf("%d",&n);
  while(n>=100)
  {
        n=n/10;
  }
  i=n%10;
  printf("%d",i);
	return 0;
}