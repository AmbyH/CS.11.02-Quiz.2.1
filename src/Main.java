public class Main {

    public static void main(String[] args) {
        int resultOne = add(1,2);
        System.out.println(resultOne);
        String resultTwo = greeting("Nick");
        System.out.println(resultTwo);
        int resultThree = add(1,2,3,4);
        System.out.println(resultThree);
        printMe("All praise our great lord and savior!");




    }

    public static int add(int numOne, int numTwo) {
        return numOne+numTwo;

    }

    public static String greeting(String name) {
        return "Bonjour, "+name+"!";
    }

    public static int add(int numOne, int numTwo, int numThree, int numFour) {
        return add(add(add(numOne,numTwo),numThree),numFour);
    }

    public static void printMe(String toBePrinted) {
        System.out.println(toBePrinted);
    }



}
