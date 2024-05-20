package com.wavesenterprise.contract.domain;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Postage {
    private String employeeName;
    private String employeePostOfficeId;
    private String trackNumber;
    private String sender;
    private String recipient;
    private PostageType type;
    private byte sendingClass = 3;
    private byte deliveryLimit;
    private long cost;
    private short weight;
    private long declaredCost;
    private long totalCost;
    private Address departureAddress;
    private Address destinationAddress;


    public Postage() {}

    public Postage(String employeeName, String employeePostOfficeId, int shipment, String sender, String recipient, PostageType type, byte sendingClass, short weight, long declaredCost, Address departureAddress, Address destinationAddress) {
        this.employeeName = employeeName;
        this.employeePostOfficeId = employeePostOfficeId;
        this.trackNumber = String.format("RR%s%d%d%d",
                DateTimeFormatter.ofPattern("ddMMyyyy").format(LocalDateTime.now()),
                shipment,
                departureAddress.getPostalCode(),
                destinationAddress.getPostalCode()
        );
        this.sender = sender;
        this.recipient = recipient;
        this.type = type;
        this.sendingClass = sendingClass;
        this.weight = weight;
        this.declaredCost = declaredCost;
        this.departureAddress = departureAddress;
        this.destinationAddress = destinationAddress;

        this.deliveryLimit = (byte) (5 * sendingClass);
        this.cost = (7 - 2 * sendingClass) * 10^7;
        this.totalCost = this.cost * weight + declaredCost / 10;
    }

    public String getTrackNumber() {
        return trackNumber;
    }

    public void setTrackNumber(String trackNumber) {
        this.trackNumber = trackNumber;
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

    public PostageType getType() {
        return type;
    }

    public void setType(PostageType type) {
        this.type = type;
    }

    public byte getSendingClass() {
        return sendingClass;
    }

    public void setSendingClass(byte sendingClass) {
        this.sendingClass = sendingClass;
    }

    public byte getDeliveryLimit() {
        return deliveryLimit;
    }

    public void setDeliveryLimit(byte deliveryLimit) {
        this.deliveryLimit = deliveryLimit;
    }

    public long getCost() {
        return cost;
    }

    public void setCost(long cost) {
        this.cost = cost;
    }

    public short getWeight() {
        return weight;
    }

    public void setWeight(short weight) {
        this.weight = weight;
    }

    public long getDeclaredCost() {
        return declaredCost;
    }

    public void setDeclaredCost(long declaredCost) {
        this.declaredCost = declaredCost;
    }

    public long getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(long totalCost) {
        this.totalCost = totalCost;
    }

    public Address getDepartureAddress() {
        return departureAddress;
    }

    public void setDepartureAddress(Address departureAddress) {
        this.departureAddress = departureAddress;
    }

    public Address getDestinationAddress() {
        return destinationAddress;
    }

    public void setDestinationAddress(Address destinationAddress) {
        this.destinationAddress = destinationAddress;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getEmployeePostOfficeId() {
        return employeePostOfficeId;
    }

    public void setEmployeePostOfficeId(String employeePostOfficeId) {
        this.employeePostOfficeId = employeePostOfficeId;
    }
}
