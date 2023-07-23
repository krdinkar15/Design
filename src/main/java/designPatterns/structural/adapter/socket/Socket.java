package designPatterns.structural.adapter.socket;
/*
An existing class used in our system.
 */
public class Socket {

    public Volt getVolt(){
        return new Volt(120);
    }
}