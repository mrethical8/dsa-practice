public class hello{
    public static void main(String[] args) {
        
        int nums[] = {6,5,2,8,9,4};
        int size = nums.length;
        int temp = 0;

        System.out.println("before sorting");
        for(int num : nums){
            System.out.print(num + " ");
        }

        for(int i=0;i<size;i++)
        {
           for(int j=0;j<size-i-1;j++)//because the last value is sorted you don't have to check that (j<size-i-1) explaination because we are saving some time not checking the same sorted value again and again
           {
              if(nums[j] > nums[j+1])
              {
                 temp = nums[j];
                 nums[j] = nums [j+1];
                 nums[j+1] = temp;
              }
           }
           System.out.println();//to get a new line and this 4 line code is extra to understand concept
           for(int num : nums){//after every iteration of the outer loop aur for loop niche se liya hai
            System.out.print(num + " ");//i can print the value
        }
        }

        System.out.println();
        System.out.println("after sorting");
        for(int num : nums){
            System.out.print(num + " ");
        }
    }
}