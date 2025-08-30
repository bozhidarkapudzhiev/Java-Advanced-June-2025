package Lab;

import java.util.ArrayDeque;
import java.util.Scanner;

public class _1_BrowserHistory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayDeque<String> browser = new ArrayDeque<>();
        String input;

        while (!"Home".equals(input = scanner.nextLine())) {
            if ("back".equals(input)) {
                if (browser.size() <= 1) {
                    System.out.println("no previous URLs");
                }else {
                    browser.pop();
                    System.out.println(browser.peek());
                }


            } else {
                browser.push(input);
                System.out.println(browser.peek());
            }
        }
    }
}
