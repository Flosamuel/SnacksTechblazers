import java.util.ArrayList; 
import java.util.Scanner;


public class CheckOutEcom {
  public static void main(String [] args) {

	Scanner input = new Scanner(System.in); 

	ArrayList<String> itemsPurchased = new ArrayList<String>(); 
	ArrayList<Integer> quantityPurchased = new ArrayList<Integer>(); 
	ArrayList<Double> priceOfItems = new ArrayList<Double>(); 
	// ArrayList<Double> totalPerItem = new ArrayList<Double>(); no more using this arraylist to collect, we now using Double and a new variable ...


	Double subTotal = 0.0; 
	Double vatAmount = 0.0; 
	Double billTotal = 0.0;
	Double amountPaid = 0.0; 
	Double customerBalance = 0.0; 

	int discountPercentage = 0;

	String AddGoodsOrStopNow = "yes"; 


	System.out.println("What is Customer's Name?: "); 
	String customerName = input.nextLine(); 


	while(AddGoodsOrStopNow.equalsIgnoreCase("yes")){

		System.out.println("What item did the customer purchase?: "); 
		itemsPurchased.add(input.nextLine()); 
	
		System.out.println("How many quantity of the item purchased?: "); 
		quantityPurchased.add(Integer.parseInt(input.nextLine()));

		System.out.println("How much per unit?: ");
		priceOfItems.add(Double.parseDouble(input.nextLine()));

		System.out.println("Add More items?: "); 
		AddGoodsOrStopNow = input.nextLine(); 

		}

	System.out.println("what is your name? (Cashier): "); 
	String cashierName = input.nextLine(); 


	System.out.println("Howmuch Discount(%) will the user get?: "); 
	discountPercentage = input.nextInt(); 


	System.out.println("SEMICOLON STORES "); 
	System.out.println("MAIN BRANCH "); 
	System.out.println("LOCATION: 312, HERBERT MACUALY WAY, SABO YABA, LAGOS.  STORES "); 
	System.out.println("TEL: 032938343 "); 
	System.out.println("Date: 07-Aug-24 8:34:10 pm"); 
	System.out.println("Cashier: " + cashierName);
        System.out.println("Customer Name: " + customerName);

	System.out.println ("==========================================================================================");

	System.out.printf("%-20s %8s %8s %12s%n", "ITEM", "QTY", "PRICE", "TOTAL(NGN)");
        System.out.println("------------------------------------------------------------------------------------------");

        for (int index = 0; index < itemsPurchased.size(); index++) {
            double totalPerItemValue = quantityPurchased.get(index) * priceOfItems.get(index);
            subTotal += totalPerItemValue;

	System.out.printf("%-20s %8d %8.2f %12.2f%n", itemsPurchased.get(index), quantityPurchased.get(index), priceOfItems.get(index), totalPerItemValue);
        }

        System.out.println("------------------------------------------------------------------------------------------");
        System.out.printf("%-20s %8s %8s %12.2f%n", "SUBTOTAL", "", "", subTotal);

	double discountAmount = (discountPercentage / 100.0) * subTotal;
        double discountedTotal = subTotal - discountAmount;
        vatAmount = 0.175 * discountedTotal; 
        billTotal = discountedTotal + vatAmount;

        System.out.printf("%-20s %8s %8s %12.2f%n", "DISCOUNT", "", "", discountAmount);
        System.out.printf("%-20s %8s %8s %12.2f%n", "VAT @ (17.5%)", "", "", vatAmount);
	System.out.println ("==========================================================================================");
        System.out.printf("%-20s %8s %8s %12.2f%n", "BILL TOTAL", "", "", billTotal);
 	System.out.println ("==========================================================================================");
	System.out.println(" THIS IS NOT A RECIEPT, KINDLY PAY: " + billTotal);
	System.out.println ("==========================================================================================");

	
	System.out.println("How Much Did the Customer Give to you?: ");
	amountPaid = input.nextDouble(); 

	customerBalance = amountPaid - billTotal;

	System.out.println("------------------------------------------------------------------------------------------");

	System.out.println("SEMICOLON STORES "); 
	System.out.println("MAIN BRANCH "); 
	System.out.println("LOCATION: 312, HERBERT MACUALY WAY, SABO YABA, LAGOS.  STORES "); 
	System.out.println("TEL: 032938343 "); 
	System.out.println("Date: 07-Aug-24 8:34:10 pm"); 
	System.out.println("Cashier: " + cashierName);
        System.out.println("Customer Name: " + customerName);

	System.out.println ("==========================================================================================");

	System.out.printf("%-20s %8s %8s %12s%n", "ITEM", "QTY", "PRICE", "TOTAL(NGN)");
        System.out.println("------------------------------------------------------------------------------------------");

        for (int index = 0; index < itemsPurchased.size(); index++) {
            double totalPerItemValue = quantityPurchased.get(index) * priceOfItems.get(index);
            subTotal += totalPerItemValue;

	System.out.printf("%-20s %8d %8.2f %12.2f%n", itemsPurchased.get(index), quantityPurchased.get(index), priceOfItems.get(index), totalPerItemValue);
        }

        	System.out.println("------------------------------------------------------------------------------------------");
        System.out.printf("%-20s %8s %8s %12.2f%n", "SUBTOTAL", "", "", subTotal);

 	System.out.printf("%-20s %8s %8s %12.2f%n", "DISCOUNT", "", "", discountAmount);
        System.out.printf("%-20s %8s %8s %12.2f%n", "VAT @ (17.5%)", "", "", vatAmount);
	System.out.println ("==========================================================================================");
        System.out.printf("%-20s %8s %8s %12.2f%n", "BILL TOTAL", "", "", billTotal);
        System.out.printf("%-20s %8s %8s %12.2f%n", "AMOUNT PAID", "", "", amountPaid);
        System.out.printf("%-20s %8s %8s %12.2f%n", "BALANCE", "", "", customerBalance);
	System.out.println ("==========================================================================================");
	System.out.println("THANK YOU FOR YOUR PATRONAGE");

	  }
	}

	


