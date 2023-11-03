class Node {
    int val;
    Node prev;
    Node next;
    Node()
    {
    }
    Node(int val)
    {
        this.val=val;
    }
    
}
class DLL {
    Node head;
    Node tail;
    static int count=0;
    public void insert(int val)
    {
        
            
            if(count==0)
            {
            insertfirst(val);
            }
            else if(count==1)
            {
                Node node=new Node(val);
               node.prev=head;
               head.next=node;
               tail=node;
               count++;
            }
            else{
                Node node=new Node(val);
                node.prev=tail;
                tail.next=node;
                tail=node;
                count++;
            }
            
    }
    public void insertfirst(int val)
    {
        Node node=new Node(val);
        if(count==0)
            {
            head=node;
            tail=head;
            count++;
            }
        else
        {
        head.prev=node;
        node.next=head;
        head=node;
        count++;
        }
    }
    public void display()
    {
        Node temp=head;
        while(temp!=null)
        {
            System.out.print(temp.val+"->");
            temp=temp.next;
        }
        System.out.println("END");
    }
    public int size()
    {
        return count;
    }
    public void delete(int pos)
    {
        Node temp=head;
        for(int i=0;i<pos;i++)
        {
            temp=temp.next;
        }
        temp.prev.next=temp.next;
        temp.next.prev=temp.prev;
        count--;
    }     
}
public class linkedlistlearning {

  
    public static void main(String[] args) {
       
        DLL list=new DLL();
        
       list.insertfirst(5);
       list.insert(3);
       list.insert(2);
       list.insertfirst(1);
       list.insert(10);
        list.display();
        System.out.println(list.size());
        list.delete(1);
        list.display();
        System.out.println(list.size());
       
       
    }
    
}
