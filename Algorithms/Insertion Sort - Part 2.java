static void printarrayay(int array[])
    {
    int n = array.length;
    for (int i=0; i<n; ++i)
    System.out.print(array[i]+" ");
    System.out.println();
    }
    static void insertionSort2(int n, int[] arr) {

int key,j;
    for (int i = 1; i < arr.length; i++) 
    {
        key=arr[i];
        j=i-1;
        while(j>=0 && arr[j]>key)
        {
            arr[j+1]=arr[j];
            j-=1;
        }
        arr[j+1]=key;
            printarrayay(arr);

    }
    }