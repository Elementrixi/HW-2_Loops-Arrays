package main.java.com.hwnumber2;

import java.util.Arrays;

public class Task3 {
    void replaceValues(){
        int[] array = {3,2,3,1,4,2,8,4};
        for (int i = 0; i < array.length; i++){
            for (int j = i + 1; j < array.length; j++){
                if (array[i] == array[j]){
                    if (array[i] != 0){
                        array[j] = 0;
                    }
                }
            }
        }
        System.out.println("Part 3" + "\n" + Arrays.toString(array));
    }
}
