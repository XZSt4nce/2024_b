package com.wavesenterprise.contract.domain;

import java.util.Date;

public class MoneyTransfer {
    private String sender;
    private String recipient;
    private long amount;
    private short lifeUntil;
    private boolean isAccepted = false;
    private boolean isDenied = false;

    public MoneyTransfer() {}

    public MoneyTransfer(String sender, String recipient, long amount, short lifeDays) {
        this.sender = sender;
        this.recipient = recipient;
        this.amount = amount;
        this.lifeUntil = (short) (new Date().getTime() / 86400000 + lifeDays);
    }

    public void accept() throws RuntimeException {
        if (isDenied || new Date().getTime() / 86400000 < lifeUntil) {
            throw new RuntimeException();
        }
        isAccepted = true;
    }

    public void deny() throws RuntimeException {
        if (isAccepted || new Date().getTime() / 86400000 < lifeUntil) {
            throw new RuntimeException();
        }
        isDenied = true;
    }

    public void returnMoney() throws RuntimeException {
        if (isAccepted || isDenied) {
            throw new RuntimeException();
        }
        lifeUntil = (short) (new Date().getTime() / 86400000);
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getRecipient() {
        return recipient;
    }

    public void setRecipient(String recipient) {
        this.recipient = recipient;
    }

    public long getAmount() {
        return amount;
    }

    public void setAmount(long amount) {
        this.amount = amount;
    }

    public short getLifeUntil() {
        return lifeUntil;
    }

    public void setLifeUntil(short lifeUntil) {
        this.lifeUntil = lifeUntil;
    }

    public boolean isAccepted() {
        return isAccepted;
    }

    public void setAccepted(boolean accepted) {
        isAccepted = accepted;
    }

    public boolean isDenied() {
        return isDenied;
    }

    public void setDenied(boolean denied) {
        isDenied = denied;
    }
}
