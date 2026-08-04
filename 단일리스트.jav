
class Node {           /* 노드 연결*/
    int data;
    Node next; 
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class SinglyLinkedList {
    Node head;              /* 다음꺼  head가 null역할 */

    public void insertAtHead(int data) {
        Node newNode = new Node(data);        /*헤드 연결*/
        newNode.next = head;
        head = newNode;
    }

    public void insertAtPosition(int data, int position) {
        if (position == 0) {
            insertAtHead(data);
            return;
        }
        Node newNode = new Node(data);     /* 0이면 삽입 */
        Node current = head;
        for (int i = 0; i < position - 1 && current != null; i++) {
            current = current.next;
        }
        if (current == null) return;
        newNode.next = current.next;
        current.next = newNode;
    }

    public void delete(int key) {
        Node current = head, prev = null; 
        while (current != null) {
            if (current.data == key) {
                if (prev != null) {
                    prev.next = current.next; /*다음껄로 넘김 */
                } else {
                    head = current.next;    /*다음공간으로 head감 */
                }
                return;
            }
            prev = current;
            current = current.next;
        }
    }

    public boolean search(int key) {
        Node current = head;
        while (current != null) {
            if (current.data == key) return true;
            current = current.next;
        }
        return false;
    }

    public void traverse() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");                       /* 화살표 구성 null이 아니면 작성 head로 다음껄 지정 */
    }

    public static void main(String[] args) {
        
        SinglyLinkedList ll = new SinglyLinkedList();
        
        ll.insertAtHead(17);
        ll.insertAtHead(18);
        ll.insertAtHead(19);
        ll.insertAtHead(76);
        ll.insertAtHead(44);
        
        ll.insertAtPosition(34, 3);
        
        ll.delete(18);
        
        System.out.println(ll.search(19)); // true
        
        ll.traverse();
        // 44 -> 76 -> 19 -> 34 -> 17 -> null
    }
}
