package com;

/**
 * Created by niuhonglei on 2017/11/15.
 */
public class MeiTuanArrayPrint {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        positive(arr);
//        reserveArr(arr);
    }
    public static void positive(int[][] arr){
        int lenght = arr.length;
        int forNums = (lenght-1)*(lenght-1)+1;
        int currentFor = forNums/2;
        for(int i = 0;i<forNums/2+1;i++){
            for(int row=0;row<lenght;row++){
                for(int col=lenght-1;col >= 0;col--){
                    if(col-row==currentFor){
                        System.out.print(arr[row][col] + " ");
                    }
                }
            }
            currentFor--;
            System.out.println();
        }

        currentFor = forNums/2;
        for(int i = 0;i<forNums/2;i++){
            for(int row=0;row<lenght;row++){
                for(int col=0;col<lenght;col++){
                    if(row-col==currentFor){
                        System.out.print(arr[row][col] + " ");
                    }
                }
            }
            currentFor--;
            System.out.println();
        }

    }
    public static void reserveArr(int[][] arr){
        int lenght = arr.length;
        int forNum = (lenght-1)*(lenght-1)+1;

        int currentIndex = forNum/2;
        for(int i=0;i<forNum/2+1;i++){
            for(int col=lenght-1;col>=0;col--){
                for(int row=0;row<lenght;row++){
                    if(col-row == currentIndex){
                        System.out.print(arr[row][col] + " ");
                    }
                }
            }
            currentIndex --;
            System.out.println("");
        }
        currentIndex = forNum/2;
        for(int i=0;i<currentIndex;i++){
            for(int col=lenght-1;col>=0;col--){
                for(int row=0;row<lenght;row++){
                    if(row-col==currentIndex){
                        System.out.print(arr[row][col] + "");
                    }
                }
            }
            currentIndex --;
            System.out.println("");
        }

    }
}
