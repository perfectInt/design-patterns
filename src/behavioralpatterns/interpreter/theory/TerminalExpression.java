package behavioralpatterns.interpreter.theory;

import behavioralpatterns.interpreter.example.Context;

/**
 * TerminalExpression: терминальное выражение, реализует метод interpret() для терминальных символов грамматики.
 * Для каждого символа грамматики создается свой объект TerminalExpression
 */
public class TerminalExpression extends AbstractExpression {
    @Override
    public void interpret(Context context) {

    }
}
