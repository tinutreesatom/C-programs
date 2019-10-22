
#include<stdio.h>
int main()
{
	int m,n,a[20][20],i,j,k;
  	scanf("%d%d",&m,&n);
  for(i=0;i<m;i++)
  {
    for(j=0;j<n;j++)
 	{
      scanf("%d",&a[i][j]);
  	}
  }
  for(i=m-1;i>=0;i--)
  {
    for(j=0,k=0;j<m;j++,k++)
 	{
           // printf(" %d %d",k,i);
      printf("%d ",a[k][i]);
  	}
    printf("\n");
  }
	return 0;
}
