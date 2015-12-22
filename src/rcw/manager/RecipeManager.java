package rcw.manager;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import rcw.model.RecipeBuilder;
import rcw.model.RecipeBuilder.Recipe;

public class RecipeManager {
	
	public List<Recipe> loadFromFile(String path){
	    List<Recipe> recipes = new ArrayList<>();
	    
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			String line = null;
			RecipeBuilder builder = new RecipeBuilder();
			long recipeCount = 1;
			while((line = br.readLine()) != null){
				builder.title(line);
				builder.id(recipeCount);
				recipes.add(builder.build());
				recipeCount++;
			}
			
			return recipes;
		} catch (FileNotFoundException e) {
			System.err.println("ファイルが見つかりませんでした : " + path);
			throw new RuntimeException(e);
		} catch (IOException e) {
			System.err.println("ファイルが読み込めませんでした : " + path);
			throw new RuntimeException(e);
		}
	}

}
