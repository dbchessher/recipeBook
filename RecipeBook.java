import java.util.Scanner;

public class RecipeBook {

    private static Scanner _scanner = new Scanner(System.in);

    public static void main(String[] args) {

        //TODO read text file and load all current recipes

        int chosenOption = 0;

        //TODO create separate method for menu options
        System.out.println("Welcome to Your Recipe Book!");
        System.out.println("----------------------------");
        System.out.println("\nWhat would you like to do today?\n");
        System.out.println("1. List All Recipes");
        System.out.println("2. Search by Category");
        System.out.println("3. Add Recipe");
        System.out.println("4. Remove Recipe");
        System.out.println("5. Exit");

        //TODO add While loop to keep program running until user selects EXIT

        chosenOption = _scanner.nextInt();

        //TODO place switch statement in separate method
        switch (chosenOption) {

            case 1: {
                System.out.println("\nHere are all your recipes:");
                //TODO print out all recipes in alphabetical order
                break;
            }
            case 2: {
                System.out.println("\nSelect a Category to Search:");
                //TODO print out all categories
                //TODO allow for sub-search based on category
                break;
            }
            case 3: {
                System.out.println("\nWhat Category is your New Recipe?");
                //TODO walk user through adding a new recipe and store it
                break;
            }
            case 4: {
                System.out.print("\nPlease provide the Recipe ID to be removed:");
                //TODO collect a RecipeID and remove the indicated recipe if exists
                break;
            }
            case 5: {
                System.out.println("\nPleasure working with you today. Bon Appetit!");
                //TODO Save current recipe book to text file then close program.
                break;
            }
        }
    }
}

