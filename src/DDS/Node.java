package DDS;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.jar.Pack200;

/**
 * Created by c-consalpa on 1/24/2017.
 */
public class Node {

    int value;
    Node next;

    Node(int val, Node nxt) {
        this.value = val;
        this.next = nxt;
    }

//      Iterated list
    public static void genInter(int... values) {
        Node tail = null;
        for (int i = 0; i < values.length; i++) {
            tail = new Node(values[i], tail);
        }
    }
//       Recursion List

    public static Node genIntRecurs(int... values) {

        if (values.length == 0) {
            return null;
        } else {
            int[] newArr;
            newArr = Arrays.copyOfRange(values, 1, values.length);
            return new Node(values[0], genIntRecurs(newArr));
        }

    }

    public static String toString(Node n) {
        if (n == null) {
            return null;
        } else {
            return n.value+"->"+toString(n.next);
        }
    }

    public static boolean appendLast(int val, Node n) {
        if (n.next != null) {
            appendLast(val, n.next);
        } else {
            n.next = new Node(val, null);
            return true;
        }

        return false;

    }

    public static Node appendToPos(Node orig, int val, int pos) {
        if (pos>Node.getNodeLength(orig)) {
            try {
                throw new Exception("Insert position is invalid;");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        Node newNode = new Node(val, null);
        Node previousNode = orig;

        if (pos == 0) {
            newNode.next = orig;
            return newNode;
        } else {
            int counter = 0;
            while (counter < pos-1) {
                previousNode = previousNode.next;
                counter++;
            }
            Node nextNode = previousNode.next;
            previousNode.next = newNode;
            newNode.next = nextNode;
            return orig;
        }
    }

    public static int getNodeLength(Node n) {
         int counter = 0;
         while (n != null) {
             n = n.next;
             counter++;
         }
         return counter;
     }

     public static int getNodeLengthRec(Node n) {
         if (n == null) {
             return 0;
         } else {
             return 1+getNodeLengthRec(n.next);
         }
     }

     public static int sum(Node n) {
         return (n == null)? 0 : n.value + sum(n.next);
     }

}
