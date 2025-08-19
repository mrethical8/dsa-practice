public class Runner {

    public static void main(String[] args) {
        
        Stack nums = new Stack();

        // 1

        // nums.push(15);
        // nums.show(); 
        // nums.push(8);
        // nums.show(); 
        // nums.push(10);
        // nums.show(); 
        // nums.push(7);
        // nums.show(); 
        // nums.push(17);
        // nums.show(); 
        // nums.push(77 );
        // nums.show(); 

        // System.out.println(nums.pop());


        //or

        //2 //it will empty and show 0 values

        // nums.push(15);
        // nums.show(); 
        // nums.push(8);
        // nums.show(); 
        // nums.push(10);
        // nums.show(); 
        

        // System.out.println(nums.pop());
        // System.out.println(nums.pop());
        // System.out.println(nums.pop());
        // System.out.println(nums.Size());
 

        //or

        //3 to check stack i empty and it will not give u exception

        nums.push(15);
        nums.show(); 
        nums.push(8);
        nums.show(); 
        nums.push(10);
        nums.show(); 
        

        System.out.println(nums.pop());
        System.out.println(nums.pop());
        System.out.println(nums.pop());
        System.out.println(nums.Size());
        System.out.println(nums.pop());
    }
}

// to check if it is full 