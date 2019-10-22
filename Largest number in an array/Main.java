#include<stdio.h>
int main()
{
  int large,i,n,arr[n];
  scanf("%d",&n);
  for(i=0;i<n;i++)
  {
      scanf("%d",&arr[i]);
  }
  for(i=0;i<5;i++)
  {
    if(arr[i]>arr[i+1])
    {
      printf("%d\n",arr[i]);
    break;
    }
   
  }
  return 0;
}

