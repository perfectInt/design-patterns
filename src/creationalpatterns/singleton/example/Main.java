package creationalpatterns.singleton.example;

public class Main {
    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.launch("Ubuntu 20.04");
        System.out.println(computer.os.getName());
    }
}
