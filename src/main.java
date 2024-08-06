



public class main {

    public static void main(String[] args) {

        try {
            Challenge397 challenge397 = new Challenge397();
            System.out.println(challenge397.numcompare("I", "I"));
            System.out.println(challenge397.numcompare("I", "II"));
            System.out.println(challenge397.numcompare("II", "I"));
            System.out.println(challenge397.numcompare("V", "IIII"));
            System.out.println(challenge397.numcompare("MDCLXV", "MDCLXVI"));
            System.out.println(challenge397.numcompare("MM", "MDCCCCLXXXXVIIII"));
        } catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }


}
