package etc;

import java.util.LinkedList;

public class LinkedList1{
    Node head;
    static class Node{
        int data;
        Node next;
        Node(int d){
            data = d;
            next = null;
        }
    }

    public static LinkedList1 insert(LinkedList1 list, int data){
        // create new node with given data
        Node newNode = new Node(data);
        newNode.next = null;

        // if linked list is empty,
        // then make the new node as head
        if(list.head == null){
            list.head = newNode;
        }else{
            // traverse till the end and insert new node there
            Node last = list.head;
            while(last.next != null){
                last = last.next;
            }
            last.next = newNode;
        }
        return list;
    }

    /**
     * Delete node by key from Linked list
     * @param list
     * @param key
     */
    public static void deleteByKey(LinkedList1 list, int key){
        Node currentNode = list.head, prev = null;

        // if head node itself is the key 
        if(currentNode != null && currentNode.data == key){
           list.head = currentNode.next;
           return;
        }
        // if current node value is not key
        //this will travese through the list utill the end of list or found key;
        while(currentNode != null && currentNode.data != key){
            prev = currentNode;
            currentNode = currentNode.next;
        }
        if(currentNode == null){
            return ;
        }
        prev.next = currentNode.next;
    }

    /**
     * Method to print linked list
     */
    public static void printList(LinkedList1 list){
        Node currentNode = list.head;
        while(currentNode != null){
            System.out.print(currentNode.data +"-->");
            currentNode = currentNode.next;
            if(currentNode == null){
                System.out.print("null");
            }
        }
    } 

    // Driver code 
    public static void main(String[] args) 
    { 
        /* Start with the empty list. */
        LinkedList1 list = new LinkedList1(); 
  
        // 
        // ******INSERTION****** 
        // 
  
        // Insert the values 
        list = insert(list, 1); 
        list = insert(list, 2); 
        list = insert(list, 3); 
        list = insert(list, 4); 
        list = insert(list, 5); 
        list = insert(list, 6); 
        list = insert(list, 7); 
        list = insert(list, 8); 
  
        // Print the LinkedList 
        printList(list);
        System.out.println("");
        deleteByKey(list, 7);
        printList(list);
    } 
    
}