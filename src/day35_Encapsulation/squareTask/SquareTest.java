package day35_Encapsulation.squareTask;

public class SquareTest {


    public static void main(String[] args) {

        Square square =  new Square(5);

        System.out.println(square); // Square{side= 5.0 area= 25.0 perimeter= 20.0}

        square.setSide(10);
        System.out.println(square.getSide()); // 10.0

        System.out.println(square); // Square{side= 10.0 area= 100.0 perimeter= 40.0}


    }


}
