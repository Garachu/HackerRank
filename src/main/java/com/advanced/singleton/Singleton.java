package com.advanced.singleton;

/**
 * Created by meg on 7/17/17.
 */
public class Singleton {

    private static Singleton instance = null;
    public String str;

    //implement a protected constructor so clients cannot instantiate Singleton instances
    private Singleton() {
        // Exists only to defeat instantiation.
    }


    /*
        My class employs a technique known as lazy instantiation to create the singleton;
        as a result, the singleton instance is not created until the getInstance() method is called for the first time.
        This technique ensures that singleton instances are created only when needed.
     */
    public static Singleton getInstance() {
        if(instance == null) {
            instance = new Singleton();
        }
        return instance;
    }


}
