package app;

public class Main {

   
    public static void main(String[] args) {
        Pojo1 pj1 = new Pojo1();
        pj1.setSt1("abc");
        pj1.setSt2("DEF");
    
        Pojo1 pj2 = new Pojo1();
         pj2.setSt1("STU");
        pj2.setSt2("XYZ");
    
        Pojo1[] pojoObjList = new Pojo1[3];
        pojoObjList[0] = pj1;
        pojoObjList[1] = pj2;
        pojoObjList[2] = pj2;
        System.out.println(pojoObjList.length);
    }
   
    
}