/*  




3. second refinement: 

- collect inputs;

1. what is the customer's name? = Initialize variable for customerName; 


2. what did the customer purchase? = initialize variable and add to array itemPurchased;


3. how many pieces of this item did the user purchase? = initialize variable and add to array quantityPurchased; 


4. how much per unit? = initialize variable and add to array priceItems; 




5. Do you want more items?  = ( create a string variable to collect add more goods input.(AddGoodsOrStopNow = "yes"), 

while loop ==> add More Goods? = "yes" ==> 


- what did the customer purchase? = initialize variable and add to array itemPurchased; // ( use string nextLine(); to collect) 



- how many pieces of this item did the user purchase? = initialize variable and add to array quantityPurchased; // ( use int, parseint into nextLine to collect)


- how much per unit? = initialize variable and add to array priceItems; use double, pasedouble into nextLine to collect;

-----------

6. Do you want more items = ( No ) 


7. What is your name (cashier)?  variable for cashierName; 


8. How much discount will customer get? = initialize to variable (discountPercentage = subTotal / 100 x 8) 


9. new double variable totalPerItemValue to hold total value of each product and unit, and use it increment the ( subtotal + 1)


9. create a double variable discountedAmount to hold amount (gotten from discounted percentage) to be deducted from subtotal


10 create new doudle variable discountedTotal = discoutedamount + vat amunt 


11 use the variable billTotal to collect balance for discountedTotal + Vat Amount

12. then use variables amountPaid and customerBalance to complete the business by printing invoice again showing both figures to complete biz.

--------------------------------------------



pseudocode:

1. top = develop an ecommerce checkout for semicolon store that sells variety of products and a checkout system 
that allows the cashier to enter the product details in the user's cart to display product and quantity purchased, 
and display it as customers invoice, computes customer's total amount, discount and vat of 7.5% of the total price.



2. first refinement:

- initialize variables for; 
1. variety of products (product types and Qtty) 
2. price of products
3. total amount purchased by customer (total price) 
4. item purchased
5. Sum of total purchase: subtotal (before vat)
6 discounted amount 
7. vatValue 

//8. invoice display (total product and qtty purchased, total amount, discount, Vat) 




--------------------------------------

checkout ecommerce; 

You have been hired to develop an ecommerce checkout system for semicolon store.

1. the store sells a variety of products, and each products has a name and a price.

2. implement a checkout system for the store that allows the cashier do the following; 

-  enter each product details in the user's cart - product and quantity purchased 
- display customer's invoice

- computes total, discount and VAT OF 7.5% total price



----------------


*/ 



