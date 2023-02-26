package animal;

public class Animal  {

    String name;
    int age;

    protected Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void say() {
        System.out.println(this.name + "です。" + this.age + "です。");

    }

    public Animal() {
    }

}
