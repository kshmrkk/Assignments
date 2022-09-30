package Shopping;
import java.io.IOException;
import java.util.*;
public class Main{
    public static void mainMenu(){
        System.out.println("Adding Items to Cart");
        System.out.println("===================");
        System.out.println("Press [1] to Enter Items.");
        System.out.println("Press [2] to Remove Items.");
        System.out.println("Press [3] to Display all items.");
        System.out.println("Press [4] to Display amount of items.");
        System.out.println("Press [5] to Display Categorized items.");
        System.out.println("Press [6] to Exit");
    }
    public static void main(String []args){
        try{
            Scanner input = new Scanner (System.in);
            CartEntry x = new CartEntry();
            int choice;
            do{
                mainMenu();
                System.out.println("Enter you choice:");
                choice = input.nextInt();
                switch(choice){
                    case 1:
                        System.out.println("Enter the Category of Item");
                        String Category = input.next();
                        System.out.println("Enter Item Name");
                        String product = input.next();
                        System.out.println("Enter quantity");
                        int quantity = input.nextInt();
                        System.out.println("Enter price of Item");
                        int price = input.nextInt();
                        x.insert(Category,product,quantity,price);
                        break;
                    case 2:
                        x.view();
                        System.out.println("Enter number of Item:");
                        String id = input.next();
                        x.remove(id);
                        break;
                    case 3:
                        x.view();
                        break;
                    case 4:
                        x.summary();
                        break;
                    case 5:
                        x.overall();
                        break;
                    case 6:
                        System.out.println("Thank you for shopping");
                        break;
                    default:
                        System.out.println("Choice not found!");
                }
            }
            while(choice!=6);

        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
