package creationalpatterns.builder.example;

public class RyeBreadBuilder extends BreadBuilder {
    @Override
    public void setFlour() {
        this.bread.flour = new Flour("1st");
    }

    @Override
    public void setSalt() {
        this.bread.salt = new Salt();
    }

    @Override
    public void setAdditive() {
        // не используется
    }
}
