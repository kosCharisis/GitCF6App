package gr.aueb.cf.bankapp;

import gr.aueb.cf.bankapp.model.JointAccount;
import gr.aueb.cf.bankapp.model.OverDraftAccount;

public class Main {

    public static void main(String[] args) {
        OverDraftAccount alice = new OverDraftAccount(1, "GR123", "Alice", "W.", "12345", 100.0);

        try {
            alice.overdraw(101, "12345");

            System.out.println(alice.getAccountBalance());
            System.out.println("Alice Account State");
            System.out.println(alice.accountToString());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        JointAccount aliceBob = new JointAccount(1, "GR123", "Alice", "W.",
                "12345", 1000.0, 2, "Bob", "D.", "67890");

        System.out.println();
        System.out.println(aliceBob.accountToString());
    }
}
