import bitwise.BitwisePrograms;
import generic.MyQueue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Programs {

    public static void main(String[] args) {
        BitwisePrograms bitwisePrograms = new BitwisePrograms();
        for(int i: bitwisePrograms.countBits(10)){
            System.out.print(i+" ");
        }
    }
}
