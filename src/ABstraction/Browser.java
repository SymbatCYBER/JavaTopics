package ABstraction;

public class Browser {

    String name;
    double  version;
    double size;



    public void launch(){
        System.out.println("browser is launching  ");
    }
    public void brows (String url){
        System.out.println("Brow is browsing "+ url);

    }
    public void addTab (String url){
        System.out.println("Browser is  adding  a tab for UrL"+url);
    }


}
