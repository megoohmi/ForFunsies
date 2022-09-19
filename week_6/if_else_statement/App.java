public class App {
    public static void main(String[] args) throws Exception {

        // Conditional Structure
        boolean ihaveNoMoney = false;

        if (ihaveNoMoney) {
            System.out.println("ask for money duh");
        } else {
            // Step 1
            rideLRT1();
            
            // Step 2
            crossBridge();

            // Step 3
            rideLRT2();

            // Step 4
            walk();

        }

    }

    static void rideLRT1() {
        System.out.println("Ride train at R. Papa station");
        System.out.println("Exit at Doroteo Jose station");
    }

    static void crossBridge() {
        System.out.println("Walk toward LRT 2 station using the bridge");
        System.out.println("Enter LRT 2 Recto station");
    }

    static void rideLRT2() {
        System.out.println("Ride train at Recto station");
        System.out.println("Exit at Legarda station");
    }

    static void walk() {
        System.out.println("Walk for 7 mins");
    }
}
