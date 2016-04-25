#include <stdio.h>

int arr[50];
int sol[251];

int main()
{
  int n,m;
  sol[0] = 1;
  scanf("%d %d", &n, &m);
  for( int i = 0 ; i < m ; i ++ ){
    scanf("%d", &arr[i]);
    for( int j = 0 ; j <= n ; j ++ ){
      if( j-arr[i] >= 0 ){
        sol[j] += arr[i];
      }
    }

    printf("%d", arr[n]);
  }

  return 0;
}
