package ExceptionsPAC;

public class Dog {
    int age;
    public void setAge(int age) throws Exception{
        if(age < 0 || age > 30) {
            throw new Exception(age + " is an invalid age");
        }
        this.age = age;
    }
    public void bark() {
       // System.out.println("Finally.Dog is barking");
        if( this.age> 20 ){
        throw new Dog;
        }
    }





}
