package lab2;

public class Lab2Main {

	public static void main(String[] args) {
		LinkedList list=new LinkedList();
		
		list.Push(2);
		list.Push(3);
		list.Push(25);
		list.Push(4);
		list.Push(5);
		list.Push(26);
		list.Push(33);
		list.Push(244);			
		System.out.println(list.toString());
		System.out.println(list.Pop());
		System.out.println(list.toString());
		System.out.println(list.Peek());
		System.out.println(list.toString());
		System.out.println(list.Peek());
		System.out.println(list.toString());
		System.out.println(list.isEmpty());
		System.out.println(list.Size());
		System.out.println(list.Contains(2));
		System.out.println(list.Contains(44));
		System.out.println(list.Contains(5));
		list.Push(2555);
		System.out.println(list.toString());

	}

}


