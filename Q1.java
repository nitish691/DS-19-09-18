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
	
	void swap(int p1, int p2)
	{
		int cnt = 0;
		Node n1 = null,n2 = null;
		Node ptr = head;
		while(ptr != null)
		{
			if(cnt == p1)
				n1 = ptr;
			if(cnt == p2)
				n2 = ptr;
			cnt++;
			ptr = ptr.next;
		}
		
		int temp = n1.data;
		n1.data = n2.data;
		n2.data = temp;
	}
}
public class Q1
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		LinkedList ll = new LinkedList();
		System.out.println("Enter the number of elements : ");
		int n = sc.nextInt();
		System.out.println("Enter elements : ");
		for(int i=0;i<n;i++)
			ll.insertEnd(sc.nextInt());
		
		ll.display();
		
		System.out.println("Enter the index of numbers to swap :-");
		int p1,p2;
		p1 = sc.nextInt();
		p2 = sc.nextInt();
		
		if(p1 >= n || p1 < 0 || p2 >= n || p2 < 0)
			System.out.println("Invalid indexes entered.");
		else
		{
			ll.swap(p1, p2);
			System.out.println("Swapping successfull!");
			ll.display();
		}
		sc.close();
	}
}