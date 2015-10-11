package hw_1;

/**
 * Created by IgorPostoy on 09.10.2015.
 */
public class Fibonachi {

    static int[] fibonachi(int number){
        if (number==1){
            int[] mas = {1};
            return mas;
        }
        if (number==2){
            int[] mas = {1, 1};
            return mas;
        }

        int [] mas = new int [number];
        mas[0]=1;
        mas[1]=1;
        for (int i = 2; i < number; i++){
            mas[i] = mas[i-1] + mas[i-2];
        }

        return mas;
    }


}
