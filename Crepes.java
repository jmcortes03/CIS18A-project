
import java.util.Scanner; //add scanner
class Intro {
//Introduce the Resturant
        public static void main (String[] args) {
        System.out.println("Welcome to Crepes Delight: Customize your own Crepe");
        System.out.println("Starting price: $5.95");
//list of items
        System.out.println("Bananas, Strawberries, Berries, Chocolate, Nuts, Caramel");
        System.out.println("Jelly, Peanut Butter, Whip Cream, Ice Cream, Chocolate");
//items as variables
                double Bananas = 0.95;
                double Strawberries = 0.95;
                double Berries = 0.95;
                double Chocolate = 0.35;
                double nuts = 0.50;
                double Caramel = 0.35;
                double Jelly = 0.40;
                double PeanutButter = 0.40;
                double WhipCream = 0.50;
                double IceCream = 1.50;
//reading what is inputed
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter first ingredient");
        String food1 = sc.nextLine();
        System.out.println("Enter second ingredient");
        String food2 = sc.nextLine();
        System.out.println("Enter third ingredient");
        String food3 = sc.nextLine();
        String total = food1 + "," +  food2 + "," + food3;
//replay back to the user
        System.out.println("Crepe with: " + total);

        }

}
