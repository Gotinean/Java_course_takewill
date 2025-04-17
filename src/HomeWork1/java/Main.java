public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World");
        long worldPopulation = 7811080815L;
        int producedCars = 55235358;
        String firstLetter = "A";
        boolean isJavaAmazing = true;
        double numberOfPi = 3.14159;
        System.out.println("Current World Population - " + worldPopulation);
        System.out.println("Cars Produced This Year - " + producedCars);
        System.out.println("First Letter In Alphabet - " + firstLetter);
        System.out.println("Java is Amazing - " + isJavaAmazing);
        System.out.println("Pi - " + numberOfPi);

        double price = 55.5;
        double tax = 22.3;
        int quantity = 10;
        double total = 0;
        String message = "I want to by " + quantity + " shirt";
        System.out.println(message);
        total = price * quantity * tax;
        System.out.println("Total cost with tax is " + total);
    }
}
