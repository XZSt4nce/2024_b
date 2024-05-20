package com.wavesenterprise.contract.domain;

public class User {
    private String fullName;
    private Address homeAddress;
    private long balance = 50 * 10^8;
    private UserRole role;
    private String postOfficeId;

    public User() {}

    public User(String name, Address homeAddress, UserRole role, long postalCode) {
        this.fullName = name;
        this.homeAddress = homeAddress;
        this.role = role;

        if (postalCode != 0) {
            this.postOfficeId = String.format("RR%d", postalCode);
        }
    }

    public void decreaseBalance(long amount) throws ArithmeticException {
        if (balance < amount) {
            throw new ArithmeticException();
        }
        balance -= amount;
    }

    public void increaseBalance(long amount) {
        balance += amount;
    }

    public void changePostOfficeId(long postalCode) {
        if (postalCode == 0) {
            this.postOfficeId = null;
            this.role = UserRole.USER;
        } else {
            this.postOfficeId = String.format("RR%d", postalCode);
            this.role = UserRole.EMPLOYEE;
        }
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String name) {
        this.fullName = name;
    }

    public Address getHomeAddress() {
        return homeAddress;
    }

    public void setHomeAddress(Address homeAddress) {
        this.homeAddress = homeAddress;
    }

    public long getBalance() {
        return balance;
    }

    public void setBalance(long balance) {
        this.balance = balance;
    }

    public UserRole getRole() {
        return role;
    }

    public void setRole(UserRole role) {
        this.role = role;
    }

    public String getPostOfficeId() {
        return postOfficeId;
    }

    public void setPostOfficeId(String postOfficeId) {
        this.postOfficeId = postOfficeId;
    }
}
