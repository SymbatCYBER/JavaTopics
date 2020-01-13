package AbS;
public class TownHose extends Home {
    @Override
    public String toString() {
        return super.toString();
    }
    @Override
    public void unlock() {
        System.out.println("Unlocking");
    }
    @Override
    public void TrowParty() {
        System.out.println("Throwing a party");
    }
    @Override
    public void lock() {
        System.out.println("Locking");
    }
    @Override
    public void cook() {
        System.out.println("Cooking");
    }
    public void shareWithNeighbor(){
        System.out.println("Sharing is Love");
    }
}




