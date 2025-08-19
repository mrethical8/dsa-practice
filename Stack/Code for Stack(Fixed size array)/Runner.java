public class Runner {

    public static void main(String[] args) {
        
        Stack nums = new Stack();

        System.out.println("Empty = " + nums.IsEmpty());

        nums.push(15);
        nums.push(8);

        System.out.println(nums.Peek());

        nums.push(10);
        nums.push(7);

        System.out.println(nums.pop());// nums.pop(); likh skte hai pr sop likhe smj aaraha hai ki konsi value nikali hai

        System.out.println("size is " + nums.Size());

        System.out.println("Empty = " + nums.IsEmpty());


        nums.show(); 
    }
}