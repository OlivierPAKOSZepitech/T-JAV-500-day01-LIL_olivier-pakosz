public class Ex02 {
    public static void getAngryDog(int nbr) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < nbr; i++) {
            result.append("woof");
        }
        result.append("\n");
        System.out.println(result);
    }
    public static void main(String[] args) {
        getAngryDog(3);
    }
}
