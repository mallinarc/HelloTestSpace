package etc;

public class DistributeCoinsInBst{

    static class Node{
        int key;
        Node left, right;
    }

    static int ans = 0;

    static Node newNode(int key){
        Node newNode = new Node();
        newNode.key = key;
        newNode.left = null;
        newNode.right = null;
        return newNode;
    }

    // Function to find the number of moves to  
    // distribute all of the candies  
    static int distributeCandy(Node root)  
    {  
        distributeCandyUtil(root);  
        return ans;  
    } 

    // Utility function to find the number of  
    // moves to distribute all of the candies  
    static int distributeCandyUtil(Node root)  
    {  
        // Base Case  
        if (root == null)  
            return 0;  
    
        // Traverse left subtree  
        int l = distributeCandyUtil(root.left);  
    
        // Traverse right subtree  
        int r = distributeCandyUtil(root.right); 

        System.out.println("l :"+l+":r:"+r);
    
        // Update number of moves  
        ans += Math.abs(l) + Math.abs(r);  
        System.out.println("ans:"+ans);
        // Return number of moves to balance  
        // current node 
        int distribute = root.key + l + r - 1;
        System.out.println("......distribute:"+distribute);
        return distribute;  
    }

    public static void main(String[] args) {
      /* 3  
        / \  
        0 0  
                
        Let us create Binary Tree  
        shown in above example */
        System.out.println("abs of =1:"+Math.abs(-1));
        Node root = newNode(0);  
        root.left = newNode(0);  
        root.right = newNode(0); 
        
        Node levlOne = newNode(0);
        levlOne.left = newNode(0);
        levlOne.right = newNode(6);
        root.left.left = levlOne;
    
        System.out.println(distributeCandy(root));  
    }
}