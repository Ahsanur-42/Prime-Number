#include <stdio.h>
#include <math.h>
int main()
{
    int n,i,j,item;
    int a[100];

    printf("Enter the range of Array: ");
    scanf("%d",&n);

    printf("\nEnter the elements of Array: ");
    for(i=0;i<n;i++)
    {
        scanf("%d",&a[i]);
    }

    printf("\nPrime numbers in the array are: ");
    for(i=0;i<n;i++)
    {
        item = a[i];
        int prime = 1;

        if(item <= 1)
        {
            continue;
        }

        for(j=2;j<=sqrt(item);j++)
        {
            if(item%j==0)
            {
                prime = 0;
                break;
            }
        }

        if(prime)
        {
            printf("%d\t",item);
        }
    }
    printf("\n");
    return 0;
}
