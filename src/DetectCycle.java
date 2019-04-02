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

public class DetectCycle {

	public static void printList(Node head)
	{
		Node temp=head;
		while(temp!=null)
		{
			System.out.println(temp.data);
			temp=temp.next;
		}
	}
	public static int detectCycle(Node head)
	{
		Node slow=head, fast=head;
		
		while(slow!=null && fast!=null && fast.next!=null)
		{
			slow=slow.next;
			fast=fast.next.next;
			if(slow==fast)
				return 1;
			
		}
		
		return 0;
	}
	public static void main(String[] args) {
		
		
		Node head= new Node(1);
		head.next= new Node(2);
		head.next.next= new Node(3);
		head.next.next.next= new Node(4);
		head.next.next.next.next= new Node(5);
		head.next.next.next.next.next= head.next;
		
		int res= detectCycle(head);
		if(res==1)
		System.out.println("Yes, LinkedList contains a cycle");
		else
		System.out.println("No, LinkedList does not contain a cycle");
	}
}
