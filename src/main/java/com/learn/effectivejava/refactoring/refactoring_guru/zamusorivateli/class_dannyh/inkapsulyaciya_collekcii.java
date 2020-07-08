package com.learn.effectivejava.refactoring.refactoring_guru.zamusorivateli.class_dannyh;

/**
 * Created by Dimon on 13.05.2016.
 */
public class inkapsulyaciya_collekcii {
//    class Course {
//        public Course(String name, boolean isAdvanced) {
//            // ...
//        }
//        public boolean isAdvanced() {
//            // ...
//        }
//    }
//
//    class Person {
//        private Set courses;
//
//        public Set getCourses() {
//            return courses;
//        }
//        public void setCourses(Set arg) {
//            courses = arg;
//        }
//    }
//
//    // Client code
//    Person kent = new Person();
//    Set s = new HashSet();
//    s.add(new Course("Smalltalk Programming", false));
//    s.add(new Course("Appreciating Single Malts", true));
//    kent.setCourses(s);
//    Assert.equals(2, kent.getCourses().size());
//    Course refact = new Course("Refactoring", true);
//    kent.getCourses().add(refact);
//    kent.getCourses().add(new Course("Brutal Sarcasm", false));
//    Assert.equals(4, kent.getCourses().size());
//    kent.getCourses().remove(refact);
//    Assert.equals(3, kent.getCourses().size());
//
//    Iterator iter = kent.getCourses().iterator();
//    int count = 0;
//    while (iter.hasNext()) {
//        Course each = (Course) iter.next();
//        if (each.isAdvanced()) {
//            count++;
//        }
//    }
//    System.out.print("Advanced courses: " + count);
//
//    TO
//
//    class Course {
//        public Course(String name, boolean isAdvanced) {
//            // ...
//        }
//        public boolean isAdvanced() {
//            // ...
//        }
//    }
//
//    class Person {
//        private Set courses = new HashSet();
//
//        public Set getCourses() {
//            return Collections.unmodifiableSet(courses);
//        }
//        public void initializeCourses(Set arg) {
//            Assert.isTrue(courses.isEmpty());
//            courses.addAll(arg);
//        }
//        public void addCourse(Course arg) {
//            courses.add(arg);
//        }
//        public void removeCourse(Course arg) {
//            courses.remove(arg);
//        }
//        public int numberOfAdvancedCourses() {
//            Iterator iter = getCourses().iterator();
//            int count = 0;
//            while (iter.hasNext()) {
//                Course each = (Course) iter.next();
//                if (each.isAdvanced()) {
//                    count++;
//                }
//            }
//            return count;
//        }
//        public int numberOfCourses() {
//            return courses.size();
//        }
//    }
//
//    // Client code
//    Person kent = new Person();
//    kent.addCourse(new Course("Smalltalk Programming", false));
//    kent.addCourse(new Course("Appreciating Single Malts", true));
//    Assert.equals(2, kent.numberOfCourses());
//    Course refact = new Course("Refactoring", true);
//    kent.addCourse(refact);
//    kent.addCourse(new Course("Brutal Sarcasm", false));
//    Assert.equals(4, kent.numberOfCourses());
//    kent.removeCourse(refact);
//    Assert.equals(3, kent.numberOfCourses());
//
//    System.out.print("Advanced courses: " + kent.numberOfAdvancedCourses());
}
