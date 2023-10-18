package polymorphism;

import lombok.Data;

import java.io.FileNotFoundException;

@Data
public class Parent {
    private String name;
    public UsedParent printAndReturnNewName(UsedParent newName) throws FileNotFoundException {
        System.out.println(newName + name);
        return new UsedChild();
    }
}
