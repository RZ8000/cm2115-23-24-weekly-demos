package uk.ac.rgu.topic5;

public class GenericsClass<T>{

    String myString;

    T myType;


    public void printType() {
        System.out.println(myType.getClass().getSimpleName());
    }
    
}
