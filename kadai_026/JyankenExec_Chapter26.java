package java_basic_kadai.kadai_026;

public class JyankenExec_Chapter26 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		Jyanken_Chapter26 jyanken = new Jyanken_Chapter26();
		String myChoice = jyanken.getMyChoice();
		String pcChoice = jyanken.getRandom();
		
		jyanken.playGame(myChoice,pcChoice);

	}

}
