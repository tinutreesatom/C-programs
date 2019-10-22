#include<stdio.h>
int main()
{
	int n,a[20],i,j;
  	scanf("%d",&n);
  for(i=0;i<n;i++)
  {
      	scanf("%d",&a[i]);
  }
          //  printf("%d\n",a[n-1]);
  for(i=0;i<n;i++)
  {
    for(j=i+1;j<n;j++)
    {
		if((a[i]<a[j])&& (a[j]>a[j-1]))
        {
          printf("%d,%d\n",a[i],a[j]);
         // break;
        }
    }
  }
	return 0;
}