package AbS;

public  abstract  class Home {
    int numberOfRooms;
    String address;
    int  maxNumberOfGuests;


    public abstract void TrowParty();  // abstract methods



    public abstract void lock();


    public abstract void unlock();



    public abstract void cook ();

@Override
    public String toString(){
    String result = "Address: "+ this.address+ "\n Number of guests" +numberOfRooms +"\n Maximum of the numbers ";
    return result;
}


}
