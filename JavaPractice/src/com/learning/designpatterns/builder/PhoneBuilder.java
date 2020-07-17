package com.learning.designpatterns.builder;

public class PhoneBuilder {
    private Phone phone;

    public PhoneBuilder() {
        this.phone = new Phone();
    }

    public PhoneBuilder buildOs(String os){
        this.phone.setOs( os );
        return this;
    }
    public PhoneBuilder buildRam(int ram){
        this.phone.setRam( ram );
        return this;
    }
    public PhoneBuilder buildBattery(int battery){
        this.phone.setBattery( battery );
        return this;
    }
    public PhoneBuilder buildProcessor(String processor){
        this.phone.setProcessor( processor );
        return this;
    }
    public PhoneBuilder buildScreenSize(double screenSize){
        this.phone.setScreenSize( screenSize );
        return this;
    }
    public Phone getPhone(){
        return this.phone;
    }
}
