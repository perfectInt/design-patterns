package behavioralpatterns.interpreter.example;

import java.util.HashMap;
import java.util.Map;

/**
 * Context: содержит общую для интерпретатора информацию.
 * Может использоваться объектами терминальных и нетерминальных выражений для сохранения состояния операций
 * и последующего доступа к сохраненному состоянию
 */
public class Context {
    Map<String, Integer> variables;

    public Context() {
        variables = new HashMap<>();
    }

    public int getVariable(String name) {
        return variables.get(name);
    }

    public void setVariable(String name, int value) {
        variables.put(name, value);
    }
}
