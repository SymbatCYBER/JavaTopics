package Inheritence;

public class PetSmart {
    public static void main(String[] args) {
        Huskey huskey  = new Huskey();
        huskey.name = " Rex";
        huskey.age = 3;
        huskey.bark();
        System.out.println(huskey.name);
        huskey.furType="Special";
        huskey.liveInCold();
    }
}
