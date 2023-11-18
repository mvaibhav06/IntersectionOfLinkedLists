package stack;

class ListNode1 {
      int val;
      ListNode1 next;
      ListNode1() {}
      ListNode1(int val) { this.val = val; }
      ListNode1(int val, ListNode1 next) { this.val = val; this.next = next; }
  }
public class IntersectionOfTwoLinkedLists {
    public ListNode1 getIntersectionNode(ListNode1 headA, ListNode1 headB) {
        int len1 = 0;
        int len2 = 0;

        ListNode1 current1 = headA;
        ListNode1 current2 = headB;

        while(current1 != null){
            len1++;
            current1 = current1.next;
        }
        while(current2 != null){
            len2++;
            current2 = current2.next;
        }
        current1 = headA;
        current2 = headB;
        if(len1 > len2){
            for(int i=0; i<(len1-len2); i++){
                current1 = current1.next;
            }
        }else{
            for(int i=0; i<(len2-len1); i++){
                current2 = current2.next;
            }
        }

        while(current1!=null){
            if(current1 == current2){
                return current1;
            }
            current1 = current1.next;
            current2 = current2.next;
        }
        return null;
    }
}
