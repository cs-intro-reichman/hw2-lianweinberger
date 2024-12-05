//feedback

/*
Lian,
great work
Yam
*/

// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) {
            String cheer = args[0].toUpperCase();
            int num = Integer.parseInt(args[1]);
            String anLetters = "AEFHILMNORSX";
            for (int i = 0; i < cheer.length(); i++) {
                char c = cheer.charAt(i);
                boolean isA = anLetters.indexOf(c) == -1;
                System.out.println("Give me " + (isA ? "a  " : "an ") + c + ": " + c + "!");
            }
            System.out.println("What does that spell?");
            for (int i = 0; i < num; i++) {
                System.out.println("" + cheer + "!!!");
            }
        }
}
