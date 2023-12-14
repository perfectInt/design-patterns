package structuralpatterns.facade.example;

public class VisualStudioFacade {
    TextEditor textEditor;
    Compiler compiler;
    CLR clr;

    public VisualStudioFacade(TextEditor textEditor, Compiler compiler, CLR clr) {
        this.textEditor = textEditor;
        this.compiler = compiler;
        this.clr = clr;
    }

    public void start() {
        textEditor.createCode();
        textEditor.saveCode();
        compiler.compile();
        clr.execute();
    }

    public void stop() {
        clr.finish();
    }
}
