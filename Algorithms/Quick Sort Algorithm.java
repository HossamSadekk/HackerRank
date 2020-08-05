static void QuickSort(int [] arr,int l,int r)
{
    if(l<r)
    {
        int p = partition(arr,l ,r);
        QuickSort(arr,l,p-1);
        QuickSort(arr,p+1,r);
    }
}
static int partition(int [] arr,int l , int r)
{
    int i=l;
    int j=r;
    int PivLoc = i;
    while(true)
    {
        while(arr[PivLoc]<=arr[j]&&j!=PivLoc)
        {
            j--;
        }
        if(PivLoc==j)
        {
            break;
        }
        else
        {
            int temp = arr[PivLoc];
            arr[PivLoc]=arr[j];
            arr[j]=temp;
            PivLoc=j;
        }
        while(arr[PivLoc]>=arr[i]&&i!=PivLoc)
        {
            i++;
        }
        if(PivLoc==i)
        {
            break;
        }
        else
        {
            int temp = arr[PivLoc];
            arr[PivLoc]=arr[i];
            arr[i]=temp;
            PivLoc=i;
        }
    }
    return PivLoc;
}