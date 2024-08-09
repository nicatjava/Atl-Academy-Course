package lesson37;

public class Test2 {
    public static void main(String[] args) {
        String sentence = "Hello world Java programming";
        StringBuilder sb = new StringBuilder(sentence);
        sb.reverse();
        String[] words = sb.toString().split(" ");
        for(int i = words.length-1; i >= 0; i--){
            System.out.print(words[i]);
            if(i != 0) {
                System.out.print(" ");
            }
        }

    }
}
