
int main()
{
  
  int num,firstDigit,lastDigit,res;
  scanf("%d",&num);
   lastDigit=num%10;
 firstDigit=num/100;
 res=lastDigit+firstDigit;
  printf("%d",res);
  return 0;
}

