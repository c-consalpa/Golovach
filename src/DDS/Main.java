package DDS;

/**
 * Created by c-consalpa on 2/10/2017.
 */
public class Main {
    public static void main(String[] args) {
        Node n1 = Node.genIntRecurs(1,2,3,4,5);
        System.out.println(Node.toString(n1));
        System.out.println("Node length: "+Node.getNodeLength(n1));

//        Node appended;
//        appended = Node.appendToPos(n1, 500, 0);
//        appended = Node.appendToPos(appended, 5020, 0);
//        appended = Node.appendToPos(appended, 5020, 4);
//        System.out.println(Node.toString(appended));
        System.out.println(Node.toString(n1));
        System.out.println(Node.getNodeLengthRec(n1));
        //Node.appendLast(999, n1);
        System.out.println(Node.getNodeLengthRec(n1));

        System.out.println(Node.sum(n1));
        System.out.println(Math.max(0, 30));

    }
}
