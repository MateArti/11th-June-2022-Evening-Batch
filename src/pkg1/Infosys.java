package pkg1;

public class Infosys {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="8#%%@info#sys@";
		
		
		String num = str.replaceAll("[0-9 # @ %]", "");
		System.out.println(num);

	}

}
