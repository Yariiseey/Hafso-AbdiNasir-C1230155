public class Main {
    // ID: C1230155
    // Name: Hafso Abdinasir Mohamed
    // Class: CA232
    static void main(String[] args) {
        ArrayStack<String> ar1 = new ArrayStack<>();
        System.out.println("------------------");
        System.out.println("Is Stack Empty? " + ar1.isEmpty());
        System.out.println("------------------");
        ar1.push("C1230155");
        ar1.push("Hafso");
        ar1.push("Abdinasir");
        ar1.push("Mohamed");

        System.out.println("------------------");
        System.out.println("After added elements Is Stack Empty? " + ar1.isEmpty());
        System.out.println("List of Elements: ");
        ar1.displayMessage();
        System.out.println("------------------");

        System.out.println("Get last element added or top of the stack: " + ar1.peek());
        System.out.println("------------------");
        ar1.pop();

        System.out.println("------------------");
        System.out.println("--After removing one element--");
        System.out.println("Get last element added or top of the stack: " + ar1.peek());
        System.out.println("------------------");
        ar1.displayMessage();
        System.out.println("Number of elements:" + ar1.size());
        ar1.displayMessage();
    }
}
