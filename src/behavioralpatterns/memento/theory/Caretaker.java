package behavioralpatterns.memento.theory;

/**
 * Caretaker: выполняет только функцию хранения объекта Memento,
 * в то же время у него нет полного доступа к хранителю и никаких других операций над хранителем,
 * кроме собственно сохранения, он не производит
 */
public class Caretaker {
    public Memento memento;
}
