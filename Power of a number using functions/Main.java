#include<stdio.h>
int power(int b,int e)
{
  int pow=1;
  for(int i=1;i<=e;i++)
  {
    pow=pow*b;
  }
  return pow;
}
int main(){
  int base,exp,res;
  scanf("%d%d",&base,&exp);
  res=power(base,exp);
  printf("%d",res);
  	return 0;
}

