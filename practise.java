class Practise {
    public static void main(String args[]) {
        String str = "aaaabbbcc";
        String ans = compression(str);
        System.out.println(ans);
    }

    static String compression(String str) {
        StringBuilder ans = new StringBuilder("");

        int numbers = 0;
        for (int i = 0; i < str.length(); i++) {
            if (i == str.length() - 1) {
                if ((numbers + 1) == 0 || (numbers + 1) == 1) {
                    ans.append("" + str.charAt(i));
                } else {
                    ans.append("" + str.charAt(i) + (numbers + 1));
                }

            }
            else{

                if (str.charAt(i) == str.charAt(i + 1)) {
                    numbers++;
                } else {
                    numbers = numbers + 1;
                    if (numbers == 1) {
                        ans.append("" + str.charAt(i));
                    } else {
                        ans.append("" + str.charAt(i) + numbers);
                    }
                    numbers = 0;
                }
            }

        }
        return ans.toString();
    }
}