package com.learn;

//import org.apache.openjpa.jdbc.kernel.exps.MapEntry;

import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collectors;

/**
 * Created by dmitry on 10.02.18.
 */
public class Main {
    private static final ConcurrentHashMap<String, Set<LeaderboardGroup>> leaderboardGroupsByName = new ConcurrentHashMap<>();

    public static void main(String[] args) {
//        String sourceText = "В одному казковому місті жили коротульки. " +
//                "Коротульками їх називали тому, що вони були зовсім-зовсім" +
//                "крихітні, кожен коротулька був на зріст як невеличкий огірок." +
//                "В їхньому місті було дуже красиво. Навколо кожного будиночка росли квіти:" +
//                "маргаритки, ромашки, кульбаби. Там навідь вулиці мали назви квіток:" +
//                "вулиця дзвіночків, алея ромашок, бульвар волошок. А саме місто звалось" +
//                "Квітковим Містом. Воно стояло на березі струмка. Цей струмок коротульки" +
//                "називали огірковою річкою, тому що по берегах струмка росло багато огірків. Коротульки" +
//                "робили з березової кори човники, перепливали річку й ходили в ліс по " +
//                "ягоди, по гриби, по горіхи.";
//
//        String alphabet = "AБВГДЕЄЖЗИІЇЙКЛМНОПРСТУФХЦЧШЩЬЮЯ";
////        String alphabetSmall = "aбвгдеєжзиіїйклмнопрстуфхцчшщьюя";
//
//        for (char c : sourceText.toCharArray()) {
//            System.out.println(c + " - " + StringUtils.countMatches(sourceText, String.valueOf(c)) +
//                    StringUtils.countMatches(sourceText, String.valueOf(c).toLowerCase()));
//        }
//        print(8);
//        System.out.println(System.currentTimeMillis()/1000);
//        Instant instant = Instant.ofEpochMilli(System.currentTimeMillis());
//
//        long l = Instant.now().compareTo(instant);
        LeaderboardGroup leaderboardGroup = new LeaderboardGroup();
        leaderboardGroup.setId(1);
        leaderboardGroup.setName("lg1");
        LeaderboardGroup leaderboardGroup2 = new LeaderboardGroup();
        leaderboardGroup2.setId(2);
        leaderboardGroup2.setName("lg2");

        leaderboardGroupsByName.put(leaderboardGroup.getName(), Collections.singleton(leaderboardGroup2));

        for (Set<LeaderboardGroup> leaSetCollection : leaderboardGroupsByName.values()) {
            for (LeaderboardGroup group : leaSetCollection) {

            }
        }
//        leaderboardGroupsByName.values().forEach(leaderboardGroupsSet -> leaderboardGroupsSet.stream().findFirst().ifPresent(leaderboardGroup1 -> ));

//        Map<String, LeaderboardGroup> map = leaderboardGroupsByName.values().stream()
//                .map(leaderboardGroups -> leaderboardGroups.iterator().next())
//                .collect(Collectors.toMap(LeaderboardGroup::getName, leaderboardGroup1 -> leaderboardGroup1));
        Map<String, LeaderboardGroup> map2 = leaderboardGroupsByName.entrySet().stream()
                .collect(Collectors.toMap(Map.Entry::getKey, stringSetEntry -> stringSetEntry.getValue().iterator().next()));
        Map<String, Set<LeaderboardGroup>> map = map2.entrySet().stream().collect(Collectors.toMap(Map.Entry::getKey, stringLeaderboardGroupEntry -> Collections.singleton(stringLeaderboardGroupEntry.getValue())));
//        Map<String, LeaderboardGroup> map = leaderboardGroupsByName.values().stream().map(leaderboardGroups -> leaderboardGroups.stream().findFirst().get()).map(LeaderboardGroup::getName)

        LeaderboardGroup leaderboardGroup1 = leaderboardGroupsByName.get("lg1").stream().findFirst().orElse(null);
    }

    static void print(int i, String ... values) {
        String[] ar = values;
        for (String value : values) {
            System.out.println(value);
        }
    }
}

class User {
    private String name;

}

class Employee extends User {
    private String company;

    public Employee(String company) {
        super();
        this.company = company;
    }
}


class LeaderboardGroup {
    private int id;
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
