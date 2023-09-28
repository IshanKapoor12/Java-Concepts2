public class Challenge {
    public static void main(String[] args) {
        Printer printer1 = new Printer(50, true);
        System.out.println("Initial page count = " + printer1.getPagesPrinted());
        int pagesPrinted = printer1.printPages(5);
        System.out.printf("Current Job pages = %d %nPrinter total = %d %n", pagesPrinted, printer1.getPagesPrinted());

        Printer printer2 = new Printer(50, false);
        System.out.println("Initial page count = " + printer2.getPagesPrinted());
        pagesPrinted = printer2.printPages(5);
        System.out.printf("Current Job pages = %d %nPrinter total = %d %n", pagesPrinted, printer2.getPagesPrinted());
    }
}
