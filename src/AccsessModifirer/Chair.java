package AccsessModifirer;

public class Chair {
    private int size;
    public String model;

    public void setSize(int size ){
        if(size>0)
        this.size=size;
    }
    public int getSize() {
        if (this.model.equals("ikea")) {
            return size;

        } else {
            System.out.println("is not ikea");
        }
        return -1;
    }

    public void info(){
        System.out.println("model"+ this.model);
        System.out.println("size "+ this.size);
    }
}
