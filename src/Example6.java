import java.util.Scanner;
public class Example6 {
    public static void main(String[] argv){
        float retailPrice;
        float realPrice;
        float discount;
        System.out.print("Enter the retail price: ");

        Scanner inputValue;
        inputValue = new Scanner(System.in);
        retailPrice = inputValue.nextFloat();

        System.out.print("Enter the real price: ");
        realPrice =  inputValue.nextFloat();

        discount = (retailPrice - realPrice) / retailPrice * 100;
        System.out.print("The discount is: " + discount + "%");
    }
}
