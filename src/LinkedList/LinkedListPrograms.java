package LinkedList;

public class LinkedListPrograms {
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

    public void printList(){
        ListNode temp = head;
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
}
