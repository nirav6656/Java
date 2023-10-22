
public class Main {
    public static void main(String[] args) {

        String playername = "Tim";
        int position = 10;
        int score = 500;
        displayhighscoreposition("Tim",position);
        calculatehighscoreposition(score);
    }
    public static void displayhighscoreposition(String playername, int position){
        System.out.println("The " + playername + " managed to get into " + position + " position on the high score list");
    }

    public static void calculatehighscoreposition(int score) {

        if(score>1000){
            System.out.println("1");
        }
        else if(score>= 500 && score<=1000){
            System.out.println("2");
        }
        else if(score>= 100 && score<=500){
            System.out.println("3");
        }
        else{
            System.out.println("4");
        }
    }
}
