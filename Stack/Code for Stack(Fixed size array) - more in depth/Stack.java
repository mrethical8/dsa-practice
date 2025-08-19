public class Stack {
    

    // Push method

    int stack[] = new int[5];
    int top = 0;

    public void push(int data)
    {
      if (top == 5) //1 //to check the it is full
      {//1
          System.out.println("Stack is full");//1
      }//1 
      else//1
      {//1
      stack[top] = data;
      top++;
      }//1
    }


    // Pop method

    public int pop()
    {
      int data = 0;//3
      if(IsEmpty())//3
      {//3
        System.out.println("Stack is empty");//3
      }//3
      else//3
      {//3
      top--;
      data = stack[top];
      stack[top] = 0;
      }//3
      return data;
    }


    // Peek method

    public int Peek()
    {
      int data;
      data = stack[top-1];
      return data;
    }


    // Size method

    public int Size()
    {
      return top;
    }


    //IsEmpty method

    public boolean IsEmpty()
    {
      return top<=0;
    }


    // Show method

    public void show()
    {
        for(int n : stack)
        {
            System.out.print(n + " ");
        }
        System.out.println();
    }
}
