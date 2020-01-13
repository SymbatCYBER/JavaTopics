package ABstraction;

public class TestingClass {
    public static void main(String[] args) {
        Chrome chrome = new Chrome();
        chrome.version=65.7;
        chrome.launch();
       chrome.brows(" www.stackoverflow.com");
       chrome.addTab("okta.cybertekschool.com");
        System.out.println();
       FireFax fireFax= new FireFax();
       fireFax.name=" Symbat";
       fireFax.launch();
       fireFax.brows("www.stackoverflow.com");
    }
}
