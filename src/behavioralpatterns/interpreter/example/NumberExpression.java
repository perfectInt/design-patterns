package behavioralpatterns.interpreter.example;

public class NumberExpression implements Expression {
    String name;

    public NumberExpression(String name) {
        this.name = name;
    }

    @Override
    public int interpret(Context context) {
        return 0;
    }
}
