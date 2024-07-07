package java_basic_kadai.kadai_026;

import java.util.HashMap;
import java.util.Scanner;

public class Jyanken_Chapter26 {
	
	public String getMyChoice() {
		
		boolean validHand = false;
		String hand = "";
		
		Scanner scanner = new Scanner(System.in);
	
		while (!validHand) {
			System.out.println("自分のじゃんけんの手を入力しましょう");
			System.out.println("グーはrockのrを入力しましょう");
			System.out.println("チョキはscissorsのsを入力しましょう");
			System.out.println("パーはpaperのpを入力しましょう");
			
            hand = scanner.next();
            
            // Validate the hand
            if (isValidHand(hand)) {
                validHand = true;
            } else {
                System.out.println("r、s、pの入れずかを入力してください。");
            }
		}	
		
		scanner.close();
		return hand;
	
	}
	
	public static boolean isValidHand(String hand) {
        return hand.equals("r") || hand.equals("s") || hand.equals("p");
    }
	
	
	public String getRandom() {
//		Random random = new Random();
//        int hand = random.nextInt(3); // 0, 1, or 2
		int hand = (int) Math.floor(Math.random() * 3);
        switch (hand) {
            case 0:
                return "r";
            case 1:
                return "s";
            case 2:
                return "p";
            default:
                return "";
        }
	};
	
	public void playGame(String myChoice,String pcChoice) {
		HashMap<String,String> handMap = new HashMap<String,String>();
		handMap.put("r","グー");
		handMap.put("s","チョキ");
		handMap.put("p","パー");
		
		System.out.println("自分の手は" + myChoice + ",対戦相手の手は" + pcChoice);
		System.out.println("自分の手は" + handMap.get(myChoice) + ",対戦相手の手は" + handMap.get(pcChoice));
		
		if (myChoice.equals(pcChoice)) {
            System.out.println("あいこです"); 
        } else if ((myChoice.equals("r") && myChoice.equals("s")) ||
                   (myChoice.equals("s") && myChoice.equals("p")) ||
                   (myChoice.equals("p") && myChoice.equals("r"))) {
        	System.out.println( "自分の勝ちです");
        } else {
        	System.out.println( "自分の負けです");
        }
		
	};
	

}