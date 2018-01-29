package test;

public class reverseListrec {
public static void main(String[] args) {
	Node h = null;
	Node temp1 = new Node(5, null);
	h = temp1;
	Node temp2 = new Node(6, null);
	temp1.next = temp2;
	Node temp3 = new Node(7, null);
	temp2.next = temp3;
	Reverse(h);
}

public static void Reverse(Node p) {
	if(p.next == null) {
		System.out.print(p.data);
		return;
	}

	Reverse(p.next);
	Node q = p.next;
	q.next = p;
	p.next = null;
	System.out.print(p.data);

}
}
