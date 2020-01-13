package AbS;

public  abstract  class Browser {
    String nAme;
    double size;
    double version;
    public abstract  void launch ();

    public abstract  void browse( String url);
     public  abstract int getNumOfTabs();





}
