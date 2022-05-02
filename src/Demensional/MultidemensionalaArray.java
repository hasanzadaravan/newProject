package Demensional;

import java.util.Scanner;

public class MultidemensionalaArray {


    public int rawSize;
    public  int columnSize;
    public boolean deyer;
    public int[][] multiDemonsialArray = new int[rawSize][columnSize];
    Scanner sc = new Scanner(System.in);







    public MultidemensionalaArray(int rawSize, int columnSize) {
        this.rawSize = rawSize;
        this.columnSize = columnSize;
    }

    public boolean MultidemensionalArray(){
        if(rawSize!=columnSize){
            deyer=false;
        } else{
            deyer=true;

        }
        return deyer;
    }

    public void  enterValuesFromConsole() {
        int i = 0;
        int j = 0;
        for (i = 0; i < multiDemonsialArray.length; i++) {
            for (j = 0; j < multiDemonsialArray.length; j++) {

                multiDemonsialArray[i][j] = sc.nextInt();
            }
        }




    }


    public int[][] findFirstDiagonalElements() {
        int[][] newArray = new int[rawSize][columnSize];

        for (int i = 0; i < multiDemonsialArray.length; i++) {

            for (int j = 0; j < multiDemonsialArray.length; j++) {

                if (i == j) {
                    newArray[i][j] = multiDemonsialArray[i][j];

                }
            }
        }

        return newArray;


    }

    public int[][] findSecondDiagnalElements() {
        int[][] newArray = new int[rawSize][columnSize];

        for (int i = 0; i < multiDemonsialArray.length; i++) {

            for (int j = 0; j < multiDemonsialArray.length; j++) {

                if ((i + j) == multiDemonsialArray.length - 1) {
                    newArray[i][j] = multiDemonsialArray[i][j];

                }
            }
        }

        return newArray;


    }

    public void printArrayElementsInmatrixFo() {

        for (int i = 0; i < multiDemonsialArray.length; i++) {
            for (int j = 0; j < multiDemonsialArray.length; j++) {
                System.out.print(multiDemonsialArray[i][j] + " ");
            }
            System.out.println();
        }
    }


}
