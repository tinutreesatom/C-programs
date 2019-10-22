#include<stdio.h>
int main()
{
 	 int i,n,a[20],k,j;
  	scanf("%d",&n);
   	scanf("%d",&k);
 	for(i=0;i<n;i++)
    {
      scanf("%d",&a[i]);
    }
  	int f[k];
 	 for(i=0;i<=k;i++)
    {
      f[i]=0;
    }
  	for(i=0;i<n;i++)
    {
      //for(j=i;j<k;j++)
      //{
        f[a[i]]++;
      //}
    }
   for(i=1;i<=k;i++)
    {
      printf("%d %d\n",i,f[i]);
    }
  return 0;
}