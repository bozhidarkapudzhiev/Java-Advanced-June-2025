package Queue.Examples;

import java.util.*;

public class _4_Breadth_FirstSearch_BFSTraversal {
    public static void main(String[] args) {
        //Пример за граф
        Map<Integer, List<Integer>> graph = new HashMap<>();
        graph.put(0, Arrays.asList(1, 2));
        graph.put(1, Arrays.asList(3));
        graph.put(2, Arrays.asList(3));
        graph.put(3, new ArrayList<>());

        Queue<Integer> queue = new ArrayDeque<>();
        Set<Integer> visited = new HashSet<>();

        //Започваме от възел 0
        queue.offer(0);
        visited.add(0);
        System.out.print("BFS Traversal: ");
        int currentNode;
        while (!queue.isEmpty()) {
            currentNode = queue.poll();
            System.out.println(currentNode + " ");

            //Добавяме всички непосетени съседи в опашката
            for (int neighbor : graph.get(currentNode)) {
                if (!visited.contains(neighbor)) {
                    queue.offer(neighbor);
                    visited.add(neighbor);
                }
            }
        }
    }
}
