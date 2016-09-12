package linkedlist;

public class LinkedlistPrograms {
    private ListNode head;

    public ListNode getHead(){
        return head;
    }

    public void setHead(ListNode newHead){
        head = newHead;
    }

    public void addToList(int[] arr){
        if(arr!=null && arr.length>0) {
            head = new ListNode(arr[0]);
            int i = 1;
            ListNode temp = head;

            for ( ; i<arr.length; i++) {
                temp.next = new ListNode(arr[i]);
                temp = temp.next;
            }
        }
    }

    public void printList(ListNode newHead){
        ListNode temp = newHead;
        while(temp != null){
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
    }

    public ListNode reverseRange(ListNode first, ListNode last){
        if(first == null || first.next == null) return first;
        ListNode prev, curr, next;
        last.next = null;
        prev = null;
        curr = first;
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    public ListNode reverseByPosition(ListNode head, int m, int n) {
        if(head == null || head.next == null || m>=n) return head;
        ListNode prev,next,start,end,temp;
        temp = head;
        start = head;
        prev = null;
        int count = 1;
        while(temp!=null && count!=n){
            if(count==m-1){
                prev=temp;
                start=temp.next;
            }
            count++;
            temp=temp.next;
        }
        if(temp==null) return head;
        else{
            end = temp;
            next = temp.next;
        }
        ListNode reverseHead = reverseRange(start, end);
        start = reverseHead;
        while(reverseHead.next!=null){
            reverseHead = reverseHead.next;
        }
        end = reverseHead;
        end.next=next;
        if(prev != null){
            prev.next=start;
        }
        else{
            head = start;
        }
        return head;
    }

    public ListNode reverseList(ListNode head){
        if(head==null || head.next==null)return head;
        ListNode prev, curr, next;
        prev = null;
        curr = head;
        while (curr!=null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    public ListNode detectCycle(ListNode head) {
        if(head == null || head.next == null) return null;
        ListNode slow, fast;
        slow = head;
        fast = head;
        while(true){
            if(fast == null || fast.next==null)return null;
            slow = slow.next;
            fast = fast.next.next;
            if(fast==slow)break;
        }
        fast = head;
        while(slow!=fast){
            slow = slow.next;
            fast = fast.next;
        }
        return fast;
    }

    public boolean compareList(ListNode headA,ListNode headB){
        if(headA == null || headB == null) return false;
        ListNode a, b;
        a = headA;
        b = headB;

        while(a != null || b != null){
            if(a.val != b.val) return false;
            a = a.next;
            b = b.next;
        }
        if(a == null && b == null) return true;
        else{
            return false;
        }
    }

    public boolean palindrome(ListNode head){
        if(head == null || head.next == null) return false;
        ListNode slow, fast, prev, mid;
        prev = null;
        slow = head;
        fast = head;
        while(fast != null && fast.next != null){
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode start;
        if(fast == null){
            mid = prev;
            start = slow;
        }
        else{
            mid = slow;
            start = slow.next;
        }
        mid.next = null;
        boolean result = false;
        ListNode head2 = reverseList(start);
        result = compareList(head2, head);
        head2 = reverseList(head2);
        mid.next = head2;
        return  result;
    }

    public ListNode oddEvenList(ListNode head) {
        if(head == null || head.next == null || head.next.next == null) return head;
        ListNode heada, headb, tempa, tempb;
        heada = head;
        headb = head.next;
        tempa = heada;
        tempb = headb;
        int count = 1;
        while(tempa!=null && tempb!=null){
            if(count%2!=0){
                if(tempa.next!=null){
                    tempa.next = tempa.next.next;
                    tempa = tempa.next;
                }
            }
            else{
                if(tempb.next!=null){
                    tempb.next = tempb.next.next;
                    tempb = tempb.next;
                }
            }
            count++;
        }
        ListNode taila = heada;
        while(taila.next!=null){
            taila = taila.next;
        }
        taila.next = headb;
        return heada;
    }

    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head == null || (head.next == null && n == 1) || n<0) return null;
        ListNode temp = head;
        ListNode slow = head, fast = head;
        int count = 0;
        while(count<n){
            fast = fast.next;
            count++;
        }
        if(fast == null) return slow.next;
        while(fast.next!=null){
            slow = slow.next;
            fast = fast.next;
        }
        slow.next = slow.next.next;
        return head;
    }
    
    public boolean compareLists(ListNode a, ListNode b){
        if(a==null && b==null) return true;
        if(a==null) return false;
        if(b==null) return false;

        while(a!=null && b!=null){
            if(a.val != b.val) return false;
            a = a.next;
            b = b.next;
        }
        if(a==null && b==null) return true;
        return false;
    }

    public boolean isPalindrome(ListNode head) {
        if(head==null || head.next==null) return true;

        ListNode prev = null, slow = head, fast = head;

        while(fast!=null && fast.next!=null){
            fast = fast.next.next;
            prev = slow;
            slow = slow.next;
        }

        if(fast==null){
            prev.next = null;
        }
        else{
            prev.next = null;
            slow = slow.next;
        }

        slow = reverseList(slow);

        return compareLists(head, slow);
    }
}
