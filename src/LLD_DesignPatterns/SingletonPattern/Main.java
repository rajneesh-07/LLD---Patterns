package LLD_DesignPatterns.SingletonPattern;

import java.io.FileWriter;
import java.io.PrintWriter;

public class Main {
    public static void main(String[] args) {

        Runnable run = () ->{
            Singleton obj = Singleton.getObject();
            System.out.println("Thread : " + Thread.currentThread().getName()  + " Object : " + obj + " count : " + Singleton.count);
        };
  for(int i = 1; i<=10000; i++) {
      Thread t1 = new Thread(run);
      Thread t2 = new Thread(run);
      Thread t3 = new Thread(run);
      t1.start();
      t2.start();
      t3.start();

      PrintWriter writer;
      FileWriter fileWriter;
  }
    }
}
