
#include <stdio.h>
int gcd(int n1,int n2)
{
  int min;
  if(n1<n2)
    min=n1;
  else
    min=n2;
  while(min>0)
  {
    if((n1%min==0)&&(n2%min==0))
    {
      return min;
    }
    min--;
  }
  }
int main() {
	int n1,n2,n3,g,res;
  scanf("%d%d%d",&n1,&n2,&n3);
  g=gcd(n1,n2);
  res=gcd(g,n3);
  printf("%d",res);
	return 0;
}