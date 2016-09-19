package generic;

import java.util.LinkedList;
import java.util.Queue;

public class MyStack<T> {
    Queue<T> front = new LinkedList<>();
    Queue<T> back = new LinkedList<>();

    public T push(T element){
        if(front.isEmpty()) front.add(element);
        else{
            back.add(element);
            while(!front.isEmpty()){
                back.add(front.poll());
            }
            front = back;
            back = new LinkedList<T>();
        }
        return element;
    }

    public T pop(){
        T element = null;
        if(front != null){
            element = front.poll();
        }
        return element;
    }

    public T peek(){
        return front.peek();
    }

    public boolean empty(){
        return front.isEmpty()? true: false;
    }
}
