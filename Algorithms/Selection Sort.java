
static void SelectionSort(int [] arr)
    {   int size =arr.length;
        for(int i=0;i<size-1;i++)
        {
            int min_value=arr[i];
            int min_index=i;
            for(int j=i+1;j<size;j++)
            {
                if(arr[j]<arr[min_index])
                {
                    min_value=arr[j];
                    min_index=j;
                }
            }
            int temp = arr[min_index];
            arr[min_index]=arr[i];
            arr[i]=temp;
            
        }
    }
    
    static void printarrayay(int array[])
    {
    int n = array.length;
    for (int i=0; i<n; ++i)
    System.out.print(array[i]+" ");
    System.out.println();
    }