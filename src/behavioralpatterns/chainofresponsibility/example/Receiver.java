package behavioralpatterns.chainofresponsibility.example;

public class Receiver {
    public boolean bankTransfer;
    public boolean moneyTransfer;
    public boolean payPalTransfer;

    public Receiver(boolean bankTransfer, boolean moneyTransfer, boolean payPalTransfer) {
        this.bankTransfer = bankTransfer;
        this.moneyTransfer = moneyTransfer;
        this.payPalTransfer = payPalTransfer;
    }
}
