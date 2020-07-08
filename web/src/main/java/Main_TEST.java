import java.util.ArrayList;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class Main_TEST {
    private static final Worker WORKER2 = new Worker("Dima", "33");

    public static void main(String[] args) {
        Consumer<Worker> consumer = (worker)->System.out.println(worker.getname2());
        Worker worker = new Worker("Dima", "55");
        consumer.andThen((worker2)->System.out.println(worker2.getAge())).accept(worker);
        
        BiConsumer<Worker, String> biConsumer = (myWorker, myString) -> System.out.println(myWorker + myString);
        biConsumer.accept(worker, "added");
    }

    
}

class Worker {
    private String name2;

    public Worker(String name2, String age) {
        super();
        this.name2 = name2;
        this.age = age;
    }

    public Worker(String name2) {
        super();
        this.name2 = name2;
    }
    
    private String age;

    public String getname2() {
        return name2;
    }

    public void setname2(String name2) {
        this.name2 = name2;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Worker [name2=" + name2 + ", age=" + age + "]";
    }

}
