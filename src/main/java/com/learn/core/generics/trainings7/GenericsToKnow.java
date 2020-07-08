package com.learn.core.generics.trainings7;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

//@SuppressWarnings("unchecked")
public class GenericsToKnow {

        private static final int COPY_THRESHOLD           =   10;
        static List<String> t() {
                List l = new ArrayList<Number>();
                l.add(1);
                List<String> ls = l; // (1)
                ls.add("");
                return ls;
        }
        static void m(List<String>... stringLists) {
                Object[] array = stringLists;
                List<Integer> tmpList = Arrays.asList(42);
                array[0] = tmpList; // (1)
                String s = stringLists[0].get(0); // (2)
        }

        private static <T extends Namable> String capitalizeDogName(T t) {
                return t.getName().toUpperCase();
        }

        public static void main(String[] args) {
//               List<Creature> creators = new ArrayList<>();
//               Creature creature = new Creature();
//               creators.add(creature);
               boolean b = false;
               if (b) {
                       List<HammerSkark> creators = new ArrayList<>();
                       HammerSkark creator = new HammerSkark();
                       creator.setName("HammerShark");
                       creators.add(creator);
                       System.out.println(feedCreator(creators));

               } else {
                       //                Shark creator = new Shark();
                       List<Shark> creators = new ArrayList<>();
                       Shark creator = new Shark();
                       creator.setName("Shark");
                       creators.add(creator);
                       System.out.println(feedCreator(creators));
               }

        }


        private static String feedCreator(List<? extends Shark> creators) {
//                creators.add(new Shark());
//                return "dfdf";
                return creators.get(0).getName();
        }


        public static <T> void copy(List<? super T> dest, List<? extends T> src) {
                int srcSize = src.size();
                if (srcSize > dest.size())
                        throw new IndexOutOfBoundsException("Source does not fit in dest");

                if (srcSize < COPY_THRESHOLD ||
                        (src instanceof RandomAccess && dest instanceof RandomAccess)) {
                        for (int i=0; i<srcSize; i++)
                                dest.set(i, src.get(i));
                } else {
                        ListIterator<? super T> di=dest.listIterator();
                        ListIterator<? extends T> si=src.listIterator();
                        for (int i=0; i<srcSize; i++) {
                                di.next();
                                di.set(si.next());
                        }
                }
        }

        @NotNull private static Account createAccount(String name, int sum) {
                return new Account(name, sum);
        }
}

class Account {
        private String name;
        private int amount;

        public Account(String name, int amount) {
                this.name = name;
                this.amount = amount;
        }

        public String getName() {
                return name;
        }

        public void setName(String name) {
                this.name = name;
        }

        public int getAmount() {
                return amount;
        }

        public void setAmount(int amount) {
                this.amount = amount;
        }
}

class AccountsCalculator {
        public long getSum(List accounts) {
                long sum = 0;

                for (int i = 0, n = accounts.size(); i < n; i++) {
                        Object account = accounts.get(i);
                        if (account instanceof Account) {
                                sum += ((Account) account).getAmount();
                        }
                }

                return sum;
        }

        public long getSum2(List<Account> accounts) {
                long sum = 0;

                for (Account account : accounts) {
                        sum += account.getAmount();
                }

                return sum;
        }

        public static <T> T getFirst(List<? extends T> list) {
                return list.get(0); // compile-time error
        }

        public static <T extends Comparable<T>> T max(Collection<T> coll) {
                T candidate = coll.iterator().next();
                for (T elt : coll) {
                        if (candidate.compareTo(elt) < 0) candidate = elt;
                }
                return candidate;
        }
}

class Animal implements Namable, Comparable<Animal>{
        private String name;

        private List<Human> humans = new ArrayList<>();

        public void addHuman(Human human) {
                humans.add(human);
        }

        public void addHumans(List<? super Human> humansParam) {
//                human.get(0);
//                humans.add(new ChildHuman());
                humansParam.add(new Human());
        }

        public void addChilds(List<? super Human> childs) {
//                human.get(0);
//                humans.add(new ChildHuman());
//                childs.add(new Human());
        }

        public Human getFirstHuman() {
                if (!humans.isEmpty()) {
                        return humans.get(0);
                }
                return null;
        }


        @Override
        public String getName() {
                return name;
        }

        public void setName(String name) {
                this.name = name;
        }

        @Override public int compareTo(@NotNull Animal animal) {
                return name.compareTo(animal.getName());
        }
}

interface Namable {
        String getName();
}

class Human implements Namable{
        private String name;

        @Override
        public String getName() {
                return name;
        }

        public void setName(String name) {
                this.name = name;
        }
}

class ChildHuman extends Human{
        private String someThing;

        public String getSomeThing() {
                return someThing;
        }

        public void setSomeThing(String someThing) {
                this.someThing = someThing;
        }
}

class ChildHuman2 extends Human{
        private String someThing2;

        public String getSomeThing2() {
                return someThing2;
        }

        public void setSomeThing2(String someThing) {
                this.someThing2 = someThing;
        }
}

class Cat extends Animal {
        private int age;

        public int getAge() {
                return age;
        }

        public void setAge(int age) {
                this.age = age;
        }
}

class Dog extends Animal {
        private int weight;

        public int getWeight() {
                return weight;
        }

        public void setWeight(int weight) {
                this.weight = weight;
        }
}

//class MyException<T> extends Exception {
//        T t;
//}


class Creature{
        private String name;

        public String getName() {
                return name;
        }

        public void setName(String name) {
                this.name = name;
        }

        @Override public String toString() {
                return this.toString();
        }
}// X
class Animal3 extends Creature{}// Y
class Fish extends Animal3{}// Z
class Shark extends Fish{}// A
class HammerSkark extends Shark{}// B
class DeadHammerShark extends HammerSkark{}// C