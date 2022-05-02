package Main;

import Demensional.MultidemensionalaArray;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MultidemensionalaArray myArray = new MultidemensionalaArray(sc.nextInt(), sc.nextInt());
        boolean deyer= myArray.MultidemensionalArray();

        while(deyer!=true){
            System.out.println("Please add the same column and rowsize ");
            myArray.rawSize=sc.nextInt();
            myArray.columnSize=sc.nextInt();
            if(myArray.rawSize== myArray.columnSize){
                deyer=true;
            }
        }


        int[][] newArray = new int[myArray.rawSize][myArray.columnSize];
        myArray.multiDemonsialArray = newArray;
        myArray.enterValuesFromConsole();
        for (int i = 0; i < myArray.findFirstDiagonalElements().length; i++) {

            for (int j = 0; j < myArray.findFirstDiagonalElements().length; j++) {

                if (i == j) {
                    System.out.print(myArray.findFirstDiagonalElements()[i][j] + " ");
                }


            }


        }
        System.out.println();
        for (int i = 0; i < myArray.findSecondDiagnalElements().length; i++) {

            for (int j = 0; j < myArray.findSecondDiagnalElements().length; j++) {

                if ((i + j) == myArray.findSecondDiagnalElements().length - 1) {
                    System.out.print(myArray.findSecondDiagnalElements()[i][j] + " ");
                }


            }


        }
        System.out.println();
        System.out.println();
        myArray.printArrayElementsInmatrixFo();



    }
}


