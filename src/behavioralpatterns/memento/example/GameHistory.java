package behavioralpatterns.memento.example;

import java.util.Stack;

public class GameHistory {
    public Stack<HeroMemento> history;

    public GameHistory() {
        history = new Stack<>();
    }
}
