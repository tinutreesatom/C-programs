#include<stdio.h>
int main()
{
  int r,c,matrix[10][10],i,j;
  scanf("%d%d",&r,&c);
  for(i=0;i<r;i++)
  {
    for(j=0;j<c;j++)
    {
        scanf("%d",&matrix[i][j]);
    }
  }
  for(i=0;i<c;i++)
  {
    for(j=0;j<r;j++)
    {
        printf("%d ",matrix[j][i]);
    }
    printf("\n");
  }
  return 0;
}