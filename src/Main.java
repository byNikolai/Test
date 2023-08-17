public class Main {
    public static void main(String[] args) {
//        Напишите код, с помощью которого можно разделить строку на части.
        String string = "My name is Nikolai";
        String[] words = string.split(" ");
        for (String word : words) {
            System.out.println(word);

        }

    }
}