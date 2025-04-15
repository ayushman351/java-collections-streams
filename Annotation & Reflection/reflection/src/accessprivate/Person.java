package accessprivate;

public class Person {
    private final String name;
    private final int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public static void main(String[] args) {
        Person p1=new Person("Sanjay" , 22);
        AccessPrivateField.modifyPrivate(p1,21);

        System.out.println(p1);
    }
}
