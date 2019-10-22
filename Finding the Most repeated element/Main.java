#include<stdio.h>
	static int Frequent(int arr[], int n, int freq[]) 
	{ 
	    int maxCountCdx = 0; 
		int currCount = 1; 
		
	    for(int i = 0; i < n; i++)
	    {
		    for (int j = i+1; j < n; j++) 
		    { 
	            if(arr[i] == arr[j])
	            currCount ++;
		    }
		    freq[i] = currCount;
		    currCount = 1;
	    } 
	    for( int i = 0; i < n; i++)
	    {
            if(freq[i]>freq[maxCountCdx])
            maxCountCdx = i;
	    }
	    return arr[maxCountCdx];
	}
    int main()
    {
        int n;
        scanf("%d",&n);
        int arr[10];
        for(int i = 0; i < n; i++)
        {
            scanf("%d",&arr[i]);
        }
        int freq[n];
		printf("%d",Frequent(arr,n,freq)); 
		return 0;
	}