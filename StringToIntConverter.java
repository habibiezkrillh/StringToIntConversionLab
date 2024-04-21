import java.util.Scanner;

public class StringToIntConverter{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        try{
            int convertedInt = Integer.parseInt(inputString);
            System.out.println("Converted integer: " + convertedInt);           
        } catch (NumberFormatException e){
            System.out.println("Error: Invalid input. Please enter a valid integer.");
        }
        scanner.close();
    }
}