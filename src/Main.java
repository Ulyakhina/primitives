public class Main {
    public static void main(String[] args) {
        int ticketPrice = 10_000;
        int bonusMiles = 20;
        int bonus = ticketPrice / bonusMiles;
        System.out.println(bonus + " миль начислено за стоимость билета");

    }
}