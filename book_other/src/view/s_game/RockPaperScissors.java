package view.s_game;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        String[] options = {"石头", "剪刀", "布"};
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        int win = 0, lose = 0, tie = 0;
        int userChoice, computerChoice;

        System.out.println("欢迎使用剪刀石头布游戏！");
        System.out.println("请选择:\n1.石头\n2.剪刀\n3.布\n0.退出游戏");

        while (true) {
            System.out.print("请输入你的选择（1-3）：");
            userChoice = scanner.nextInt() - 1; // 将输入从1-3转换为0-2的索引

            if (userChoice == -1) {
                System.out.println("感谢游戏，再见！");
                System.out.println(
                    "你共进行了" + count + 
                    "局游戏，你赢了" + win + 
                    "局，输了" + lose + 
                    "局，平局" + tie + "局！"
                    );
                break;
            }

            if (userChoice < 0 || userChoice > 2) {
                System.out.println("无效的输入，请重新选择。");
                continue;
            }

            computerChoice = random.nextInt(3);
            count++;

            System.out.println("你选择了: " + options[userChoice]);
            System.out.println("计算机选择了: " + options[computerChoice]);

            if (userChoice == computerChoice) {
                System.out.println("平局！");
                tie++;
            } else if ((userChoice == 0 && computerChoice == 1) || 
                       (userChoice == 1 && computerChoice == 2) ||
                       (userChoice == 2 && computerChoice == 0)) {
                System.out.println("你赢了！");
                win++;
            } else {
                System.out.println("你输了！");
                lose++;
            }
        }
        
        scanner.close();
    }
}
