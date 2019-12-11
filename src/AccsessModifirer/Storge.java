package AccsessModifirer;

public class Storge {
    public static void main(String[] args) {
//        Chair chair = new Chair();
//        chair.model = "home depot";
//        chair.setSize(15);
//
//
//        chair.info();
//        System.out.println(chair.getSize());


        Person person = new Person();
        person.setName("Zeynep");
        System.out.println(person.getName());
        person.setAge(-59);
        System.out.println(person.getAge());
    }
}