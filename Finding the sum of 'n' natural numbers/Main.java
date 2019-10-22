#include <stdio.h>

int main(int argc, char *argv[])
{
  int n;
  scanf("%d",&n);
  int sum(int n);
  printf("%d",sum(n));
  return 0;
}
int sum(int n)
{ //int res=0
  if(n==0)
    return 0;
  else
    return n+sum(n-1);
}