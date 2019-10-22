#include<stdio.h>
int sum(int n)
{
  int s=0,i;
  for(i=1;i<=n;i++)
    s=s+i;
  return(s);
}
int main() {
   int n,sq;
  scanf("%d",&n);
  sq=sum(n);
  printf("%d",sq);
   return 0;
}