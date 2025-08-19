public class Runner {
    
    public static void main(String[] args) {
     
        LinkedList list = new LinkedList();
        list.insert(18);//it will pass 18 this 18 will assign to node (node.data) wala
        list.insert(45);
        list.insert(12);
        list.insertAtStart(25);
        list.inserAt(2, 55);//yaha par 0 index karke fir inserAt k andar inserAtstart daalke bhi kar skte hai
        list.DeleteAt(1);// for 18 number

        list.show();

    }
}