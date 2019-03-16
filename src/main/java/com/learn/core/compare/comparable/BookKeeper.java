package com.learn.core.compare.comparable;

/**
 * Created by IntelliJ IDEA.
 * User: bilyk
 * Date: 07.05.12
 * Time: 16:49
 * To change this template use File | Settings | File Templates.
 */
public class BookKeeper implements Comparable {
    int age;
    String name;

    public BookKeeper(int i, String alex) {
        this.age = i;
        this.name = alex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int compareTo(Object o) {
//        if(!(o instanceof BookKeeper)){
//             throw new ClassCastException();
//        }

        int secondAge = ((BookKeeper) o).getAge();
        String secondName = ((BookKeeper) o).getName();

//        if(secondAge == this.age){
            if (secondAge > this.getAge()) {
                return -1;
            } else {
                return 1;
            }
//        }else{
//            return this.age - secondAge;
//        }
    }
}
