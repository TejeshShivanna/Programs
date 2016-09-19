package generic;

import java.util.Stack;

public class MyQueue<T> {

    Stack<T> front = new Stack<T>();
    Stack<T> back = new Stack<T>();

    public void push(T element){
        if(front.empty()){
            front.push(element);
        }
        else{
            while (!front.empty()){
                back.push(front.pop());
            }
            front.push(element);
            while(!back.empty()){
                front.push(back.pop());
            }
        }
    }

    public T peek(){
        return front.peek();
    }

    public void pop(){
        front.pop();
    }

    public boolean empty(){
        return (front.isEmpty())?true:false;
    }
}
