package by.minsk.itakademy.arturzimin;

import java.io.IOException;
import java.util.*;

public class Main {


    public static void main(String[] args) throws IOException, InterruptedException {

        /**Task52  +ThreadExemple*/

        List list = new ArrayList(10);
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            list.add(random.nextInt(10));
        }

        ThreadExemple threadExemple1 = new ThreadExemple();
        ThreadExemple threadExemple2 = new ThreadExemple();
        ThreadExemple threadExemple3 = new ThreadExemple();
        ThreadExemple threadExemple4 = new ThreadExemple();
        ThreadExemple threadExemple5 = new ThreadExemple();
        ThreadExemple threadExemple6 = new ThreadExemple();
        ThreadExemple threadExemple7 = new ThreadExemple();
        ThreadExemple threadExemple8 = new ThreadExemple();
        ThreadExemple threadExemple9 = new ThreadExemple();
        ThreadExemple threadExemple10 = new ThreadExemple();
        threadExemple1.run(list);
        threadExemple2.run(list);
        threadExemple3.run(list);
        threadExemple4.run(list);
        threadExemple5.run(list);
        threadExemple6.run(list);
        threadExemple7.run(list);
        threadExemple8.run(list);
        threadExemple9.run(list);
        threadExemple10.run(list);
        threadExemple1.start();
        threadExemple2.start();
        threadExemple3.start();
        threadExemple4.start();
        threadExemple5.start();
        threadExemple6.start();
        threadExemple7.start();
        threadExemple8.start();
        threadExemple9.start();
        threadExemple10.start();

        //System.out.println(threadExempleTask522.getState());

        /**Task53  +RunnableExemple*/

        int[] arr = new int[10];
        Random random1 = new Random();
        for (int q = 0; q < arr.length; q++) {
            arr[q] = random1.nextInt(10);

        }


        RunnableExemple runnableExemple1 = new RunnableExemple();
        RunnableExemple runnableExemple2 = new RunnableExemple();
        RunnableExemple runnableExemple3 = new RunnableExemple();
        RunnableExemple runnableExemple4 = new RunnableExemple();
        RunnableExemple runnableExemple5 = new RunnableExemple();
        RunnableExemple runnableExemple6 = new RunnableExemple();
        RunnableExemple runnableExemple7 = new RunnableExemple();
        RunnableExemple runnableExemple8 = new RunnableExemple();
        RunnableExemple runnableExemple9 = new RunnableExemple();
        RunnableExemple runnableExemple10 = new RunnableExemple();
        Thread threadRunable1 = new Thread(runnableExemple1);
        Thread threadRunable2 = new Thread(runnableExemple2);
        Thread threadRunable3 = new Thread(runnableExemple3);
        Thread threadRunable4 = new Thread(runnableExemple4);
        Thread threadRunable5 = new Thread(runnableExemple5);
        Thread threadRunable6 = new Thread(runnableExemple6);
        Thread threadRunable7 = new Thread(runnableExemple7);
        Thread threadRunable8 = new Thread(runnableExemple8);
        Thread threadRunable9 = new Thread(runnableExemple9);
        Thread threadRunable10 = new Thread(runnableExemple10);
        threadRunable1.start();
        threadRunable2.start();
        threadRunable3.start();
        threadRunable4.start();
        threadRunable5.start();
        threadRunable6.start();
        threadRunable7.start();
        threadRunable8.start();
        threadRunable9.start();
        threadRunable10.start();
        RunnableExemple.RunnableExemple(arr);


    }


}
