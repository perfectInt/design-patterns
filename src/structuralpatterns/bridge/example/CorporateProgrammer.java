package structuralpatterns.bridge.example;

public class CorporateProgrammer extends Programmer {
    public CorporateProgrammer(Language language) {
        super(language);
    }

    @Override
    public void earnMoney() {
        System.out.println("Salary per month");
    }
}
