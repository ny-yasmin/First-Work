import service.DynamicArr;
import util.Input;

import java.util.Scanner;

public class Main {
    static Scanner scannerInt = new Scanner(System.in);
    public static void main(String[] args) {
        DynamicArr dynamicArr = new DynamicArr(5);
        Menu();
        switch (Input.inputInt("Choose: ")){
            case 1-> dynamicArr.add(scannerInt.nextInt());
            case 2-> dynamicArr.removeByElement();
            case 3-> dynamicArr.removeAll();
        }











    }

    private static void Menu() {
        System.out.println("""
                1. Add
                2. Remove by element
                3. Remove all
                """);
    }
}
