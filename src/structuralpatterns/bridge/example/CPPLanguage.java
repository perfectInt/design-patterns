package structuralpatterns.bridge.example;

public class CPPLanguage implements Language {
    @Override
    public void build() {
        System.out.println("C++ build");
    }

    @Override
    public void execute() {
        System.out.println("C++ execute");
    }
}
