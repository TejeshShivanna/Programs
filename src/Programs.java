import bitwise.BitwisePrograms;
import linkedlist.LinkedlistPrograms;
import numbers.NumbersPrograms;
import strings.StringPrograms;

public class Programs {

    public static void main(String[] args) {

        // linkedlist
//        int[] arr = new int[]{1,2,3,4,5,6,7,8,9,10};
//        linkedlist.LinkedlistPrograms programs = new linkedlist.LinkedlistPrograms();
//        programs.addToList(arr);
//        ListNode newhead = programs.removeNthFromEnd(programs.getHead(), 10);
//        programs.printList(newhead);

        //array
//        int[] arr = new int[]{2};
//        array.LinkedlistPrograms arrPrograms= new array.LinkedlistPrograms();
//        System.out.println(arrPrograms.firstMissingPositive(arr));
        //System.out.println(new BitwisePrograms().countones(81));

        System.out.println(new StringPrograms().reverse("golf"));
        System.out.println(new StringPrograms().reverseVowels("aA"));
        System.out.println(new NumbersPrograms().isUgly(100));
    }
}
