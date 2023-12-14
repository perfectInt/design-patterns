package structuralpatterns.facade.example;

public class Programmer {
    public void createApp(VisualStudioFacade facade) {
        facade.start();
        facade.stop();
    }
}
