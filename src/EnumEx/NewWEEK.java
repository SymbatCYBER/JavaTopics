package EnumEx;

import jdk.swing.interop.SwingInterOpUtils;

public class NewWEEK {
    public static void main(String[] args) {
        some(UsingEnum.MONDAY);

    }

    public static void some(UsingEnum week) {

        switch (week) {
            case MONDAY:
                System.out.println(" Modays are bad");
                break;
            case TUESDAY:
            case FRIDAY:
                System.out.println(" Fridays are GREAT");
                break;


            case WEEKDAY:
                System.out.println(" weekend are great ");
                break;
            default:
                System.out.println(" regular day are okay");

        }
    }

}

