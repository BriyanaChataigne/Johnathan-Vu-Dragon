//Johnny's Code modified(ArrayList) by:Briyana Chataigne
import java.util.Scanner;
import java.util.ArrayList;

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
 public class JVDragonDriver {
 	public static void main(String args[]) {
		int i = 0;
		String color = "";
		String element = "";
		int size = 0;
		int level = 0;
		System.out.println("How many Dragons do you wish to conquer?");
		Scanner scnr = new Scanner(System.in);
		int numDragon = scnr.nextInt();
		ArrayList<Dragon> dragonsNum = new ArrayList<Dragon>(); 
		
		
		for (i = 0; i < numDragon; ++i){
		
		
		System.out.println("What is the color of dragon number " +(i+1));
		color = scnr.next();
		
		
		System.out.println("What is the ability of dragon number "+ (i+1));
		element = scnr.next();
		
		
		System.out.println("What is the size of dragon number(numbers only) " +(i+1) );
		size = scnr.nextInt();
		
		
		System.out.println("What is the level of dragon number(numbers only) " +(i+1) );
		level = scnr.nextInt();
		dragonsNum.add(new Dragon(color, element, size, level));
		

		for(int a = 0;a < 1; ++a ){
		System.out.println(dragonsNum.get(a).toString());
		}
		
		
			}
	
		
		}
 }
 //===End DragonDriver===
