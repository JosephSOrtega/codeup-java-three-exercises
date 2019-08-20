import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

public class helloWorld {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        StringUtils stringUtils = new StringUtils();

        System.out.println("Enter Something: ");
        String userIn = scanner.nextLine();
        System.out.println("You entered: " + userIn);
        if (StringUtils.isNumeric(userIn)){
            System.out.println(userIn + " is a number");
        } else {
            System.out.println(userIn + " is not a number");
        }
        System.out.println("Flipped Case: " + StringUtils.swapCase(userIn));
        System.out.println("Reversed: " + StringUtils.reverse(userIn));
    }
}

