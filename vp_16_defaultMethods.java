package com.vinayak;

interface Camera{
    void takeSnap();
    void recordVideo();
    private void switchQuality(){ // you cannot access this private, unless you call it in default method
        System.out.println("Upgrading the quality.....");
    }
    default void record4KVideo(){ // you can override default method!!!
        switchQuality();
        System.out.println("Recording in  4K...");
    }
}

interface Wifi{
    String[] getNetwork();
    void connectToNetwork(String network);
}

class MyMyCellPhone{
    public void callNumber(int phoneNumber){
        System.out.println("Calling " + phoneNumber);
    }
    public void pickCall(){
        System.out.println("Connecting....");
    }
}
class MyMySmartPhone extends MyMyCellPhone implements Wifi, Camera{

    public void takeSnap(){
             System.out.println("Taking a snap... ");
         }
         public void recordVideo(){
             System.out.println("Recording a video... ");
         }

    @Override
    public String[] getNetwork() {
        System.out.println("Getting the list of networks...");
        String [] networkList = {"John", "Peter", "Alex", "Bob"};
        return networkList;
    }

    @Override
    public void connectToNetwork(String network){
        System.out.println("Connecting to " + network + "....");
    }
}
public class default_methods {
    public static void main(String[] args) {
        MyMySmartPhone msm = new MyMySmartPhone();
        msm.recordVideo();
        msm.record4KVideo();
        msm.takeSnap();
        //msm.switchQuality(); // throws an error because it is private !
        String [] ar = msm.getNetwork();
        for(String item : ar){
            System.out.println(item);
        }
        msm.connectToNetwork("John");

    }
}