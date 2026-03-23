// Basic Core Programming
public class Basic_data_types {
    public static void main(String[] args) {
        // ---------------------------
        // 1) Variables & Literals
        // ---------------------------
        int a = 10;                 // integer literal: 10
        int b = 20;                 // integer literal: 20
        long bigNumber = 10000000000L; // long literal ends with L
        float price = 1.25f;       // float literal ends with f
        double pi = 3.14159;       // double literal (default for decimals)
        char grade = 'A';          // character literal in single quotes
        boolean isJavaFun = true;  // boolean literals: true/false
        String language = "Java";  // string literal in double quotes
        String nothing = null;     // null literal

        System.out.println("Sum (a + b) = " + (a + b));
        System.out.println("bigNumber = " + bigNumber);
        System.out.println("price = " + price);
        System.out.println("pi = " + pi);
        System.out.println("grade = " + grade);
        System.out.println("isJavaFun = " + isJavaFun);
        System.out.println("language = " + language);
        System.out.println("nothing = " + nothing);

        // ---------------------------
        // 2) Primitive Data Types
        // ---------------------------
        byte by = 5;
        short sh = 32000;
        int in = -123;
        long lo = 9999999999L;
        float fl = 2.5f;
        double db = 100.123;
        boolean bo = false;
        char ch = '\u0041'; // Unicode escape for 'A'

        System.out.println("Primitives: " + by + ", " + sh + ", " + in + ", " + lo + ", " + fl + ", " + db + ", " + bo + ", " + ch);

        // ---------------------------
        // 3) Operators & Basic Operations
        // ---------------------------
        int arithmetic = a + b;        // +
        int subtraction = b - a;      // -
        int multiplication = a * b;   // *
        int division = b / a;         // /
        int remainder = b % a;        // %

        System.out.println("Arithmetic: " + arithmetic);
        System.out.println("Subtraction: " + subtraction);
        System.out.println("Multiplication: " + multiplication);
        System.out.println("Division: " + division);
        System.out.println("Remainder: " + remainder);

        // Relational (comparison) operators
        boolean isEqual = (a == b);
        boolean isGreater = (b > a);
        boolean isLessOrEqual = (a <= b);
        System.out.println("Relational: isEqual=" + isEqual + ", isGreater=" + isGreater + ", isLessOrEqual=" + isLessOrEqual);

        // Logical (&&, ||, !) operators
        boolean logic1 = (a < b) && (b < 100);
        boolean logic2 = (a == 10) || (b == 30);
        boolean notLogic1 = !logic1;
        System.out.println("Logical: logic1=" + logic1 + ", logic2=" + logic2 + ", notLogic1=" + notLogic1);

        // Ternary operator
        int max = (a > b) ? a : b;
        System.out.println("Max using ternary = " + max);

        // ---------------------------
        // 4) Conditional Statements (if/else)
        // ---------------------------
        int sum = a + b;
        if (sum > 20) {
            System.out.println("sum is greater than 20");
        } else if (sum == 20) {
            System.out.println("sum is exactly 20");
        } else {
            System.out.println("sum is less than 20");
        }

        // ---------------------------
        // 5) switch statement
        // ---------------------------
        int dayNumber = 3;
        switch (dayNumber) {
            case 1:
                System.out.println("Day: Monday");
                break;
            case 2:
                System.out.println("Day: Tuesday");
                break;
            case 3:
                System.out.println("Day: Wednesday");
                break;
            case 4:
                System.out.println("Day: Thursday");
                break;
            default:
                System.out.println("Day: Other");
        }

        // ---------------------------
        // 6) Iterations (loops)
        // ---------------------------
        // for loop
        System.out.println("for loop (0..4):");
        for (int i = 0; i < 5; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        // while loop
        System.out.println("while loop (count down):");
        int counter = 3;
        while (counter > 0) {
            System.out.println("counter = " + counter);
            counter--;
        }

        // do-while loop (runs at least once)
        System.out.println("do-while loop (runs at least once):");
        int k = 0;
        do {
            System.out.println("k = " + k);
            k++;
        } while (k < 2);

        // for-each loop
        int[] numbers = {1, 2, 3, 4, 5, 6};
        int total = 0;
        System.out.println("for-each with break/continue:");
        for (int value : numbers) {
            if (value == 3) {
                continue; // skip 3
            }
            if (value == 5) {
                break; // stop at 5
            }
            total += value;
            System.out.println("added " + value);
        }
        System.out.println("total (after break/continue) = " + total);

        // ---------------------------
        // 7) Debugging (try/catch example)
        // ---------------------------
        // Example of handling an error safely instead of crashing.
        String input = "123abc";
        try {
            int parsed = Integer.parseInt(input);
            System.out.println("Parsed number = " + parsed);
        } catch (NumberFormatException e) {
            System.out.println("Debug: input '" + input + "' is not a valid integer.");
            System.out.println("Debug details: " + e.getMessage());
        }

        // ---------------------------
        // 8) Source Code Control & Hygiene (shown as reminders)
        // ---------------------------
        // Proper programming hygiene:
        // - Use meaningful names
        // - Keep code formatted
        // - Handle errors using exceptions
        // - Add comments when needed
        // Source control:
        // - Use Git commits and push to GitHub to track changes.
        System.out.println("Remember: use Git/GitHub and keep your code clean.");
    }
}
