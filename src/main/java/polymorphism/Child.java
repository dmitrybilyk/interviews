package polymorphism;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.io.FileNotFoundException;

@EqualsAndHashCode(callSuper = true)
@Data
@Getter
@Setter
public class Child extends Parent {
    @Override
    public UsedParent printAndReturnNewName(UsedParent newName) throws FileNotFoundException {
        try {
            return new UsedParent();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new UsedParent();
    }
    public int printAndReturnNewName(String name, String surname) throws Exception {
//        return "";
        return 3;
    }
}
