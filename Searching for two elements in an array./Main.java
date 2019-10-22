#include<stdio.h>
int main()
{
  int ele1,ele2,i,n,arr[n],indx1=-1,indx2=-1;
  scanf("%d",&n);
  for(i=0;i<n;i++)
  {
      scanf("%d",&arr[i]);
  }
 // printf("search_elem_1= ");
  scanf("%d",&ele1);
 // printf("search_elem_2= ");
  scanf("%d",&ele2);
  for(i=0;i<5;i++)
  {
    if(arr[i]==ele1)
      indx1=i;//printf("%d\n",i);
    if(arr[i]==ele2)
            indx2=i;//printf("%d\n",i);
     // printf("%d",i);
    
  }
  if(indx1!=-1)
    {
      printf("%d\n",indx1);
    }
  else
     printf("-1");
  if(indx2!=-1)
    {
      printf("%d\n",indx2);
    }
  else
     printf("-1");
  return 0;
}
