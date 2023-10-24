public class Ex06 {
    public static void sequence(int nbr) {
        if (nbr < 0) {
            return;
        }
        System.out.println("1");
        String s = "1";
        for (int i = 0; i < nbr; i++) {
            String tmp = "";
            int count = 1;
            for (int j = 0; j < s.length(); j++) {
                if (j < s.length() - 1 && s.charAt(j) == s.charAt(j + 1)) {
                    count++;
                } else {
                    tmp += count + "" + s.charAt(j);
                    count = 1;
                }
            }
            s = tmp;
            System.out.println(s);
        }
    }
    public static void main(String[] args) {
        int n = 7;
        sequence(n);
    }
}