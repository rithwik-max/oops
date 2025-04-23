public class week9q1 {

    public void checkEven(int number) throws Exception {
        if (number % 2 == 0) {
            throw new Exception("The number is even.");
        } else {
            System.out.println("The number is odd");
        }
    }

    public static void main(String[] args) {
        week9q1 c = new week9q1();
        try {
            c.checkEven(4);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
