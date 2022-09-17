package Homeworks.Week1;

public class stringsDemo {

    public static void main(String... args) {
        String message = "    Weather is beatiful today. ";
        System.out.println(message);
        
        System.out.println("Count :" + message.length());
        System.out.println("Fifth char :" + message.charAt(4));
        System.out.println(message.concat("Cheers!"));
        System.out.println(message.startsWith("A"));
        System.out.println(message.endsWith("."));
        char[] chars = new char[6];
        message.getChars(0, 5, chars, 0);
         System.out.println(chars);
         System.out.println(message.indexOf("is"));
         System.out.println(message.lastIndexOf("a"));
         
         String newMessage=message.replace(' ','-');
         System.out.println(message.replace(' ','-'));
         System.out.println(newMessage);
         System.out.println(message.substring(2));
         System.out.println(message.substring(2,8));
         
        for (String word : message.split(" ")) {
            System.out.println(word);
        }

        System.out.println(message.toLowerCase());
        System.out.println(message.toUpperCase());
        System.out.println(message.trim());

    }

}
