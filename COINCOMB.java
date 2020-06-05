
public class COINCOMB {
	public static int count =0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		COINcombination(new int [] {2,3,5,6,4} , 10,  "",  0);

	}
	
	public static void COINcombination(int []domin , int amount , String ans , int lastdomidx) {
		if(amount==0) {
			count++ ;
			System.out.println(count + " - " +ans);
			return;
		}
		for(int i=lastdomidx ; i<domin.length ; i++){
			if(amount>=domin[i]) {
				COINcombination(domin, amount-domin[i], ans+domin[i], i);
			}
		}
	}

}
