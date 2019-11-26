package wrapperClass;

public class NumberChecks {
    public static void main(String[] args) {
        MagicNumber magicNumber= new MagicNumber();
        magicNumber.generateNumbers(8);
        System.out.println(magicNumber.numbers);
        magicNumber.generateEvens(8);
        System.out.println(magicNumber.numbers);

    }
}
