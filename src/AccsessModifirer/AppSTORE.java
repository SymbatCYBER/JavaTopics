package AccsessModifirer;

public class AppSTORE {
    public static void main(String[] args) {


        App whatsApp = new App( " APPLE"," WEB side ",  2.4);
       whatsApp.info();
       whatsApp.update();
       whatsApp.setSize(2.5);
        whatsApp.info();
        whatsApp.setReview("Coolest app");
    }
}