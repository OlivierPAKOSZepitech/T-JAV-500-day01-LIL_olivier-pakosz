public class Ex06 {
    public static void sequence(int n) {
        if (n < 0) {
            return; 
        }

        String current = "1"; 

        for (int i = 0; i < n; i++) {
            System.out.println(current);
            StringBuilder next = new StringBuilder();
            char digit = current.charAt(0);
            int count = 1;

            for (int j = 1; j < current.length(); j++) {
                if (current.charAt(j) == digit) {
                    count++;
                } else {
                    next.append(count).append(digit);
                    digit = current.charAt(j);
                    count = 1;
                }
            }

            next.append(count).append(digit);
            current = next.toString(); 
        }
    }
/*
    public static void main(String[] args) {
        int n = -1;
        sequence(n);
    }*/
}