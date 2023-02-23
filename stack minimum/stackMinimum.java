import java.util.Scanner;

class Node {
	int data;
	Node next;

	public Node(int data) {
		this.data = data;
		this.next = null;
	}

}

public class StackUse {

	private static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		Stack stack = new Stack();

		int q = s.nextInt();

		while (q > 0) {
			int choice, input;
			choice = s.nextInt();

			switch(choice) {
				case 1:
					input = s.nextInt();
					stack.push(input);
					break;

				case 2:
					System.out.println(stack.pop());
					break;

				case 3:
					System.out.println(stack.top());
					break;

				case 4:
					System.out.println(stack.getSize());
					break; 

				default: 
					System.out.println((stack.isEmpty()) ? "true" : "false");
			}

			q -= 1;
		}

	}

}
public class Stack {

    private Node head;
	private int size;


    public Stack() {
        //Implement the Constructor
        head = null;
		size = 0;
    }



    /*----------------- Public Functions of Stack -----------------*/


    public int getSize() { 
        //Implement the getSize() function
        return size;
    }

    public boolean isEmpty() {
        //Implement the isEmpty() function
        return size == 0;
    }

    public void push(int elem) {
        //Implement the push(element) function
        Node newNode = new Node(elem);
        newNode.next = head;
        head = newNode;
        size++;
    }

    public int pop() {
        //Implement the pop() function
        if(head==null)
            return -1;
        int temp = head.data;
        head = head.next;
        size--;
        return temp;
    }

    public int top() {
        //Implement the top() function
        if(head==null)
            return -1;
        return head.data;
    }
    public int minmum(){
        if(head==null)
            return -1;
        int min = head.data;
        if(head.next.data < min){
            min = head.next.data;
            head = head.next;
        }
        return min;
    }
}