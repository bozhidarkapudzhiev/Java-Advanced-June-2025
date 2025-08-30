package Exercise;

import java.util.*;

public class _3_MaximumElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int counter = Integer.parseInt(scanner.nextLine());//брой команди
        ArrayDeque<Integer>stackOperation=new ArrayDeque<>();
        while (counter-- > 0) {
            int[] arraysInteger = Arrays.stream(scanner.nextLine().split("\\s+")).
                    mapToInt(Integer::parseInt)
                    .toArray();//масив съдържащ текуща команда и число
            int commandOperation = arraysInteger[0];
            switch (commandOperation) {
                case 1://Добавяне на елемент в стака
                    stackOperation.push(arraysInteger[1]);
                    break;
                case 2://Премахване на елемент от стека
                    stackOperation.pop();
                    break;
                case 3://Намиране на най-големия елемент в стека
                    if (!stackOperation.isEmpty()){//Проверяваме дали стекът не е празен
                        Optional<Integer>maxElement=stackOperation.stream().max(Comparator.naturalOrder());
                        System.out.println(maxElement.get());
                    }

            }
        }
    }
}
