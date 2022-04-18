package dataStructures.GraphImplementation;

public abstract class DataElement {
	
	protected String name;
	protected int attractivityScore;
	protected int nFreeHotels;
	protected int reviewData;
	
	public abstract String getName();
	public int getAttractivity() {
		return attractivityScore;
	}
	public int getNFreeHotels() {
		return nFreeHotels;
	}
	public int getReviewData() {
		return reviewData;
	}

}
