package rcw.model;

/**
 * レシピ情報を管理するクラス
 * @author TomoyukiSugai
 *
 */
public class RecipeBuilder {
	
	private String title;
	
	public RecipeBuilder title(String title){
		this.title = title;
		return this;
	}
	
	public Recipe build(){
		return new Recipe(this.title);
	}
	
	/**
	 * レシピを表すクラス
	 * @author TomoyukiSugai
	 *
	 */
	public class Recipe {
		
		private Recipe(String title){
			this.title = title;
		}
		
		private String title;
		
		/**
		 * レシピのタイトルを取得する
		 * @return
		 */
		public String getTitle(){
			return this.title;
		}
		
		// TODO toString() をオーバーライドする
		
	}
	
	
	
}
