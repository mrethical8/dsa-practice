public class DStack {
    

    // Push method

    int capacity = 2;//how to expand and shrink
    int stack[] = new int[capacity];
    int top = 0;

    public void push(int data)
    {
        if(Size()==capacity)
        expand();

      stack[top] = data;
      top++;
    }

    private void expand() {
        int length = Size();
        int newStack[] = new int[capacity*2];
        System.arraycopy(stack, 0, newStack, 0, length);
        stack = newStack;
        capacity *= 2;
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
      shrink();//if u have an array 0f 8 and u want to shrink
      }
      return data;
    }

    private void shrink() {
        int length = Size();
        if(length<=(capacity/2)/2)
        capacity = capacity/2;

        int newStack[] = new int[capacity];
         System.arraycopy(stack, 0, newStack, 0, length);
        stack = newStack;

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