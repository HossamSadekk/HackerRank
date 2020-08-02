static int runningTime(int[] arr) {
int key,j;
int c=0;
    for (int i = 1; i < arr.length; i++) 
    {
        key=arr[i];
        j=i-1;
        while(j>=0 && arr[j]>key)
        {
            arr[j+1]=arr[j];
            j-=1;
            c++;
        }
        arr[j+1]=key;
    }
return c;

    }