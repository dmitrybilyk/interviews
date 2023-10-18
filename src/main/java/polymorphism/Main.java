package polymorphism;

import lombok.SneakyThrows;

public class Main {
    @SneakyThrows
    public static void main(String[] args) {
        Child child = new Child();
        child.setName("Dymo");
        child.printAndReturnNewName(new UsedChild());
    }
}
