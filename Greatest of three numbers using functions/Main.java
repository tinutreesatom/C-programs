
#include <stdio.h>
  int greatest(int n1,int n2){
 if(n1>n2)
   return n1;
else 
  return n2;
  }
int main(){
	int n1,n2,n3,c1,c2;
  	scanf("%d%d%d",&n1,&n2,&n3);
  c1=greatest(n1,n2);
  c2=greatest(c1,n3);
  printf("%d",c2);
  	return 0;
}


