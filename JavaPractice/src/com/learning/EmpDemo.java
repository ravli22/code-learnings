package com.learning;

import java.util.HashMap;
import java.util.HashSet;

public class EmpDemo {
    public static void main(String[] args) {
        Emp emp1 = new Emp( "Ravali",5 );
        Emp emp2 = new Emp("Ravali",5);
        Emp emp4 = new Emp("Ravali",5);

        Emp emp3 = null;

        HashMap<Emp,Integer> map = new HashMap<>();
        map.put( emp1,1 );
        map.put( emp2,2 );
        map.put( emp4,3 );

        System.out.println("map size : "+map.size());

        map.forEach( (k,v) ->System.out.println(k+" : "+v) );

        HashSet<Emp> emps = new HashSet<>();
        emps.add(emp1 );
        emps.add( emp2 );

        System.out.println(emps.size());

        System.out.println(emp1.equals( emp2 ));
        System.out.println(emp1.hashCode());
        System.out.println(emp2.hashCode());

        System.out.println(emp1.toString());
        System.out.println(emp2.toString());

        System.out.println(emp1==emp2);

        System.out.println(emp1.equals( null ));
        System.out.println(emp1==null );
      //  System.out.println(emp3.equals( emp1 ));
    }
}
