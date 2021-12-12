package com.company;

public class Task3 {
    public static void main(String[] args) {
        int[][] squareTable = {
                {16, 3, 2, 13},
                {5, 10, 11, 8},
                {9, 6, 7, 12},
                {4, 15, 14, 1}
        };
        int sumCol1 = 0;
        int sumCol2 = 0;
        int sumCol3 = 0;
        int sumCol4 = 0;

        for (int i = 0; i < 4; i++) {
            sumCol1 = sumCol1 + squareTable[i][0];
            sumCol2 = sumCol2 + squareTable[i][1];
            sumCol3 = sumCol3 + squareTable[i][2];
            sumCol4 = sumCol4 + squareTable[i][3];

        }

        int sumRow1 = 0;
        int sumRow2 = 0;
        int sumRow3 = 0;
        int sumRow4 = 0;

        for (int i = 0; i < 4; i++) {
           sumRow1 = sumRow1 + squareTable[0][i];
           sumRow2 = sumRow2 + squareTable[1][i];
           sumRow3 = sumRow3 + squareTable[2][i];
           sumRow4 = sumRow4 + squareTable[3][i];

        }
        int sumAllCol = sumCol1 + sumCol2 + sumCol3 +sumCol4;
        int sumAllRow = sumRow1 + sumRow2 + sumRow3 +sumRow4;
        int sumDiag1 = squareTable[0][0] + squareTable [1][1] + squareTable[2][2] + squareTable [3][3];
        int sumDiag2 = squareTable[0][3] + squareTable [1][2] + squareTable[2][1] + squareTable [3][0];
        int sumAllDiag = (sumDiag1 + sumDiag2) * 2;

        if (sumAllCol == sumAllRow){
            if(sumAllRow == sumAllDiag){

            }
            System.out.println("The square table is magic!");
        }else{
            System.out.println("The square table is not magic!");
        }
    }
}
