package behavioralpatterns.memento.example;

/**
 * Паттерн Хранитель (Memento) позволяет выносить внутреннее состояние объекта
 * за его пределы для последующего возможного восстановления объекта без нарушения принципа инкапсуляции.
 */
public class Main {
    public static void main(String[] args) {
        Hero hero = new Hero();
        hero.shot();
        GameHistory gameHistory = new GameHistory();
        gameHistory.history.push(hero.saveState());
        hero.shot();
        hero.restoreState(gameHistory.history.pop());
        hero.shot();
    }
}
