package com.scorpio.interviews;
import java.util.HashMap;

public class CopyListWithRandomPointer {

	public static void main(String[] args)
    {
        Node start = new Node(1);
        start.next = new Node(2);
        start.next.next = new Node(3);
        start.next.next.next = new Node(4);
        start.next.next.next.next = new Node(5);
 
        // 1's random points to 3
        start.random = start.next.next;
 
        // 2's random points to 1
        start.next.random = start;
 
        // 3's and 4's random points to 5
        start.next.next.random = start.next.next.next.next;
        start.next.next.next.random
            = start.next.next.next.next;
 
        // 5's random points to 2
        start.next.next.next.next.random = start.next;
 
        System.out.println("Original list : ");
        print(start);
 
        System.out.println("Cloned list : ");
        Node cloned_list = clone(start);
        print(cloned_list);
    }
	
	static void print(Node start)
    {
        Node ptr = start;
        while (ptr != null) {
            System.out.println("Data = " + ptr.data
                               + ", Random = "
                               + ptr.random.data);
            ptr = ptr.next;
        }
    }
	
	static Node clone(Node head)
	{
		HashMap<Node, Node> map = new HashMap<>();
		Node curr = head;
		while(curr!=null)
		{
			Node temp = new Node(curr.data);
			temp.next = curr.next;
			map.put(curr, temp);
			curr = curr.next;
		}
		map.entrySet().stream().forEach(e->map.get(e.getKey()).setRandom(e.getKey().getRandom()));
		return map.get(head);
	}

}

class Node
{
	int data;
	Node next;
	Node random;
	
	Node(int data)
	{
		this.data = data;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}

	public Node getRandom() {
		return random;
	}

	public void setRandom(Node random) {
		this.random = random;
	}
	
	
}
