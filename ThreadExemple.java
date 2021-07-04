package by.minsk.itakademy.arturzimin;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class ThreadExemple extends Thread {

    List list=new ArrayList(10);


/**Task52*/

    public void run(List list) {
        int sum = 0;
        int count=0;
        List list1 = new ArrayList(list);
        for (int i = 0; i < 10; i++) {
            count++;
            sum += i ;
        }
       int average=sum/list.size();
        System.out.println(average);
    }

  /**  public static int average(List list1) {
        int sum = 0;
        int count=0;
        List list = new ArrayList(list1);
        for (int i = 0; i < 10; i++) {
            count++;
            sum += i ;
        }
        sum=sum/list.size();
        System.out.println(sum);
        return sum;
    }*/


}
