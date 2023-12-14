package structuralpatterns.facade.example;

/**
 * Фасад (Facade) представляет шаблон проектирования,
 * который позволяет скрыть сложность системы с помощью предоставления упрощенного интерфейса для взаимодействия с ней.
 */
public class Main {
    public static void main(String[] args) {
        TextEditor textEditor = new TextEditor();
        Compiler compiler = new Compiler();
        CLR clr = new CLR();

        VisualStudioFacade facade = new VisualStudioFacade(textEditor, compiler, clr);

        Programmer programmer = new Programmer();
        programmer.createApp(facade);
    }
}
