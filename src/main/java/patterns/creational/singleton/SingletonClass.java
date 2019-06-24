package main.java.patterns.creational.singleton;

/**
 * Created by rohit.jh on 24/06/19
 */
class SingletonClass {

    private static SingletonClass instance = null;

    static SingletonClass getInstance() {
        if (instance == null) {
            synchronized (SingletonClass.class) {
                if (instance == null) {
                    instance = new SingletonClass();
                    return instance;
                }
            }
        }
        return instance;
    }

}
