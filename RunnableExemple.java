package by.minsk.itakademy.arturzimin;

import java.lang.reflect.Array;
import java.util.List;

public class RunnableExemple implements Runnable  {

    static int RunnableExemple(int[] array){
        int maxElement=0;
        int []arr=array;
        for (int i=0;i<arr.length;i++){
            if (maxElement<arr[i]){
                maxElement=arr[i];
            }
        }
        System.out.println("Max value = "+maxElement);
        return maxElement;}



    public  void run() {

    }
/**public static int maxValue(int[] array){
        int maxElement=0;
        int []arr=array;
        for (int i=0;i<arr.length;i++){
            if (maxElement<arr[i]){
                maxElement=arr[i];
            }
        }
    System.out.println("Max value = "+maxElement);
        return maxElement;
}*/


}
