package rcw;

import java.util.List;

import rcw.manager.RecipeManager;
import rcw.model.RecipeBuilder.Recipe;

public class Main {

    /**
     * 引数に実行時に必要なデータを持たせます
     *
     * @param args レシピデータがあるパス
     */
    public static void main(String args[]) {
        if (args.length != 1) {
            // 引数に各種データ（レシピのパスなど）を持たせる
            // 想定外のデータ数であれば例外を吐く
            throw new IllegalArgumentException();
        }
        String recipe_data_path = args[0];
        RecipeManager manager = new RecipeManager();
        List<Recipe> recipes = manager.loadFromFile(recipe_data_path);

        for (Recipe recipe : recipes) {
            System.out.println(recipe.getTitle());
        }

    }

}
