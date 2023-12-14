package structuralpatterns.bridge.example;

public abstract class Programmer {
    protected Language language;

    public void setLanguage(Language language) {
        this.language = language;
    }

    public Programmer(Language language) {
        this.language = language;
    }

    public void doWork() {
        language.build();
        language.execute();
    }

    public abstract void earnMoney();
}
