package behavioralpatterns.memento.example;

public class Hero {
    private int patrons = 10;
    private int lives = 5;

    public void shot() {
        if (patrons > 0) {
            patrons--;
            System.out.printf("Осталось %d патронов\n", patrons);
        } else
            System.out.println("Патронов больше нет");
    }

    public HeroMemento saveState() {
        System.out.printf("Сохранение игры: %d патронов, %d жизней\n", patrons, lives);
        return new HeroMemento(patrons, lives);
    }

    public void restoreState(HeroMemento memento) {
        this.patrons = memento.patrons;
        this.lives = memento.lives;
        System.out.printf("Восстановление игры: %d патронов, %d жизней\n", patrons, lives);
    }
}
