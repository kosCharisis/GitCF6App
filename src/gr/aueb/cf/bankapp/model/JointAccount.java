package gr.aueb.cf.bankapp.model;

import gr.aueb.cf.ch13.model.Account;

public class JointAccount {
    private int id1;
    private String iban;
    private String firstname1;
    private String lastname1;
    private String ssn1;
    private double balance;
    private int id2;
    private String firstname2;
    private String lastname2;
    private String ssn2;

    public JointAccount() {

    }

    public JointAccount(int id1, String iban, String firstname1, String lastname1,
                        String ssn1, double balance, int id2, String firstname2,
                        String lastname2, String ssn2) {
        this.id1 = id1;
        this.iban = iban;
        this.firstname1 = firstname1;
        this.lastname1 = lastname1;
        this.ssn1 = ssn1;
        this.balance = balance;
        this.id2 = id2;
        this.firstname2 = firstname2;
        this.lastname2 = lastname2;
        this.ssn2 = ssn2;
    }

    public int getId1() {
        return id1;
    }
    public void setId1(int id1) {
        this.id1 = id1;
    }
    public String getIban() {
        return iban;
    }
    public void setIban(String iban) {
        this.iban = iban;
    }
    public String getFirstname1() {
        return firstname1;
    }
    public void setFirstname1(String firstname1) {
        this.firstname1 = firstname1;
    }
    public String getLastname1() {
        return lastname1;
    }
    public void setLastname1(String lastname1) {
        this.lastname1 = lastname1;
    }
    public String getSsn1() {
        return ssn1;
    }
    public void setSsn1(String ssn1) {
        this.ssn1 = ssn1;
    }
    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    public int getId2() {
        return id2;
    }
    public void setId2(int id2) {
        this.id2 = id2;
    }
    public String getFirstname2() {
        return firstname2;
    }
    public void setFirstname2(String firstname2) {
        this.firstname2 = firstname2;
    }
    public String getLastname2() {
        return lastname2;
    }
    public void setLastname2(String lastname2) {
        this.lastname2 = lastname2;
    }
    public String getSsn2() {
        return ssn2;
    }
    public void setSsn2(String ssn2) {
        this.ssn2 = ssn2;
    }

    //Public API

    /**
     * Returns the {@link JointAccount} state in {@link String} format.
     *
     * @return
     *      the String-representation of the state of the {@link OverDraftAccount}.
     */
    public String accountToString() {
        return "(" + id1 + ", " + iban + ", " + firstname1 + ", " + lastname1
                + ", " + ssn1 + ", " + balance + " Joint client: " + id2 + ", "
                + firstname2 + ", " + lastname2 + ", " + ssn2 + ")";
    }

}
