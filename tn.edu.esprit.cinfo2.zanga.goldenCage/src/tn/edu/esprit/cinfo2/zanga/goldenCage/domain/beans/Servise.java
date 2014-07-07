package tn.edu.esprit.cinfo2.zanga.goldenCage.domain.beans;

/**
 * 
 * @author Aymen
 * 
 */
public class Servise {

	private int id;
	private String name;
	private String description;
	private Double price;
	private int stock;
	private String Image;
	private int idProvider;
	private int idCategory;

	public Servise() {
	}

	public Servise(int id, String name, String description, Double price,
			int stock, String image, int idProvider, int idCategory) {
		this.id = id;
		this.name = name;
		this.description = description;
		this.price = price;
		this.stock = stock;
		Image = image;
		this.idProvider = idProvider;
		this.idCategory = idCategory;
	}

	@Override
	public String toString() {
		return "Servise [id=" + id + ", name=" + name + ", description="
				+ description + ", price=" + price + ", stock=" + stock
				+ ", Image=" + Image + ", idProvider=" + idProvider
				+ ", idCategory=" + idCategory + "]";
	}

	public int getIdCategory() {
		return idCategory;
	}

	public void setIdCategory(int idCategory) {
		this.idCategory = idCategory;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Image == null) ? 0 : Image.hashCode());
		result = prime * result
				+ ((description == null) ? 0 : description.hashCode());
		result = prime * result + id;
		result = prime * result + idCategory;
		result = prime * result + idProvider;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((price == null) ? 0 : price.hashCode());
		result = prime * result + stock;
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
		Servise other = (Servise) obj;
		if (Image == null) {
			if (other.Image != null)
				return false;
		} else if (!Image.equals(other.Image))
			return false;
		if (description == null) {
			if (other.description != null)
				return false;
		} else if (!description.equals(other.description))
			return false;
		if (id != other.id)
			return false;
		if (idCategory != other.idCategory)
			return false;
		if (idProvider != other.idProvider)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (price == null) {
			if (other.price != null)
				return false;
		} else if (!price.equals(other.price))
			return false;
		if (stock != other.stock)
			return false;
		return true;
	}

	public String getImage() {
		return Image;
	}

	public void setImage(String image) {
		Image = image;
	}

	public int getIdProvider() {
		return idProvider;
	}

	public void setIdProvider(int idProvider) {
		this.idProvider = idProvider;
	}

}
