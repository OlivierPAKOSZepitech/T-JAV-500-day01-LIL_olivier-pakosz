public class Ex02 {
    public static String getAngryDog(int nbr) {
        String result = "";
        for (int i = 0; i < nbr; i++) {
            result += "woof";
        }
        result += "\n";

        return result;
    }

    public static void main(String[] args) {
        System.out.println(getAngryDog(3));
    }
}
