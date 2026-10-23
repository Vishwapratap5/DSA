class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode n1 = list1;
        ListNode n2 = list2;

        ListNode dummy = new ListNode(0);
        ListNode current = dummy;

        while (n1 != null && n2 != null) {
            if (n1.val <= n2.val) {
                current.next = n1;
                n1 = n1.next;
            } else {
                current.next = n2;
                n2 = n2.next;
            }

            current = current.next;
        }

        if (n1 != null) {
            current.next = n1;
        } else {
            current.next = n2;
        }

        return dummy.next;
    }
}