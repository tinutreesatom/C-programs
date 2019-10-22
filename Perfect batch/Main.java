/* ***Test Instructions***
* There are multiple test cases to evaluate the program.
* Some test cases are visible and others are hidden.
* Your program should be generic so that it will satisfy all the test cases.
* Scan the input from stdin and print the exact output only which is as given in the sample test cases.
*/
#include<stdio.h>
void batch(int b[],int n)
{
   int sum1=0,sum2;
  for( int j=0;j<n/2;j++)
    {
       sum1=b[j]+sum1;
     // sum2=sum;
    }
  for( int j=n/2;j<n;j++)
    {
       sum2=b[j]+sum2;
     // sum2=sum;
    }
   if(sum1==sum2)
    printf("Perfect Batch");
    else
  printf("Not a Perfect Batch");
   // printf("Not a Perfect Batch");

 // return sum;
}
int main()
{
  int n,j,i,a[20];
  scanf("%d",&n);
  for(i=0;i<n;i++)
  {
      scanf("%d",&a[i]);
  //  printf("%d",a[i]);
  }
    batch(a,n);
  return 0;
}