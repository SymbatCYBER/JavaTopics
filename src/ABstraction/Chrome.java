package ABstraction;

public class Chrome extends Browser {

@Override
    public void launch (){
    System.out.println("Chrome is launching ");

}
@Override
    public void brows ( String  url ){
    System.out.println("Brow is browsing "+ url);

}
@Override
public void addTab (String url){
    System.out.println("Browser is  adding  a tab for UrL "+url);
}

}
