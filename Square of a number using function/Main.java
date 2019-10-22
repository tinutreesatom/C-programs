#include<stdio.h>
int suare(int n)
{
  int s=n*n;
  return(s);
}
int main() {
   int n,sq;
  scanf("%d",&n);
  sq=suare(n);
  printf("%d",sq);
   return 0;
}