import java.util.*;
//Write a java projgram to push the new element at bottom of stack

public class PushAtLast{

    public static void pushAtLast(int data,Stack<Integer> s){
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        int top = s.pop();
        pushAtLast(data, s);
        s.push(top);
    }
    public static void main(String[] args){
        
        Stack<Integer> s = new Stack<>();

        s.push(1);
        s.push(2);
        s.push(3);

        pushAtLast(4, s);

        while(!s.isEmpty()){
            System.err.println(s.peek());
            s.pop();
        }
    }
}

// 3
// 2
// 1
// 4
