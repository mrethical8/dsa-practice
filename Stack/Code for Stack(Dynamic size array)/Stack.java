public class Stack {
    

    // Push method

    int stack[] = new int[5];
    int top = 0;

    public void push(int data)
    {
      if (top == 5)
      {
          System.out.println("Stack is full");
      }
      else
      {
      stack[top] = data;
      top++;
      }
    }


    // Pop method

    public int pop()
    {
      int data = 0;
      if(IsEmpty())
      {
        System.out.println("Stack is empty");
      }
      else
      {
      top--;
      data = stack[top];
      stack[top] = 0;
      }
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
