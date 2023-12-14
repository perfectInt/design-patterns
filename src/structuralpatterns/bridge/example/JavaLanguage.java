package structuralpatterns.bridge.example;

public class JavaLanguage implements Language {

    @Override
    public void build() {
        System.out.println("Java build");
    }

    @Override
    public void execute() {
        System.out.println("Java execute");
    }
}
