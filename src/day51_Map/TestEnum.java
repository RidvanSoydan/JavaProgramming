package day51_Map;

import java.util.ArrayList;
import java.util.Arrays;

public class TestEnum {

    public static void main(String[] args) {

        //   String browser = "Wooden Spoon";
        Browser browser = Browser.CHROME;

        switch(browser){
            case FIREFOX:
                System.out.println("Firefox is selected");
                break;

            case SAFARI:
                System.out.println("Safari is selected");
                break;

            case OPERA:
                System.out.println("Opera is selected");
                break;

            case EDGE:
                System.out.println("Edge is selected");
                break;

            default:
                System.out.println("Chrome is selected");
        }


        System.out.println("-------------------");


        Season season = Season.SUMMER;

        System.out.println("season = " + season); //season = SUMMER

        System.out.println("Season.values() = " + Arrays.toString(Season.values()));
        //Season.values() = [SUMMER, WINTER, SPRING, FALL]

    }

}
