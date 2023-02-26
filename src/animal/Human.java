package animal;

class Human  extends Animal implements Thinkable{
    String hobby ;

    protected Human (String name,int age,String hobby) {

        super (name,age);
        this.hobby = hobby;
    }

    @Override
    public void think() {
        System.out.println("私は"+this.hobby+"について考えています。");

    }



}