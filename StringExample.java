public class StringExample {
        public static void main(String[] args) {
            String text = "Hello";
            System.out.println(text.length());
            text = text.concat(" There");
            System.out.println(text);
            text = text.substring(1);
            System.out.println(text);
            text = text.substring(3, 6);
            System.out.println(text);
        }
}