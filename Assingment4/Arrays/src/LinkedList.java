public class LinkedList {
    public Node head;
    public Node tail;
    public int size;

    public Node createLinkedList(int nodeData){
        head = new Node();
        Node node = new Node();
        node.next = null;
        node.prev = null;
        node.data = nodeData;
        head = node;
        tail = node;
        size = 1;
        return head;
    }

    public void addToLinkedList(int nodeData,int location){
        Node node = new Node();
        node.data = nodeData;
        if (head == null){
            createLinkedList(nodeData);
            return;
        } else if (location == 0) {
            node.next = head;
            head.prev = node;
            head = node;
//            if (tail == null){
//                tail = node;
//            }
        } else if (location >= size) {
            tail.next = node;
            tail.prev = tail;
            node.next = null;
            tail = node;
        }else {
            Node tempNode = head;
            int index = 0;
            while (index < location - 1){
                tempNode = tempNode.next;
                index++;
            }
            Node nextNode = tempNode.next;
            node.next = nextNode;
            node.prev = tempNode;
            tempNode.next = node;
            if (nextNode != null){
                nextNode.prev = node;
            }
        }
        size++;
    }

    public void traverseLinkedList(){
        if (head==null){
            System.out.println("linked list does not real");
        }else {
            Node tempNode = head;
            for (int i = 0; i < size; i++) {
                System.out.print(tempNode.data);
                if (i !=size-1){
                    System.out.print("->");
                }
                tempNode = tempNode.next;
            }
        }
        System.out.println("\n");
    }

    public boolean searchNode(int nodeData){
        if (head !=null){
            Node tempNode = head;
            for (int i = 0; i < size; i++) {
                if (tempNode.data == nodeData){
                    System.out.println("found node: "+tempNode.data+" at location "+i+"\n");
                    return true;
                }
                tempNode = tempNode.next;
            }
        }
        System.out.println("node not found");
        return false;
    }

    //deleting a node from a list
    //1. if like not real
    //2. if deleting at head make new head
    //3. if deleting at the end make new tail
    //4. if deleting anywhere in the list
    public void deleteNode(int location){
        if (head !=null){
          if (location == 0){
              head = head.next;
              size--;
          } else if (location >= size) {
              tail = tail.prev;
              size--;
          }else {
              Node tempNode = head;
              int index = 0;
              while (index < location - 1){
                  tempNode = tempNode.next;
                  index++;
              }
              if (tempNode !=null && tempNode.next !=null){
                  tempNode.next = tempNode.next.next;
              }
              size--;
          }
        }
    }


    public static void main(String[] args) {
        LinkedList sda = new LinkedList();
        sda.addToLinkedList(1,0);
        sda.addToLinkedList(2,1);
        sda.addToLinkedList(3,2);
        sda.addToLinkedList(4,3);
        sda.addToLinkedList(5,4);
        sda.addToLinkedList(6,5);

        sda.traverseLinkedList();
        sda.searchNode(1);
        sda.deleteNode(0);
        sda.deleteNode(3);
        sda.deleteNode(5);
        sda.traverseLinkedList();
    }


}
