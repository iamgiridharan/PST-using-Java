package Week2;

import java.util.*;
class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
public class Task4 {

    public static boolean isOlderThan(Person p, int ageLimit) {
        return p.getAge() > ageLimit;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Person> persons = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String name = sc.next();
            int age = sc.nextInt();
            persons.add(new Person(name, age));
        }

        int ageLimit = sc.nextInt();
        List<Person> sorted = new ArrayList<>(persons);
        sorted.sort(Comparator.comparing(Person::getName));

        for (Person p : sorted) {
            System.out.print(p.getName() + " ");
        }
        System.out.println();

        persons.stream()
               .filter(p -> isOlderThan(p, ageLimit)) 
               .map(Person::getName)
               .forEach(name -> System.out.print(name + " "));
        System.out.println();
        persons.stream()
               .map(Person::getName)
               .map(String::toUpperCase)
               .forEach(name -> System.out.print(name + " "));
        sc.close();       
    }   
}
