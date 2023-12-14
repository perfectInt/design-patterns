package structuralpatterns.bridge.example;

public class FreelanceProgrammer extends Programmer {
    public FreelanceProgrammer(Language language) {
        super(language);
    }

    @Override
    public void earnMoney() {
        System.out.println("Salary for project");
    }
}
