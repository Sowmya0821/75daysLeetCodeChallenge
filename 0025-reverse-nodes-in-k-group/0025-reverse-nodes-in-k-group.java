/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        ArrayList<Integer> list = new ArrayList<>();
        ListNode temp = head;
        while (temp != null) {
            list.add(temp.val);
            temp = temp.next;
        }
        for (int i = 0; i + k <= list.size(); i += k) {

            int l = i;
            int r = i + k - 1;

            while (l < r) {
                int x = list.get(l);
                list.set(l, list.get(r));
                list.set(r, x);

                l++;
                r--;
            }
        }
        temp = head;
        int i = 0;
        while (temp != null) {
            temp.val = list.get(i++);
            temp = temp.next;
        }
        return head;
    }
}