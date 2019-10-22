#include<stdio.h>
int main()
{
    char str[20];gets(str);
  //puts(str);
  int i,j,flag=0,len;
  len=strlen(str);
  len--;
 // printf("\n %c ", str[4]);
  for(i=0;i<len;i++)
  {
   // printf(" %c ", str[i]);
       //   printf("\n2 %c ", str[len]-i);
  //  printf("\n2 %c ", str[len]-i);
    if(str[i]!=str[len-i])
    {
      flag=1;
     // printf("1 %c ", str[i]);
     // printf("\n2 %c ", str[len]-i);
	      break;

    }
  }
  if(flag==1)
    printf("%s is not a palindrome");
  else
        printf("%s is a palindrome");
  return 0;
}