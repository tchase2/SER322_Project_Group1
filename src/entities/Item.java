package entities;
import org.json.*;

public class Item {
	private String name;
	
	public Item() {	
	}
	
	public Item(String n) {
		this.name= n;
	}
	
	public JSONObject toJSON() {
		JSONObject json = new JSONObject();
		json.put("name", this.name);
		return json;
	}
	
	public void fromJson(JSONObject json) {
	    try {
	    	this.setValues(json.getString("name"));
	    } catch (Exception ex) {
	    	ex.printStackTrace();
	    }
	}
	
	public void setValues(String n) {
		this.name= n;
	}
	
	public String getName() {
		return name;
	}
}