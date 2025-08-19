//we are going for minimum value not maximum value
class hello
{
    public static void main(String[] args) {
        
        int nums[] = {6,5,2,8,9,4};
        int size = nums.length;
        int temp = 0;
        int minIndex = -1;

        System.out.println("before sorting");
        for(int num : nums){
            System.out.print( num + " ");
        }

        for(int i=0; i<size-1; i++)//we are using outer loop and inner loop outer loop is for 1st value and inner is for 2nd value
        {
            minIndex = i;
          for(int j=i; j<size; j++)//in the inner loop we are just finding the minimum value and once u find it u simply swap it with
          {
            if(nums[minIndex] > nums[j])
            {
                minIndex = j;
            }
          }

          temp = nums[minIndex];//here u are swaping it
          nums[minIndex] = nums[i];
          nums[i] = temp;

          System.out.println();

            for(int num : nums){
            System.out.print( num + " ");
        }

        }

        System.out.println();
        System.out.println("after sorting");
        for(int num : nums){
            System.out.print(num + " ");
        }
    }
}