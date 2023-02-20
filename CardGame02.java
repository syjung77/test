package cardGame;

public class CardGame02 {
	
	public static void main(String[] args) {
			
			// loop로 개선
			// 첫번째 카드
			int i = (int) (Math.random() * 4 + 1);
			int j = (int) (Math.random() * 13 + 1);
			System.out.println("1카드는 " + i + "모양의 " + j+"번째 카드");
			
			// 두번째 카드
			int i1 = (int) (Math.random() * 4 + 1);
			int j1 = (int) (Math.random() * 13 + 1);
			if(i==i1)
				i1 = (int) (Math.random() * 4 + 1);
			else if(j==j1)
				j1 = (int) (Math.random() * 13 + 1);
				System.out.println("2카드는 " + i1 + "모양의 " + j1+"번째 카드");
	
		}
}
