#include<stdio.h>
int main()
{
	int n,i,j,temp,list[20];
  	scanf("%d",&n);
    for(i=0;i<n;i++)
    {
      scanf("%d",&list[i]);
    }
  int half=n/2;
  //	printf("\n%d\n",half);
   for(i=0;i<half;i++)
  {
      // printf("%d ",list[i]);
      	for(j=i+1;j<half;j++)
        {
          if(list[i]>list[j])
          {
            temp=list[j];
            list[j]=list[i];
            list[i]=temp;
          }
                //	printf("%d ",list[i]);

        }
  }
  for(i=0;i<n;i++)
  {
      	printf("%d ",list[i]);
  }
	return 0;
}