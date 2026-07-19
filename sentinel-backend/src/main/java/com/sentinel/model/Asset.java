package com.sentinel.model;

public class Asset {
    private Long id;
    private String name;
    private String type;
    private AssetStatus status;
    private String serialNumber;
    private String assignedOwner;
    private String location;

    //Constructors
    public Asset(String name, String type, AssetStatus status, String serialNumber, String assignedOwner, String location) {
        this.name = name;
        this.type = type;
        this.status = status;
        this.serialNumber = serialNumber;
        this.assignedOwner = assignedOwner;
        this.location = location;
    }
    //Getter
    public Long getId() {
        return id;
    }
    public String getName(){
        return name;
    }
    public String getType(){
        return type;
    }
    public AssetStatus getStatus(){
        return status;
    }
    public String getSerialNumber(){
        return serialNumber;
    }
    public  String getAssignedOwner(){
        return assignedOwner;
    }
    public String getLocation(){
        return location;
    }
    // Setter
    public void setId(Long id){
        this.id = id;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setType(String type){
        this.type = type;
    }
    public void setStatus(AssetStatus status){
        this.status = status;
    }
    public void setSerialNumber(String serialNumber){
        this.serialNumber = serialNumber;
    }
    public void setAssignedOwner(String assignedOwner){
        this.assignedOwner = assignedOwner;
    }
    public void setLocation(String location){
        this.location = location;
    }
}
