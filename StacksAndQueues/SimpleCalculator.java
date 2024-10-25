    package StacksAndQueues;

    import java.util.ArrayDeque;
    import java.util.Scanner;

    public class SimpleCalculator {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);


            ArrayDeque<Integer> numbersStack = new ArrayDeque<>();
    //2 + 5 + 10 - 2 - 1
            String[] tokens = scanner.nextLine().split("\\s+");
            for (int position = 0; position < tokens.length; position++) {
                String token = tokens[position];
                if (Character.isDigit(token.charAt(0))) {
                    numbersStack.push(Integer.parseInt(token));
                } else {
                    int rightOperand = Integer.parseInt(tokens[++position]);
                    int leftOperand = numbersStack.peek();
                    numbersStack.push(rightOperand);

                    int result = token.equals("+")
                            ? leftOperand + rightOperand
                            : leftOperand - rightOperand;
                    numbersStack.push(result);
                }


            }
            System.out.println(numbersStack.peek());
        }
    }
