package LatestRestAssured;


public  enum resourceEn {

	AddPlaceAPI("/maps/api/place/add/json"), GetPlaceAPI("/maps/api/place/get/json"),
	deletePlaceAPI("/maps/api/place/delete/json");

	private String resource;

	resourceEn(String resource) {
		this.resource = resource;
	}
	
	public String getResource()
	{
		return resource;
	}

}
