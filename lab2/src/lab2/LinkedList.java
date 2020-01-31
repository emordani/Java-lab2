package lab2;

import javax.xml.crypto.Data;


public class LinkedList {
	Node head;
	Node tail;
	int size;
	
	public Object Peek()
	{		
		if (isEmpty()) {	
			System.out.println("Stack je prazan!");
			return -1;
		}
		else {
			return head.data;
		}
	}
	public Object Pop() {   
		if (isEmpty()) {	
			System.out.println("Stack je prazan!");
			return -1;
		}
        Node ptr = head;
		head = ptr.next;
		return ptr.data;
	}
	
	 public void Push(Object data) {
			Node node = new Node(data);			
			node.next = head;
			
			if (!(isEmpty())) {	
				head.previous = node;
				}

			head = node;
			System.out.println(("push("+data+")"));
			size++;

			if (head.next == null) { 
				tail = head;
			}
			
		}
	
	 public boolean Contains(Object trazeni) {
			Node node = head;
			while (node != null) {
				if (node.data == trazeni)
					return true;
				node = node.next;
			}
			return false;
		}
	 public int Size()
		{
			Node node = head;
			int size = 0;
			while (node != null) {
				size++;
				node = node.next;
			}
			return size;
		}
	
	public Boolean isEmpty() {
		return head==null;
	
	}
	
	public String toString() {
		if (isEmpty()) {	
			return "Stack je prazan!";
			 
		}
		Node temp = head;
		String str = "";
		while (temp != null) {
			str+=temp.data + " ";
			temp = temp.next;
		}
		return str;
	}
		
}
