public class ChatBotRunner {
    public static void main(String []args){
        ChatBot debbie = new ChatBot("debbie", 15);
        debbie.greeting("Sam");
        debbie.favoriteNumber(24);
        System.out.println("There are" + debbie.convertFeetToMeters(15) + "meters");
        System.out.println("The sum is + " + debbie.addNumbers(12, 12, 12));
        System.out.println(debbie.goodbye());
        System.out.println(debbie.multiplication(1, 2));
        System.out.println(debbie.joke());



    }
}
