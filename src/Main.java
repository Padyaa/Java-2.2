public class Main {
    public static void main(String[] args) {
        int balance = 300;
        int amount = 1500;
        int bonus;

        if (amount > 1000) {
            bonus = amount / 100;
        } else {
            bonus = 0;
        }

        int final_balane = balance + bonus + amount;
        System.out.println("На вашем счету:" + final_balane);
    }

}
