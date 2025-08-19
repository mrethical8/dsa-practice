public class Queue
{
    int queue[] = new int[5];
    int size;
    int front;
    int rear;


    // Enqueue method

    public void Enqueue(int data)
    { 
      if(!IsFull())// u have to do this only when it is not full
      {
        queue[rear] = data;
        rear = (rear + 1)%5;
        size = size + 1;
      }
      else
          System.out.println("Queue is Full");
    }


    //Dequeue method

    public int Dequeue()
    {
      int data = queue[front];
      if(!IsEmpty())//we want to remove only when it is not empty
      {
        front = (front + 1)%5;
        size = size - 1;
      }
      else
          System.out.println("Queue is Empty");
      return data;
    }


    // Size method

    public int Size()
    {
       return size;
    }


    // IsEmpty method

    public boolean IsEmpty()
    {
      return Size()==0;
    }


    // IsFull method

    public boolean IsFull()
    {
      return Size()==5;
    }


    // Show method

    public void show()
    {
        System.out.print("Elements  : ");
        for(int i=0;i<size;i++)
        {
            System.out.print(queue[(front+i)%5] + " ");
        }
        System.out.println();

        for(int n : queue)
        {
            System.out.print(n + " ");
        }
    }
}