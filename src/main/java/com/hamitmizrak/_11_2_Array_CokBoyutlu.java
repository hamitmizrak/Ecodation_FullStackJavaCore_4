package com.hamitmizrak;

import java.util.Arrays;

public class _11_2_Array_CokBoyutlu {

    static void main() {
        int[][] city= new  int[3][3];
        city[0][0]=1;
        city[0][1]=2;
        city[0][2]=3;
        city[1][0]=4;
        city[1][1]=5;
        city[1][2]=6;
        city[2][0]=7;
        city[2][1]=8;
        city[2][2]=9;

        //System.out.println(city[2][0]);

        for (int i = 0; i <city.length ; i++) {  //satır
            for (int j = 0; j <city[i].length ; j++) { // sutun
                System.out.print(city[i][j]+" ");
            }
            System.out.println();
        }

    }
}
