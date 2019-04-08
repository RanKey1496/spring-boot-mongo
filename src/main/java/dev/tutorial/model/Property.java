package dev.tutorial.model;

import java.util.List;

public class Property {

	private String type;
	private String neighborhood;
	private String sector;
	private String city;
	private String stratum;
	private List<Image> images;
	private List<Facility> facilities;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getNeighborhood() {
		return neighborhood;
	}

	public void setNeighborhood(String neighborhood) {
		this.neighborhood = neighborhood;
	}

	public String getSector() {
		return sector;
	}

	public void setSector(String sector) {
		this.sector = sector;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getStratum() {
		return stratum;
	}

	public void setStratum(String stratum) {
		this.stratum = stratum;
	}

	public List<Image> getImages() {
		return images;
	}

	public void setImages(List<Image> images) {
		this.images = images;
	}

	public List<Facility> getFacilities() {
		return facilities;
	}

	public void setFacilities(List<Facility> facilities) {
		this.facilities = facilities;
	}

}
