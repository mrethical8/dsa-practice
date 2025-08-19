public class LinkedList 
{
  Node head;


  //insert method
  public void insert(int data)
  {
    Node node = new Node();//object create kiya
    node.data = data;
    node.next = null;

    if(head == null)
       {
        head = node;
       }
    else
    {
        Node n = head;
        while(n.next!=null)
        {
            n = n.next;
        }
        n.next = node; 
    }
  }


  //insertAtStart

  public void insertAtStart(int data)
  {
    Node node = new Node();//object create kiya
    node.data = data;
    node.next = null;

    node.next = head;
    head = node;
  }


  //inserAt

  public void inserAt(int index,int data)
  {
    Node node = new Node();//object create kiya
    node.data = data;
    node.next = null;

    // if(index==0) //if u want the value at index 0 so u have to say insertAtStart
    // {
    //   insertAtStart(data);// fill the data whatever value you want to add
    // }
    // else{ // aur yeh part else mein aayega agar insertAtStart use kiya insertAt mein
    Node n = head;
    for(int i=0;i<index-1;i++)
    {
       n = n.next;
    }
    node.next = n.next;
    n.next = node;
   }
 //}


  //DeleteAt

  public void DeleteAt(int index)
  {
    // if(index==0) //this is what u do when u want delete the first element
    // {
    //     head = head.next;
    // }
    //else{
 
    Node n = head;
    Node n1 = null;
    for(int i=0;i<index-1;i++)
    {
      n = n.next;
    }
    n1 = n.next;
    n.next = n1.next;
    //System.out.println("n1 " + n1.data); //to only check which value is deleted
    n1 = null;//so that it will be eligible for garbage collection we have removed 18 and it is not there in the memory as well

    }
 //}


  //show method

  public void show()
  {
    Node node = head;

    while(node.next!=null)
    {
        System.out.println(node.data);
        node = node.next;
    }
    System.out.println(node.data);
  }
}


 