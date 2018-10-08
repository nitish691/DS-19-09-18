import java.util.*;

class Node
{
	int data;
	Node next;
	Node(int d)
	{
		data = d;
	}
}

class LinkedList
{
	Node head;
	
	void insertEnd(int data)
	{
		Node temp = new Node(data);
		if(head == null)
			head = temp;
		else
		{
			Node ptr = head;
			while(ptr.next != null)
				ptr = ptr.next;
			ptr.next = temp;
		}
	}
	
	void display()
	{
		System.out.println("The Linked List:-");
		Node ptr = head;
		while(ptr != null)
		{
			System.out.print(ptr.data + " ");
			ptr = ptr.next;
		}
		System.out.println('\n');
	}
	
	LinkedList reverseList()
	{
		LinkedList reverse = new LinkedList();
		Node ptr1 = this.head;
		while(ptr1 != null)
		{
			reverse.insertEnd(ptr1.data);
			ptr1 = ptr1.next;
		}
		
		Node cur = reverse.head;
		Node prev = null;
		Node ptr = null;
		while(cur != null)
		{
			ptr = cur.next;
			cur.next = prev;
			prev = cur;
			cur = ptr;
		}
		reverse.head = prev;
		return reverse;
	}
}
public class Q5
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		LinkedList ll = new LinkedList();
		System.out.print("\nEnter the number of elements : ");
		int n = sc.nextInt();
		System.out.println("Enter the elements of Linked List :-");
		for(int i=0;i<n;i++)
			ll.insertEnd(sc.nextInt());
		
		ll.display();
		
		LinkedList reverse = ll.reverseList();
		reverse.display();
		
		System.out.println();
		sc.close();
	}
}