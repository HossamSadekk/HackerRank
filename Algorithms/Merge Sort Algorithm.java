static void MergeSort(int [] arr,int l,int r)
{   if(l<r)
    {
    int mid = (l+r)/2;
    MergeSort(arr,l,mid);
    MergeSort(arr,mid+1,r);
    Merge(arr,l,mid,r);
    }
}

static void Merge(int [] arr,int l,int mid,int r)
{
    int n = mid-l+1;
    int m = r-mid;
    int [] a = new int [n];
    int [] b = new int [m];
    
    for (int i = 0; i < a.length; i++) {
       a[i]=arr[l+i];
        
    }
    for (int i = 0; i < b.length; i++) {
       b[i]=arr[mid+1+i];
        
    }
    
    int i=0,j=0;
    int k=l;//because we can start from one
    while(i<a.length && j<b.length)
    {
        if(a[i]<=b[j])
        {
            arr[k]=a[i];
            i++;
            k++;
        }
        else
        {
            arr[k]=b[j];
            j++;
            k++;
        }
    }
    while(i<a.length)
    {
        arr[k]=a[i];
        i++;
        k++;
    }
    while(i<b.length)
    {
        arr[k]=b[i];
        j++;
        k++;
    }
}
