//Johnny's Code modified by:Briyana Chataigne
import java.util.Scanner;

 class Dragon {
	private String color;
	private String ability;
	private int size;
   private int level;
	
	public Dragon(){
		this("red", "fire", 3, 15);
	}
	public Dragon(String c, String a, int s, int l){
		setColor(c);
		setAbility(a);
		setSize(s);
      setLevel(l);
	}
	public void setColor(String c){
		color = c;
	}
	public void setAbility(String a){
		ability = a;
	}
	public void setSize(int s){
		size = s;
	}
   public void setLevel(int l){
      level = l;
   }
	public String getColor(){
		return color;
	}
	public String getAbility(){
		return ability;
	}
	public int getSize(){
		return size;
	}
   public int getLevel(){
      return level;
   }
	public String toString(){
		return "\nColor:" + color +
				"\nAbility:" + ability +
				"\nSize:" + size +
            "\nLevel:" + level;
	}
}
//====DragonDriver===
 public class JDragonDriver {
 	public static void main(String args[]) {
		int i = 0;
		String name = "";
		int j = 0;
		System.out.println("How many Dragons do you wish to conquer?");
		Scanner scnr = new Scanner(System.in);
		int numDragon = scnr.nextInt();
		Dragon[] dragonsNum = new Dragon[numDragon];
		
		
		for (i = 0; i < numDragon; ++i){
		
		dragonsNum[i] = new Dragon();
		
		System.out.println("What is the color of dragon number " +(i+1));
		name = scnr.next();
		dragonsNum[i].setColor(name);
		
		System.out.println("What is the ability of dragon number "+ (i+1));
		name = scnr.next();
		dragonsNum[i].setAbility(name);
		
		System.out.println("What is the size of dragon number(numbers only) " +(i+1) );
		j = scnr.nextInt();
		dragonsNum[i].setSize(j);
		
		System.out.println("What is the level of dragon number(numbers only) " +(i+1) );
		j = scnr.nextInt();
		dragonsNum[i].setLevel(j);

		for(int a = 0;a < 1; ++a ){
		System.out.println(dragonsNum[i]);
		}
		
		
			}
	
		
		}
 }
 //===End DragonDriver===
