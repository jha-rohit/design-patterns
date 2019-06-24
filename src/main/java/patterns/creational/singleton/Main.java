package main.java.patterns.creational.singleton;

/**
 * Created by rohit.jh on 24/06/19
 */
public class Main {
    public static void main(String[] args) {
        SingletonClass instance1 = SingletonClass.getInstance();
        SingletonClass instance2 = SingletonClass.getInstance();
        System.out.println("Hash of instance1 : " + instance1.hashCode());
        System.out.println("Hash of instance2 : " + instance2.hashCode());
    }
}
