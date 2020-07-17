package com.learning.designpatterns.builder;

public class Main {
    public static void main(String[] args) {
        PhoneBuilder phoneBuilder = new PhoneBuilder();
        Phone android = phoneBuilder.buildOs( "Android" )
                .buildRam( 2 )
                .buildBattery( 3000 )
                .getPhone();
        System.out.println(android);

    }
}
