package org.example;

public class Computer
{
    String prosName;
    String diskName;
    String memOpName;
    String vidCardName;
    String monitorName;
    int prosFreqHz;
    int diskMemMb;
    int memOpMemMb;
    int vidCardMemMb;
    int monitorFreqHz;
    int prosPrice;
    int diskPrice;
    int memOpPrice;
    int vidCardPrice;
    int monitorPrice;


    public Computer()
    {
        this.prosName = "Мой";
        this.diskName = "Мой";
        this.memOpName = "Мой";
        this.vidCardName = "Мой";
        this.monitorName = "Мой";
        this.prosFreqHz = 1;
        this.diskMemMb = 1;
        this.memOpMemMb = 1;
        this.vidCardMemMb = 1;
        this.monitorFreqHz = 1;
        this.prosPrice = 1;
        this.diskPrice = 1;
        this.memOpPrice = 1;
        this.vidCardPrice = 1;
        this.monitorPrice = 1;
        //return new Cat;
    }


    public Computer(String newProsName, String newDiskName,
                    String newMemOpName, String newVidCardName,
                    String newMonitorName)
    {
        this.prosName = newProsName;
        this.diskName = newDiskName;
        this.memOpName = newMemOpName;
        this.vidCardName = newVidCardName;
        this.monitorName = newMonitorName;
        //return new Cat;
    }

    public Computer( int newProsFreqHz, int newDiskMemMb, int newMemOpMemMb,
                     int newVidCardMemMb, int newMonitorFreqHz)
    {

        this.prosFreqHz = newProsFreqHz;
        this.diskMemMb = newDiskMemMb;
        this.memOpMemMb = newMemOpMemMb;
        this.vidCardMemMb = newVidCardMemMb;
        this.monitorFreqHz = newMonitorFreqHz;
    }

    public void getInfo()
    {
        System.out.println(this.prosName);
        System.out.println(this.diskName);
        System.out.println(this.memOpName);
        System.out.println(this.vidCardName);
        System.out.println(this.monitorName);
        System.out.println(this.prosFreqHz);
        System.out.println(this.diskMemMb);
        System.out.println(this.memOpMemMb);
        System.out.println(this.vidCardMemMb);
        System.out.println(this.monitorFreqHz);
        System.out.println(this.prosPrice);
        System.out.println(this.diskPrice);
        System.out.println(this.memOpPrice);
        System.out.println(this.vidCardPrice);
        System.out.println(this.monitorPrice);
    }


    public Computer(String prosName, String diskName, String memOpName,
                    String vidCardName, String monitorName, int prosFreqHz,
                    int diskMemMb, int memOpMemMb, int vidCardMemMb,
                    int monitorFreqHz, int prosPrice, int diskPrice,
                    int memOpPrice, int vidCardPrice, int monitorPrice) {
        this.prosName = prosName;
        this.diskName = diskName;
        this.memOpName = memOpName;
        this.vidCardName = vidCardName;
        this.monitorName = monitorName;
        this.prosFreqHz = prosFreqHz;
        this.diskMemMb = diskMemMb;
        this.memOpMemMb = memOpMemMb;
        this.vidCardMemMb = vidCardMemMb;
        this.monitorFreqHz = monitorFreqHz;
        this.prosPrice = prosPrice;
        this.diskPrice = diskPrice;
        this.memOpPrice = memOpPrice;
        this.vidCardPrice = vidCardPrice;
        this.monitorPrice = monitorPrice;
    }
}

