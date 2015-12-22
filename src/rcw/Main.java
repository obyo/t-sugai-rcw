package rcw;

import java.util.List;

import rcw.manager.RecipeManager;
import rcw.model.RecipeBuilder.Recipe;

public class Main {
	
	private static final String RECIPE_DATA = "recipe-data.txt";
	
	public static void main(String args[]){
	    RecipeManager manager = new RecipeManager();
	    List<Recipe> recipes = manager.loadFromFile(RECIPE_DATA);
	    
	    for(Recipe recipe : recipes){
	    	System.out.println(recipe.getTitle());
	    }
	
	}

}
