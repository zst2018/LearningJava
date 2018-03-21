package cn.itcast.game;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthScrollBarUI;

/**
 * @author 作者 E-mail:
 * @version 创建时间：2018年2月3日 下午4:32:42 类说明
 */
public class GuessNumber {
	private GuessNumber() {
	}

	public static void start() {
		int number = (int) (Math.random() * 100) + 1;
		int count = 0;
		while (true) {
			Scanner sc = new Scanner(System.in);
			System.out.println("qingshurushuju");
			int guessNumber = sc.nextInt();
			count++;
			if (guessNumber > number) {
				System.out.println("shuru shuju da l ");
			} else if (guessNumber < number) {
				System.out.println("shurushuju xiao l ");
			} else {
				System.out.println("gongxi " + count);
				break;
			}
		}
	}

}
