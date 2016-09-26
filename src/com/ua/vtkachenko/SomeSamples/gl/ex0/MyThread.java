package com.ua.vtkachenko.SomeSamples.gl.ex0;

class MyThread extends Thread {
    public static void main(String [] args) {
//        MyThread t = new MyThread();
//        Thread x = new Thread(t);
//        x.start();

        if (true)
        {
            System.out.println("1");
            //do something
        }
        else
        {
            System.out.println("2");
            //do something else
        }
    }
    public void run() {
        for(int i=0;i<3;++i) {
            System.out.print(i + "..");
        }
    }
}