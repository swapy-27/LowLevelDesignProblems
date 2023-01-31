import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of game u want ?");
        int n = sc.nextInt();

        Game game = new Game(n);
        System.out.println("Enter 0->Left 1->Right 2->Top 3->Bottom");

        int totalSum =0 ;
        while (totalSum!=2048){
            int input = sc.nextInt();
            while (input != 1 && input != 0 && input != 2 && input != 3) {
                System.out.println("Enter 0->Left 1->Right 2->Top 3->Bottom");
                input = sc.nextInt();
            }
            switch (input) {
                case 0:
                    totalSum=totalSum+game.moveLeft(totalSum);
                    break;
                case 1:
                    totalSum=totalSum+game.moveRight(totalSum);
                    break;
                case 2:
                    totalSum=totalSum+game.moveUp(totalSum);
                    break;
                case 3:
                    totalSum=totalSum+game.moveDown(totalSum);
                    break;
                default:
                    System.out.println("Some Error Occurred");
            }
        }

        System.out.println("GameOver You Won");

    }
}