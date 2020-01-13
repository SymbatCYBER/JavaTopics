package ExceptionsPAC;

public class IgnoreEXsectionEx {


    public static void main(String[] args) throws InterruptedException {
        Thread.sleep(1000);
        System.out.println(5);
        Dog dog = new Dog();
        try {
            dog.setAge(4);

        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(dog.age);
    }
}
