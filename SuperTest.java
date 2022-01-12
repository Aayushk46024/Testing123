class Animal{
    String color = "White";
}
class Dog extends Animal{
    String color = "Black";
    void printColor(){
        System.out.println(color);
        System.out.println(super.color);
    }
}
class Cat extends Dog{
    String color = "Blue";
    void printColor1(){
        System.out.println(color);
        System.out.println(super.color);
    }
}
public class SuperTest {
    public static void main(String[] args){
        Cat d1 = new Cat();
        d1.printColor();
        d1.printColor1();
    }
}
