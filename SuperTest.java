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
public class SuperTest {
    public static void main(String[] args){
        Dog d1 = new Dog();
        d1.printColor();
    }
}
