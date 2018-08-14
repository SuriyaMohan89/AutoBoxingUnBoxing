package com.suriya;

import java.lang.reflect.Array;
import java.util.ArrayList;
class intClass{
private int value;

    public intClass(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
public class Main {

    public static void main(String[] args) {
	// write your code here
        String [] strArray = new String[10];
        int [] intArray = new int[10];
        ArrayList<String> strArrayList = new ArrayList<String>();
        ArrayList<intClass> intArr = new ArrayList <intClass> ();
        intArr.add(new intClass(54));
        Integer inte = new Integer(54);
        System.out.println(inte);

        ArrayList<Integer> intAr = new ArrayList<Integer>();

        for (int i = 0; i < 7; i++){
            intAr.add(Integer.valueOf(i)); // Autoboxing
        }
        for (int i = 0; i < 7; i++){
            System.out.println(i + " ---> "+" contains "+intAr.get(i).intValue()); // Unboxing
        }


    }

}


