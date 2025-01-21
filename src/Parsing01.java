public class Parsing01 {
    public static void main(String[] args) {
        //Declare and intitialize 3 Strings: shirtPrice, taxRate, and gibberish
        String shirtPrice = "15";
        String taxRate = "1.05";
        String gibberish = "887ds7nds87dsfs";

        //Parse shirtPrice and taxRate, and print the total tax
        int price = Integer.parseInt(shirtPrice);
        double tax = Double.parseDouble(taxRate);
        System.out.println("Total price after tax: " + (price * tax));

        //Try to parse taxRate as an int
        int parse = Integer.parseInt(taxRate);
        System.out.println(parse);

        //Try to parse gibberish as an int
        int gib = Integer.parseInt(gibberish);
        System.out.println(gib);

    }

}
