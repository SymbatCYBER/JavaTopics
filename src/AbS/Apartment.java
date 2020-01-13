package AbS;

public class Apartment extends Home {
    @Override
    public void cook(){
        System.out.println("Cooking ");
    }

    @Override
    public void lock(){
        System.out.println("locking my apartment ");
    }


    @Override
    public void TrowParty(){
        System.out.println("throw a party");
    }

    @Override
    public void unlock() {
        System.out.println("Unlocking ");
    }
}
