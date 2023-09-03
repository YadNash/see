public class Doubly {
    class Node {
        int data;
        Node next, prev;

        public Node(int data) {
            this.data = data;
        }
    }

    Node head, tail = null;

    public void add(int val) {
        Node node = new Node(val);
        if (head == null) {
            head = tail = node;
            node.next = null;
            node.prev = null;
        } else {
            tail.next = node;
            node.prev = tail;
            tail = node;
            node.next = null;
        }
    }

    public  int min(){
        Node curr = head;
        int ans = curr.data;
        while(curr !=null){
           if(ans>curr.data){
            ans=curr.data;
           } 
           curr = curr.next;
        }
        return ans;
    }
      public int max(){
        Node curr = head;
        int ans = curr.data;
        while(curr !=null){
           if(ans<curr.data){
            ans=curr.data;
           } 
           curr = curr.next;
        }
        return ans;
    }
    public static void main(String[] args) {
        Doubly list = new Doubly();
        list.add(10);
        list.add(230);
        list.add(1);
        list.add(26);
        list.add(654);
        list.add(65);
        System.out.println("min:"+list.min());
        System.out.println("max:"+list.max());
    }
}
