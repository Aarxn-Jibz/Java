// this class is to establish a linked list
import javafx.scene.Node;
class SLL
{
    node start;
    SLL()
    {
        start=null;
    }
    void insertAtEnd(int v)
    {
        node nu=new node(v);
        node ptr;
        if(start==null)     // once for the first time insertion
        {
            start=nu;
            return;
        }
        for(ptr=start;ptr.link!=null;ptr=ptr.link); 
        ptr.link=nu;        
    }
    void insertAtBeg(int v)
    {
        node nu=new node(v);
        nu.link=start;
        start=nu;
    }
    void delete4rmFront()
    {
        node ptr;
        if(start==null)
        {
            System.out.println("Single ended linked list is empty");
            return;
        }
        ptr=start;
        start=start.link;
        System.out.println("Deleted Item="+ptr.data);
    }
    void delete4rmEnd()
    {
        node ptr,prev;
        if(start==null)
        {
            System.out.println("SLL is empty");
            return;
        }
        prev=ptr=start;            
        while(ptr.link!=null)
        {
            prev=ptr;              
            ptr=ptr.link;           
        }
        System.out.println("Deleted item is="+ptr.data);
        if(ptr==start)          // when there is only one node in SLL
        {
            start=null;
        }
        else
        {
            prev.link=null;
        }
    }
    void displayForward()
    {
        if(start==null)
        {
            System.out.println("Single ended linked list is empty");
            return;
        }
        for(node ptr=start;ptr!=null;ptr=ptr.link)
        {
            System.out.println(ptr+" having data "+ptr.data+" and having successor "+ptr.link);
        }
    }
    void displayBakward(node st)
    {
        if(st!=null)
        {
            displayBakward(st.link);
            System.out.println(st.data);
        }
    }
}