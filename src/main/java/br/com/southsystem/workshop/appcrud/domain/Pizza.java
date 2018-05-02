package br.com.southsystem.workshop.appcrud.domain;

import br.com.southsystem.workshop.appcrud.enumerators.Size;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.List;

@Document(collection = "pizza")
public class Pizza {
Peofessor charo pra c;..... mas amo 
    @Id
    private String id;

    private List<String> flavours = new ArrayList<>();

    private Size size = Size.SMALL;

    public List<String> getFlavours() {
		return flavours;
	}

	public void setFlavours(List<String> flavours) {
		this.flavours = flavours;
	}

	public Size getSize() {
		return size;
	}

	public void setSize(Size size) {
		this.size = size;
	}

	public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
