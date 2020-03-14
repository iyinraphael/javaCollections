package collections;

public class Dogs
{
//Mark: - Fields (attibutes)
	private String breed;
	private int avgWeight;
	private boolean apartment;

	public Dogs(String breed, int avgWeight, boolean apartment)
	{
		this.breed = breed;
		this.avgWeight = avgWeight;
		this.apartment  apartment;
	}
//Mark: - getters and setters (behaviors)
	public String getBreed {
		return breed
	}

	public void setBreed(String breed)
	{
		this.breed = breed;
	}

	public int getAvgWeight()
	{
		return avgWeight;
	}

	public void setAvgWeight(int avgWeight)
	{
		this.avgWeight = avgWeight

	}

	public boolean isApartment()
	{
		return apartment;
	}

	public void setApartment(boolean apartment)
	{
		this.apartment = apartment
	}

	@Override public String toString() {
		String rtnStr = "breed" + " " + breed + "\n" +
						"avgWeight" + " " + avgWeight + "\n" +
						"apartment" + " " + apartment + "\n"; 
		return rtnStr;
	}

}