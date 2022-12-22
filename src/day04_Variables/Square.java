
package day04_Variables;

public class Square {

    public static void main(String[] args) {   //       ""DataType + variableName = Data;""


        double side = 5.5;

        double perimeterofSquare = 4 * side;

        double areaofSquare = side * side;

        /* Task:
    1. Create a class named Square, write a program that can calculate
    the area & perimeter of any given square side
    area = side * side;
    perimeter = 4 * side
         */
        //Variable olmasa tüm numara verileri tek tek değiştirilecekti..

        System.out.println(perimeterofSquare);
        System.out.println(areaofSquare);
        System.out.println();
        System.out.println("side = " + side);
        System.out.println("perimeterofSquare = " + perimeterofSquare);
        System.out.println("areaofSquare = " + areaofSquare);




    }
}
