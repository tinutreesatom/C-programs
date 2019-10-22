#include<stdio.h>
int main()
{
  	int a[20],sum[10],i,j,s=0,max,n,count=0;
  	scanf("%d",&n);
  for(i=0;i<n;i++)
  {
      	scanf("%d",&a[i]);
  }
  for(i=0;i<n;i++)
  {
      	sum[i]=0;
  }
   for(i=0;i<=n;i++)
  {
      	//for(j=i;j<=n;j++)
       // {
    // if(i==n-1)
        // sum[i]=sum[i]+a[i];
     if(a[i]==1)
            count++;
          else
            break;
       // }
  }
              printf("%d ",count);

  /* for(i=0;i<n;i++)
  {
     if(sum[i]>sum[i+1])
        max=sum[i];
        else
          max=sum[i+1];
   }*/
//  printf("%d ",max);
  return 0;
}


