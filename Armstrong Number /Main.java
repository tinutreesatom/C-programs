
#include <stdio.h>
int main() {
	/* int number, sum = 0, rem = 0, i=0,cube = 0, temp;
 
    //printf ("enter a number");
    scanf("%d", &number);
   /* temp = number;
  
    while (number != 0)
    {
        rem = number % 10;
        cube = pow(rem, i);
        sum = sum + cube;
        number = number / 10;
      i++;
    }*/
  int number, originalNumber, remainder, result = 0, n = 0,sum=0,temp ;
   // printf("Enter an integer: ");
    scanf("%d", &number);
     originalNumber = number;
    
    while (originalNumber != 0)
    {
        originalNumber /= 10;
        ++n;
    }
    originalNumber = number;
while (originalNumber != 0)
    {
        remainder = originalNumber%10;
        result += pow(remainder, n);
        originalNumber /= 10;
    }
     if(result == number)
        printf ("Armstrong Number");
    else
        printf ("Not an Armstrong Number");
}


