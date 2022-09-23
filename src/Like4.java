public class Like4 {
    public static int getCount(String str) {
        int vowelsCount = 0;
        for(int i = 0; i < str.length(); i++) {
            switch(str.charAt(i)) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    vowelsCount++;
            }
        }
        return vowelsCount;
    }
}
