package test1;


import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Test1Main {

	public static void main(String[] args) {
			
		int[] list_dice = new int[6];
		if (args.length != 0) {
			Random dice = new Random();
			List<Integer> inList = new ArrayList<>();
			int count=Integer.parseInt(args[0]);
			for (int index = 0; index < count; index++) {
				int tmp = dice.nextInt(6) + 1;
				inList.add(tmp);
			}

			for (var in : inList) {
				list_dice[in - 1]++;
			}

//			System.out.println(inList);
//			System.out.println(list_dice);
			for (int index = 1; index < 7; index++) {
				System.out
						.println(index + "] : " + ((double) list_dice[index - 1] / count * 100) + "%");
			}

		}

		else {
			return;
		}
	} /* endof main(String[] ) */
} /* endof Class::TestMain */
