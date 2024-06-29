package kadai_021;

import java.util.HashMap;

public class Dictionary_Chapter21 {

//	public static void main(String[] args) {
	public void search(String array[]) {
		// TODO 自動生成されたメソッド・スタブ
		boolean flag = false;
		HashMap<String,String> dicMap = new HashMap<String,String>();
		
		dicMap.put("apple","りんご");
		dicMap.put("peach","桃");
		dicMap.put("banana","バナナ");
		dicMap.put("lemon","レモン");
		dicMap.put("pear","梨");
		dicMap.put("kiwi","キウィ");
		dicMap.put("strawberry","いちご");
		dicMap.put("grape","ぶどう");
		dicMap.put("muscat","マスカット");
		dicMap.put("cherry","さくらんぼ");
		
		
		for(int i = 0; i < array.length; i++) {
		 
			for(String itm : dicMap.keySet()) {
				 if(array[i] == itm) {
					 System.out.println(itm + "の意味は" + dicMap.get(itm));
					 flag = true;
					 break;
				 }	 
			}
			
			if (!flag) {
				System.out.println(array[i] + "は辞書に存在しません");
			}
			flag = false;
		 }
		

	
	};
	

}
