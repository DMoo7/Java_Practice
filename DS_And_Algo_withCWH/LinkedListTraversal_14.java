public class LinkedListTraversal_14 {

    public static class ListNode {
        int val;
        ListNode next;
    }

    public void insert(int val) {

        ListNode head = new ListNode();

        ListNode node = new ListNode();
        node.val = val;
        node.next = null;

        if(head == null) {
            head = node;
        } else {
            ListNode n = head;

            while (n.next != null) {
                n.next = n;
            }
            n.next = node;
        }

    }

    public void show() {
        ListNode head = new ListNode();

        while (head.next != null) {
            System.out.println(head.val);
            head = head.next;
        }
    }

    public static void main(String[] args) {
        LinkedListTraversal_14 obj = new LinkedListTraversal_14();
        obj.insert(7);
        obj.insert(88);
        obj.insert(67);
        obj.show();


    }

}
