package assignment1;

import java.util.ArrayList;
import java.util.Collections;

public class Category {
   private String category;
   private ArrayList<String> choices;
   private String choose;
   public Category(String category, String[] choices, String choose) {
	   this.category = category;
	   this.choices = new ArrayList<String>();
	   for(int i = 0; i < choices.length; i++ ) {
		   this.choices.add(choices[i]);
	   }
	   
	   Collections.shuffle(this.choices);
	   this.choose = choose;
   }
   public String getCategory() {
	   return this.category;
   }
   public ArrayList<String>getChoices(){
	   return choices;
   }
   public String getChoose() {
	   return this.choose;
   }
}
