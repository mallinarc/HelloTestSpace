package app;

/**
 * An abstract class can't be both abstract and final.
 */
public abstract class DefineAbstractClass {


    abstract String abstractMethod(String someStr);

    public void anotherMethod(String anotherStr){
        System.out.println("Inside Non abstract method");
    }
    
}