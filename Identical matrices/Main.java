#include<stdio.h>
int main()
{
	int m,n,a[20][20],b[20][20],i,j,k,count=0;
  	scanf("%d%d",&m,&n);
  for(i=0;i<m;i++)
  {
    for(j=0;j<n;j++)
 	{
      scanf("%d",&a[i][j]);
  	}
  }
  for(i=0;i<m;i++)
  {
    for(j=0;j<n;j++)
 	{
      scanf("%d",&b[i][j]);
  	}
  }
   for(i=0;i<m;i++)
  {
    for(j=0;j<n;j++)
 	{
      if(a[i][j]==b[i][j])
        count++;
  	}
  }
  if(count==(m*n))
  	printf("Yes");
  else
      	printf("No");
	return 0;
}