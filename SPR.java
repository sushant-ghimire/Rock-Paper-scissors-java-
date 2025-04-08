
import java.util.Scanner;

public class SPR {

    String botChoice() {

        String r;
        int bot_choice = (int) (Math.random() * 3 + 1);
        switch (bot_choice) {
            case 1:
                r = "rock";
                return r;

            case 2:
                r = "paper";
                return r;

            default:
                r = "scissor";
                return r;
        }
    }

    String getdata() {
        System.out.println("Enter your choice:");
        Scanner input = new Scanner(System.in);
        String data = input.nextLine();
        data = data.toLowerCase();
        return data;
    }

    String result(String data, String r) {

        if (r.equals(data)) {
            return "Draw!!!";
        } else if (r.equals("rock") && data.equals("paper")) {
            return "YOU WIN !!";
        } else if (r.equals("paper") && data.equals("scissor")) {
            return "YOU WIN !!";
        } else if (r.equals("scissor") && data.equals("rock")) {
            return "YOU WIN !!";
        } else {
            return "YOU lose !!";
        }
    }

    public static void main(String[] args) {
        while (true) {

            String result;
            SPR obj = new SPR();
            String data;
            while (true) {
                data = obj.getdata();
                if (data.equals("rock") || data.equals("paper") || data.equals("scissor")) {
                    break;
                }

                if (data.equals("0")) {
                    System.exit(0);
                }
            }

            System.out.println("Your Choice:" + data);

            String computer = obj.botChoice();

            System.out.println("Computer Choice:" + computer);

            result = obj.result(data, computer);
            System.out.println(result);
            System.out.println("Enter 0 if you want to exit");
        }

    }
}
