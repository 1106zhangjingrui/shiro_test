package com.test.controller;

import java.util.Random;

/**
 * @ClassName demo
 * @Description TODO
 * @Author zjr
 * @Date 2018/9/12 17:52
 * @Version
 **/
public class demo {
    public static void main(String[] args) {
        int arr[] = new int[100];
        Random random = new Random(47);
        for(int i = 0;i <100;i++){

            arr[i] = random.nextInt(100) + 1;
        }

        for(int i = 0; i <100 ;i++ ) {
            if(i % 10 == 0){
                System.out.println();
            }
            System.out.print(arr[i] + " ");
        }
    }

}
