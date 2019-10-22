// INCLUDE HEADER FILES NEEDED BY YOUR PROGRAM
// SOME LIBRARY FUNCTIONALITY MAY BE RESTRICTED
// DEFINE ANY FUNCTION NEEDED
// FUNCTION SIGNATURE BEGINS, THIS FUNCTION IS REQUIRED
#include <stdio.h>
#include<math.h>
// Main function
int main()
{
    int n,list[20],indx;
  	scanf("%d",&n);
  for(int i=0;i<n;i++)
      scanf("%d",&list[i]);
    for(int i=0;i<n;i++)
    {
	  if(list[i]>list[i+1])
        indx=i;
    }
  printf("%d",indx);
   return 0;
}
