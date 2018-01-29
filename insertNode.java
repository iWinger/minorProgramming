package test;

public class insertNode {
	public static void main(String[] args) {
		Node h = null;
		Node temp1 = new Node(5, null);
		h = temp1;
		Node temp2 = new Node(6, null);
		temp1.next = temp2;
		Node temp3 = new Node(7, null);
		temp2.next = temp3;
		Node t1 = new Node(4, null);
		Node t2 = new Node(8,null);
		
		printNode(h);
		System.out.println();
		insertfrontNode(h,t1);
		System.out.println();
		insertNodeith(h,t2,4);
		
	
		
	}
	
	public static void insertfrontNode(Node head, Node target) {
		if(head == null) { //if the list is not empty;
			return;
		}
		
		else{// if there are any nodes in front of it
			target.next = head;
			head = target;
			
		
		}
		printNode(head);

	}
	
	public static void insertNodeith(Node head, Node target, int n) {
		Node temp = head;
		Node prev = null;
		
		int count = 1;
		if(head == null) {
			return;
		}
		
		while(temp!= null) {
			if(n == 1) {
				target.next = temp;
				temp = target;
				break;
			}
			if(count == n) {
				target.next = temp;
				prev.next = target;
				
				break;
			}
			if (temp.next == null) {
				temp.next = target;
				target.next = null;
				break;
			}
			else {
			prev = temp;
			temp = temp.next;
			
			count++;
			}
			

		}
	

		printNode(head);
		printNode(temp);
	
		
	} 
	
	public static void printNode(Node head) {
		Node temp = head;
		while (temp!=null) {
			System.out.print(temp.data + " -> ");
			if(temp.next == null) {
				System.out.print("null");
			}
			temp = temp.next;
			
			
		}
	}
}
