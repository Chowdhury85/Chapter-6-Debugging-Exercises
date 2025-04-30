public class FixDebugSix4 {
    public static void main(String[] args) {
        String str = "Debugging";
        int count = 0;
        
        for (int i = 0; i < str.length(); i++) {
            char ch = Character.toLowerCase(str.charAt(i));
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }
        
        System.out.println("The string \"" + str + "\" contains " + count + " vowels");
    }
}
