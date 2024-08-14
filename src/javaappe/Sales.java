package javaappe;

import java.util.Scanner;

public class Sales {
    
    public void getSales(){
    
        Scanner input = new Scanner(System.in);
        
        System.out.print("Customer Name: ");
        String customer = input.nextLine();
        System.out.print("Product Name: ");
        String product = input.nextLine();
        System.out.print("Quantity: ");
        int quant = input.nextInt();
        System.out.print("Price: ");
        int price = input.nextInt();
        System.out.print("Cash: ");
        int cash = input.nextInt();
        
        System.out.println("\n-----------------------------");
        System.out.println("RECEIPT");
        System.out.println("-----------------------------");
        
        System.out.println("Name: "+customer);
        System.out.println("Item: "+product);
        System.out.println("Quantity: "+quant);
        System.out.println("-----------------------------");
        System.out.println("Total Due: "+(quant*price));
        System.out.println("Cash: "+(cash));
        System.out.println("-----------------------------");
        System.out.println("Change: "+(cash-(quant*price)));
        System.out.println("-----------------------------");
        
    }
    
}
