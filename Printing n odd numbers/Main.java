#include <stdio.h>
int main() {
	int n;
  scanf("%d",&n);
  for(int i=1;i<=(n+n-1);i++)
  {
    if(i%2==1)
    {
      printf("%d\n",i);
    }
  }
	return 0;
}