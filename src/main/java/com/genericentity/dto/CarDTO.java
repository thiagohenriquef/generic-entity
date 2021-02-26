package com.genericentity.dto;

import com.genericentity.entities.Car;

public class CarDTO {

	private Long id;
	private String model;
	private String color;
	private String licensePlate;

	public CarDTO(Long id, String model, String color, String licensePlate) {
		this.id = id;
		this.model = model;
		this.color = color;
		this.licensePlate = licensePlate;
	}

	public CarDTO() {
	}
	
	public CarDTO(Car car) {
		this.id = car.getId();
		this.model = car.getModel();
		this.color = car.getColor();
		this.licensePlate = car.getLicensePlate();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getLicensePlate() {
		return licensePlate;
	}

	public void setLicensePlate(String licensePlate) {
		this.licensePlate = licensePlate;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CarDTO other = (CarDTO) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}


}
