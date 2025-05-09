package BinaryTree;
import BinaryTree.BT;

import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BT tree = new BT();
        tree.insert(sc);
        tree.display();
    }
}
