public class Test {
	public static void main(String[] args) {
		WalkieTalkie [] walkieTalkie = new WalkieTalkie ("WT1111", 2);
		for (int i=0;i<4;i++) {
			for(int j=0; j<4;j++) {
				if(i != j) {
					walkieTalkie[i].AddListener(walkieTalkie[j]);
				}
			}
		}
	}
}