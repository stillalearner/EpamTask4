class Node
{
	int data;
	Node next;
	Node(int data)
	{
		this.data=data;
		next=null;
	}
}

public class MiddleElement {

	public static void printList(Node head)
	{
		Node temp=head;
		while(temp!=null)
		{
			System.out.println(temp.data);
			temp=temp.next;
		}
	}
	public static int findMiddle(Node head)
	{
		Node slow=head, fast=head;
		
		while(fast!=null && fast.next!=null)
		{
			slow=slow.next;
			fast=fast.next.next;	
		}
		
		return slow.data;
	}
	public static void main(String[] args) {
		
		
		Node head= new Node(1);
		head.next= new Node(2);
		head.next.next= new Node(3);
		head.next.next.next= new Node(4);
		head.next.next.next.next= new Node(5);
		
		
		int res= findMiddle(head);
		System.out.println(res);
	}
}
