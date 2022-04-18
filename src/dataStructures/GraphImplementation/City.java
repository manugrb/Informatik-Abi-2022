package dataStructures.GraphImplementation;

public class City extends DataElement{

	public City(String name, int attractivityScore, int nFreeHotels, int reviewData) {
		this.name = name;
		this.attractivityScore = attractivityScore;
		this.nFreeHotels = nFreeHotels;
		this.reviewData = reviewData;
	}
	
	@Override
	public String getName() {
		return "Stadt " + name;
	}

}
