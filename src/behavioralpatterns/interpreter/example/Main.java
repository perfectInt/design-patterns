package behavioralpatterns.interpreter.example;

/**
 * Паттерн Интерпретатор (Interpreter) определяет представление грамматики для заданного языка
 * и интерпретатор предложений этого языка.
 * Как правило, данный шаблон проектирования применяется для часто повторяющихся операций.
 */
public class Main {
    public static void main(String[] args) {
        Context context = new Context();
        int x = 5;
        int y = 8;
        int z = 2;

        context.setVariable("x", x);
        context.setVariable("y", y);
        context.setVariable("z", z);

        Expression expression = new SubtractExpression(
                new AddExpression(
                        new NumberExpression("x"), new NumberExpression("y")
                ),
                new NumberExpression("z")
        );

        int result = expression.interpret(context);
        System.out.println(result);
    }
}
