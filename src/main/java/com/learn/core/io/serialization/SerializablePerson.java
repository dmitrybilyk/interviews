package com.learn.core.io.serialization;

import java.io.*;

class Home implements Serializable{
    private String home;
    public Home(String home){
        this.home = home;
    }
    public String getHome() {
        return home;
    }
}
public class SerializablePerson implements Serializable {
    private String name;
    private int countOfNiva;
    private String fatherName;
    private Home home;

    public SerializablePerson(String name, int countOfNiva, String fatherName, Home home) {
        this.name = name;
        this.countOfNiva = countOfNiva;
        this.fatherName = fatherName;
        this.home = home;
    }

    @Override
    public String toString() {
        return "Person {" + "name='" + name + '\'' +
                ", countOfNiva=" + countOfNiva +
                ", fatherName='" + fatherName + '\'' +
                ", home=" + home + '}';
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Home home = new Home("Oschepkova 4");
        SerializablePerson dima = new SerializablePerson("Dima", 2,
                "Volodymyrovich", home);
        SerializablePerson lena = new SerializablePerson("Lena", 2,
                "Alexandrovna", home);

        //Сериализация в файл с помощью класса ObjectOutputStream
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(
                new FileOutputStream("person.out"));
        objectOutputStream.writeObject(dima);
        objectOutputStream.writeObject(lena);
        objectOutputStream.close();

        // Востановление из файла с помощью класса ObjectInputStream
        ObjectInputStream objectInputStream = new ObjectInputStream(
                new FileInputStream("person.out"));
        SerializablePerson dimaRestored = (SerializablePerson)objectInputStream.readObject();
        SerializablePerson lenaRestored = (SerializablePerson)objectInputStream.readObject();
        objectInputStream.close();

        //Сериализация с помощью класса ByteArrayOutputStream
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ObjectOutputStream objectOutputStream2 = new ObjectOutputStream(byteArrayOutputStream);
        objectOutputStream2.writeObject(dima);
        objectOutputStream2.writeObject(lena);
        objectOutputStream2.flush();

        //Восстановление с помощью класса ByteArrayInputStream
        ObjectInputStream objectInputStream2 = new ObjectInputStream(
                new ByteArrayInputStream(byteArrayOutputStream.toByteArray()));
        SerializablePerson dimaRestoredFromByte = (SerializablePerson)objectInputStream2.readObject();
        SerializablePerson lenaRestoredFromByte = (SerializablePerson)objectInputStream2.readObject();
        objectInputStream2.close();

        System.out.println("Before serialize: " + "\n" + dima + "\n" + lena );
        System.out.println("After restored from Byte: " + "\n" + dimaRestoredFromByte + "\n" + lenaRestoredFromByte);
        System.out.println("After restored: " + "\n" + dimaRestored + "\n" + lenaRestored);
// при восстановлении объектов, у которых до сериализации была ссылка на один и тот же объект,
// этот объект будет восстановлен только один раз. Это видно по одинаковым ссылкам в объектах после восстановления
    }
}
