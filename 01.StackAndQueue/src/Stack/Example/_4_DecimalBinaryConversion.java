package Stack.Example;

import java.util.ArrayDeque;
import java.util.Scanner;

public class _4_DecimalBinaryConversion {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        ArrayDeque<Integer>stack=new ArrayDeque<>();
          int n=Integer.parseInt(scanner.nextLine());
         if (n==0){
             System.out.println(0);
             return;
         }
          while (n!=0){
              if (n%2==0){
                  stack.push(0);
              }else {
                  stack.push(1);
              }
              n/=2;
          }
          while(!stack.isEmpty()){
              System.out.print(stack.pop());
          }
        System.out.println();
    }
}
