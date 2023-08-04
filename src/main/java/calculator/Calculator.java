package calculator;

public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public int calculate(int value1, int value2, char opt) {
        if (opt == '*')
            return value1 * value2;
        else if (opt == '/')
            return value1 / value2;
        else if (opt == '^') {
            int res = 1;
            for (int i = 0; i < value2; i++) {
                res *= value1;
            }
            return res;
        }
        return 0;
    }
}
