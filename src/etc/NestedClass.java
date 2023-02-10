package etc;

import java.util.Hashtable;

class NestedClass{

    private static String str = "Static member String";

    static class NestedStaticClassExample{
        public void display(){
            System.out.println(str);
        }
    }

    public class NestedClassExample{
        Hashtable<String, Integer> hstbl = new Hashtable<String, Integer>();
        

        public void display(){
            hstbl.put("one", new Integer(1));
            hstbl.put("two", new Integer(2));
            
            System.out.println("Inside Non Static nested class.");
        }
    }

    public static void main(String[] args) {
        NestedStaticClassExample nstStaticClass = new NestedStaticClassExample();
        nstStaticClass.display();

        NestedClass nstdClass = new NestedClass();
        NestedClassExample nstdClassExm = nstdClass.new NestedClassExample();
        nstdClassExm.display();
    }
}