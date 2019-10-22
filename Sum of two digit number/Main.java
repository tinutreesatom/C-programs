#include<stdio.h>
int main()
{
 int num,first_digit;
  scanf("%d",&num);
 	first_digit=num/10;
  num=num%10;
 
  printf("%d",first_digit+num);
  return 0;
}

