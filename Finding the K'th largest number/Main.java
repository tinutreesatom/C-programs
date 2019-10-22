#include<stdio.h>
/*int find_min_i(int i,int a[],int n);
void selectionsort(int n,int a[]);
void swap(int i,int min_i,int a[]);*/
int main()
{
 	int i,n,a[20],k,j;
  	scanf("%d",&n);
 	for(i=0;i<n;i++)
    {
      scanf("%d",&a[i]);
    }
  	scanf("%d",&k);
  for(i=0;i<n;i++)
  {
    for(j=i;j<n;j++)
    {
      if(a[i]<=a[j])
      {
        int temp=a[i];
        a[i]=a[j];
        a[j]=temp;
      }
    }
  }
 /* for(i=0;i<n;i++)
    {
      printf("%d ",a[i]);
    }*/
  	//selectionsort(n,a);
 	printf("%d",a[k-1]);
return 0;
}
/*void selectionsort(int n,int a[])
{
  for( int i=0;i<n-2;i++)
  {
    int min_i=find_min_i(i,a,n-1);
    swap(i,min_i,a);
  }
}
int find_min_i(int i,int a[],int n)
{
  int min_i=0;
  if(a[i]<a[i+1])
    min_i=i;
  else
    min_i=i+1;
  for(int j=i+2;j<=n;j++)
  {
   
    if(a[i]>a[j])
      min_i=i;
  }
  return min_i;
}
void swap(int i,int min_i,int a[])
{
  int temp=a[i];
  a[i]=a[min_i];
  a[min_i]=temp;
}*/