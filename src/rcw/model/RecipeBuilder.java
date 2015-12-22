package rcw.model;

/**
 * レシピ情報を管理するクラス
 * @author TomoyukiSugai
 *
 */
public class RecipeBuilder {
	
	private String title;
	private long id;
	
	public RecipeBuilder title(String title){
		this.title = title;
		return this;
	}

	public RecipeBuilder id(long id) {
		this.id = id;
		return this;
	}
	
	public Recipe build(){
		Recipe recipe = new Recipe(this.title);
		recipe.setId(this.id);
		return recipe;
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
		private long id;
		
		/**
		 * レシピのタイトルを取得する
		 * @return
		 */
		public String getTitle(){
			return this.title;
		}

		public void setId(long id) {
			this.id = id;
		}

		public long getId() {
			return id;
		}

		@Override
		public String toString() {
			StringBuilder sb = new StringBuilder();
			sb.append("id: ").append(id).append(" title:").append(title);
			return sb.toString();
		}
	}
	
	
	
}
