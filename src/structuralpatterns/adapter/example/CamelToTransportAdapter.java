package structuralpatterns.adapter.example;

public class CamelToTransportAdapter implements Transport {

    Camel camel;

    public CamelToTransportAdapter(Camel camel) {
        this.camel = camel;
    }

    @Override
    public void drive() {
        camel.move();
    }
}
