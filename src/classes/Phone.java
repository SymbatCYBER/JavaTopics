package classes;

public class Phone {
    boolean touchscreen;
    String model;
    int memory;
    String color;
    long phoneNumber;

    public Phone(String model, String color) {
        this.model = model;
        this.color = color;
    }

    public Phone(String model, int memory, String color, boolean touchscreen) {

        this.model = model;
        this.memory = memory;
        this.color = color;
        this.touchscreen = touchscreen;
        if (memory < 0) {
            System.out.println("invalid memory");
        } else {
            this.memory = memory;
            System.out.println("memory value");
        }
    }

    public void info() {
        System.out.println("\nPhone number: " + this.phoneNumber);
        System.out.println("Model: " + model);
        System.out.println("Memory: " + this.memory);
        System.out.println("Color: " + this.color);
        System.out.println("TouchScreen: " + this.touchscreen);


    }

    public boolean text(long phonenumber, String message) {
        String pString = phonenumber + "";
        if (pString.length() == 10 && !message.isEmpty()) {
            System.out.println(message + " is not to " + phonenumber);
            return true;

        } else {
            System.out.println("invalid phone");
         return  false;
        }
    }
    public  void call (long phoneNumber){
        String pString =phoneNumber+"";
        if (pString.length()==10){
            System.out.println("CALLING THIS " +pString);

        }else {
            System.out.println("invalid ");

        }

    }
}

