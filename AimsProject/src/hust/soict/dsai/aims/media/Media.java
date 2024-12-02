package hust.soict.dsai.aims.media;

public abstract class Media implements Comparable<Media>{


		protected int id;
		protected String title;
		protected String category;
		protected float cost;

		
		public Media(int id, String title, String category, float cost) {
			this.id = id;
			this.title = title;
			this.category = category;
			this.cost = cost;
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getTitle() {
			return title;
		}

		public void setTitle(String title) {
			this.title = title;
		}

		public String getCategory() {
			return category;
		}

		public void setCategory(String category) {
			this.category = category;
		}

		public float getCost() {
			return cost;
		}

		public void setCost(float cost) {
			this.cost = cost;
		}
		
	    @Override
	    public boolean equals(Object obj) {

	        if (this == obj) {
	            return true;
	        }
	        
	        if (obj == null || getClass() != obj.getClass()) {
	            return false;
	        }
	        
	        Media media = (Media) obj;
	        return title != null && title.equals(media.title);
	    }

	    @Override
	    public int hashCode() {
	        return title != null ? title.hashCode() : 0;
	    }
	    @Override
	    public int compareTo(Media other) {

	        int titleComparison = this.title.compareTo(other.title);
	        if (titleComparison != 0) {
	            return titleComparison;  
	        }

	        return Float.compare(other.cost, this.cost);  
	    }
	    
	    @Override
	    public abstract String toString();
		public abstract void play(); 
}



