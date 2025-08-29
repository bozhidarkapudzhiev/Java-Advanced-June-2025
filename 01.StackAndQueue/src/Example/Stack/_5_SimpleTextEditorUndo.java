package Example.Stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class _5_SimpleTextEditorUndo {
    public static void main(String[] args) {
        Deque<String>undoHistory=new ArrayDeque<>();
        StringBuilder text=new StringBuilder();

        //Operation 1: Append "hello"
        text.append("hello");//hello
        System.out.println("Current text: "+text);

        //Operation 2 : Append " word"
        undoHistory.push(text.toString());
        text.append(" world");//hello world
        System.out.println("Current text: "+ text);

        //Operation 3 :Undo
        text=new StringBuilder(undoHistory.pop());
        System.out.println("After undo: "+text);
    }
}
