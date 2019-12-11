package Inheritence;

public class School {

    String name;
    String address;
    String type;

    public  void   giveHw(){
        System.out.println(this.name+ " giving home work ");
    }

    public  void hostEvent(String  date){
        System.out.println("hosting an events"+ this.name);

    }
}
