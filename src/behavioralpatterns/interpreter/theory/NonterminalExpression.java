package behavioralpatterns.interpreter.theory;

import behavioralpatterns.interpreter.example.Context;

/**
 * NonterminalExpression: нетерминальное выражение, представляет правило грамматики.
 * Для каждого отдельного правила грамматики создается свой объект NonterminalExpression.
 */
public class NonterminalExpression extends AbstractExpression {
    AbstractExpression abstractExpression1;
    AbstractExpression abstractExpression2;
    @Override
    public void interpret(Context context) {

    }
}
