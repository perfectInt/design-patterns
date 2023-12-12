package creationalpatterns.singleton.example;

public class Computer {
    public OS os;

    public void launch(String osName) {
        os = OS.getInstance(osName);
    }
}
