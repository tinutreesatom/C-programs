#include<stdio.h>
int main()
{
        int n;
        scanf("%d",&n);
        int arr[20];
        int i, j;
        for(i=0; i<n; i++)
        {
            scanf("%d",&arr[i]);
        }
        printf("%d",sumSubsequence( arr, n ) );
        return 0;
}
     int sumSubsequence( int arr[], int n )
    {
        int running_sum, max_sum_sub, i;
  
 	    running_sum = arr[0];
  	    max_sum_sub = arr[0];
  	    for(i = 1; i < n; i++)
        {
            if(arr[i] > arr[i-1])
            {
                running_sum += arr[i];
            }
            else 
            {
                running_sum = arr[i];
            }
            if(running_sum > max_sum_sub)
            {
                max_sum_sub = running_sum;
            }
        }
        return max_sum_sub;
    }


