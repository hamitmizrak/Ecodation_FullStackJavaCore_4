package com.hamitmizrak.course_1;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

// LOMBOK
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class _15_1_Thread extends Thread {

    // Field
    private Long threadId;
    private String threadNameData;

    @Override
    public void run() {
        System.out.println("Thread Extends");
        for (int i = 1; i <=9 ; i++) {
            System.out.println("Thread "+this.threadId+" = "+i+" "+this.threadNameData);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                //throw new RuntimeException(e);
                throw new _14_2_HamitMizrak("thread sleep not running");
            } //end catch
        } //end for

    } //end run
}// end class

// Main Class
class Main{
    static void main() throws InterruptedException {
        _15_1_Thread thread1= new _15_1_Thread(1L,"Java SE");
        _15_1_Thread thread2= new _15_1_Thread(2L,"Java ME");
        _15_1_Thread thread3= new _15_1_Thread(3L,"Java EE");

        /*System.out.println("Get name: "+thread1.getName());
        System.out.println("Hashcode: "+thread1.hashCode());
        System.out.println("isAlive: "+thread1.isAlive());
        thread1.start();
        System.out.println("isAlive: "+thread1.isAlive());*/

        thread1.start();
        thread1.join();

        thread2.start();
        thread3.start();
    }
}
