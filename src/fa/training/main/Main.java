package fa.training.main;

import fa.training.arraylist.PairManagement;

public class Main {
    public static void main(String[] args) {
        PairManagement pairManagement = new PairManagement();
        System.out.println("Before switch: " + pairManagement.getLists());
        pairManagement.switchPair();
        System.out.println("After switch: " + pairManagement.getLists());
    }
}
