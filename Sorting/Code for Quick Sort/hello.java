class hello
{

    public static void quickSort(int[] arr, int low, int high) 
    {
       if(low<high ) 
       {

        int pi = partition(arr, low, high);//quickfix kr
         
         quickSort(arr,low, pi-1);
         quickSort(arr,pi+1,high);
       }
    }

    private static int partition(int[] arr, int low, int high) {//book k code ka logic
        
        int pivot = arr[high];
        int  i = low-1;

        for(int j=low;j<high;j++)
        {
            if(arr[j] < pivot)
            {
                i++;
                int temp = arr[i];//yeh 3 line swap k liye hai
                arr[i] = arr[j];
                arr[j] = temp;
                
            }
        }

                int temp = arr[i+1];
                arr[i+1] = arr[high];
                arr[high] = temp;

                return i+1;
    }

    public static void main(String[] args) {
        
        int arr[] = {5,62,2,3,111,81,4};


        quickSort(arr, 0, arr.length-1);//low aur high ki value hai aur quickfix kr


        for(int num : arr)
        {
            System.out.print(num + " ");
        }
    }
 
}