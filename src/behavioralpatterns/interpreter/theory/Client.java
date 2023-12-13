package behavioralpatterns.interpreter.theory;

import behavioralpatterns.interpreter.example.Context;

/**
 * Client: строит предложения языка с данной грамматикой в виде абстрактного синтаксического дерева,
 * узлами которого являются объекты TerminalExpression и NonterminalExpression
 */
public class Client {
    public void run() {
        Context context = new Context();

        var expression = new NonterminalExpression();
        expression.interpret(context);
    }
}
