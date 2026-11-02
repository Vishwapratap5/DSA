class Solution {

    public ListNode removeNodes(ListNode head) {

        head = reverse(head);

        int max = Integer.MIN_VALUE;

        ListNode dummy = new ListNode(-1);
        ListNode current = dummy;

        while (head != null) {

            if (head.val >= max) {

                max = head.val;

                current.next = head;
                current = current.next;
            }

            head = head.next;
        }

        current.next = null;

        return reverse(dummy.next);
    }

    public ListNode reverse(ListNode head) {

        ListNode prev = null;
        ListNode current = head;

        while (current != null) {

            ListNode next = current.next;

            current.next = prev;
            prev = current;
            current = next;
        }

        return prev;
    }
}