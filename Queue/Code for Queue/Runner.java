public class Runner {
    
    public static void main(String[] args) {
        
        Queue q = new Queue();
        q.Enqueue(5);// for isempty k vakt comment
        q.Enqueue(2);// for isempty k vakt comment
        q.Enqueue(7);
        q.Enqueue(3);

        // q.Dequeue();// IsFull k vkt comment
        // q.Dequeue();// IsFull k vkt comment

        //q.Enqueue(9);//for isempty k vakt comment // IsFull k vkt comment aur uncomment krke dekhna true aayega aur comment krne par false kyoki isfull nahi hai
        // q.Enqueue(1);//for isempty k vakt comment // IsFull k vkt comment 

        // q.Enqueue(19);//dequeue k vkt k liye tha comment // IsFull k vkt comment
        // q.Enqueue(15);//dequeue k vkt k liye tha comment // IsFull k vkt comment

        //System.out.println(q.IsEmpty());// or u can also uncomment 1 enqueue to see it will give false //IsFull k vkt comment  

        System.out.println(q.IsFull());

        System.out.println("Size " + q.Size());

        q.show();
    }
}
//note: last mein humne queue is full aur empty jo kiya hai lofic Queue mein agar humne ismein enqueue 9,1 ko uncomment kiya toh aur baki k bhi toh queue is full dekhayega aur agar humne enqueue comment kare toh  uapr k 4 toh queue is empty dekhayega