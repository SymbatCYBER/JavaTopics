package classes;

public class PhoneTest {

        public static void main (String[]args){
            Phone phone = new Phone("IPhone X", "Gold");
            phone.info();
            phone.memory = 45;
            phone.info();
            Phone samsung = new Phone("model", -33, " color",  true );
            samsung.info();
            System.out.println("----------");
            boolean result=samsung.text (12233344L, "hello");
            System.out.println(result);
            phone.call(123345678L);
        }
    }
