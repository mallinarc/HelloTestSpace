package etc;

public class DetectLoopInLinkedListTest{

    public static void main(String[] args) {
        //creating LinkedList with 5 elements including head
       /*  DetectLoopInLinkedList detectLoopInLinkedList = new DetectLoopInLinkedList();
        detectLoopInLinkedList.appendIntoTail(new DetectLoopInLinkedList.Node("101"));
        detectLoopInLinkedList.appendIntoTail(new DetectLoopInLinkedList.Node("201"));
        detectLoopInLinkedList.appendIntoTail(new DetectLoopInLinkedList.Node("301"));
        detectLoopInLinkedList.appendIntoTail(new DetectLoopInLinkedList.Node("401"));

        System.out.println("Linked List : " + detectLoopInLinkedList);

        if(detectLoopInLinkedList.isCyclic()){
            System.out.println("Linked List is cyclic as it contains cycles or loop");
        }else{
            System.out.println("DetectLoopInLinkedList is not cyclic, no loop or cycle found");
        }
 */

        DetectLoopInLinkedList linkedList = new DetectLoopInLinkedList();
        linkedList.appendIntoTail(new DetectLoopInLinkedList.Node("101"));
        DetectLoopInLinkedList.Node cycle = new DetectLoopInLinkedList.Node("201");
        linkedList.appendIntoTail(cycle);
        linkedList.appendIntoTail(new DetectLoopInLinkedList.Node("301"));
        linkedList.appendIntoTail(new DetectLoopInLinkedList.Node("401"));
        linkedList.appendIntoTail(new DetectLoopInLinkedList.Node("501"));
        linkedList.appendIntoTail(cycle);
        
        //don't call toString method in case of cyclic linked list, it will throw OutOfMemoryError
        //System.out.println("Linked List : " + linkedList);

        if(linkedList.isCyclic()){
        System.out.println("Linked List is cyclic as it contains cycles or loop");
        }else{
        System.out.println("LinkedList is not cyclic, no loop or cycle found");
        }  
    }
}