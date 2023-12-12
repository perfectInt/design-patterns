package creationalpatterns.builder.example;

public class WheatBreadBuilder extends BreadBuilder {
    @Override
    public void setFlour() {
        this.bread.flour = new Flour("2nd");
    }

    @Override
    public void setSalt() {
        this.bread.salt = new Salt();
    }

    @Override
    public void setAdditive() {
        this.bread.additive = new Additive("new additive");
    }
}
