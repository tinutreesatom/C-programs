#include<stdio.h>
int main()
{
  	int a[20],i,j,flag,n,temp;
  	scanf("%d",&n);
  	for(i=0;i<n;i++)
    {
       scanf("%d",&a[i]);
    }
    for(i=0;i<n;i++)
    {
		for(j=i;j<n;j++)
   		{
          temp=a[i];
          a[i]=a[j];
          a[j]=temp;
        }
    }
 /*	for(i=0;i<n;i++)
    {
       printf("%d",a[i]);
    }*/
   for(i=n;i>=2;i--)
    {
    if(a[i-1]!=a[i]-1)
    {
         printf("%d",i-1);
      break;
    }
  }
  return 0;
}