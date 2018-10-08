import java.util.Scanner;

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
	
	void removeDuplicatesInSorted()
	{
		Node ptr = head;
		while(ptr != null && ptr.next != null)
		{
			if(ptr.data == ptr.next.data)
			{
				ptr.next = ptr.next.next;
			}
			else
				ptr = ptr.next;
		}
	}
}
public class Q2
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		LinkedList ll = new LinkedList();
		System.out.println("Enter the number of elements : ");
		int n = sc.nextInt();
		System.out.println("Enter the elements for Sorted Linked List :-");
		for(int i=0;i<n;i++)
			ll.insertEnd(sc.nextInt());
		
		ll.display();
		
		ll.removeDuplicatesInSorted();
		System.out.println("After removing Duplicates");
		ll.display();
		
		sc.close();
	}
}