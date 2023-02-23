// Program for Nth node from the end of a Linked List
import java.util.LinkedList;

import javax.swing.plaf.synth.SynthLookAndFeel;
public class nthNodeOfTheLinkedList {
    private class ListNode
	    {
	        int value;
	        ListNode next;
	
	        ListNode(int value)
	        {
	            this.value = value;
	        }
	    }
	    
	    ListNode head;
	    ListNode tail;
	    public void findNthFromEnd(ListNode head,int n)
	    {
	        ListNode node1 = head, node2 = head;
	        
	        int count = 1;
	        	         
	        while (node1 != null)
	        {
	            if (count == (n+1))  
	            {
	                break;
	            }
	            
	            count += 1;
	            node1 = node1.next;
	        }
	        if (count == (n+1))
	        {
	            while (node1 != null)
	            {
	                node1 = node1.next;
	                node2 = node2.next;
	            }
	            // return node2.value;
                System.out.print(node2.value);
	        }
	        
	    }
        public void push(int value)
        {
            ListNode new_node = new ListNode(value);
            new_node.next = head;
            head = new_node;
        }
	    public static void main(String[] args) 
	    {
	        LinkedList lList = new LinkedList();
            lList.push(10);
	        lList.push(20);
	        lList.push(30);
            lList.push(40);
            lList.push(50);
	        
	        lList.findNthFromEnd(lList,2);
    }
    
}
