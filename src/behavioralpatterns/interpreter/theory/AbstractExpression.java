package behavioralpatterns.interpreter.theory;

import behavioralpatterns.interpreter.example.Context;

/**
 * AbstractExpression: определяет интерфейс выражения, объявляет метод interpret()
 */
public abstract class AbstractExpression {
    public abstract void interpret(Context context);
}
