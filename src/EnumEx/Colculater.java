package EnumEx;

import IifElseStatements.Operators;

public class Colculater {
    public static void main(String[] args) {

        System.out.println(col(CheckColculater.MODUL, 2, 0));



    }






    public  static  double col(CheckColculater op, double num, double num2 ){
        switch (op){
            case PLUS:
                return num+num2;
            case MODUL:
                return num%num2;
            case MUTIPLY:
                return num*num2;
            case MINUS:
                return num-num2;
            case DEVID:
                if(num2==0){
                    System.out.println(" You can not divide by 0");
                    return 0;
                }
                return num%num2;
        }
        return 0;
    }
}

