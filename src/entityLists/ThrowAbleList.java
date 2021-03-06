package entityLists;

import entities.ThrowAble;
import java.util.LinkedList;
import java.io.*;
import org.json.*;

public class ThrowAbleList {
	private final String filename = "throwAble.json";
	private LinkedList<ThrowAble> list = new LinkedList<>();
	
	public ThrowAbleList() {
		try {
            FileInputStream in = new FileInputStream(filename);
            JSONObject obj = new JSONObject(new JSONTokener(in));
            String [] names = JSONObject.getNames(obj);
            for (int i = 0; i < names.length; ++i) {
                if (!names[i].equals("")) {
                    ThrowAble throwAble = new ThrowAble();
                    throwAble.fromJson((JSONObject)obj.getJSONObject(names[i]));
                    list.add(throwAble);
                }
            }
            in.close();
        } catch (Exception ex) {
        	ex.printStackTrace();
        }
	}
	
	public LinkedList<ThrowAble> getList() {
		return list;
	}
	
	public void exportJSON() {
		JSONObject groupJson = new JSONObject();
        for (int i = 0; i < list.size(); ++i) {
            JSONObject oneJson = new JSONObject();
            oneJson.put("name", list.get(i).getName());
            oneJson.put("type", list.get(i).getType());
            oneJson.put("damage", list.get(i).getDamage());
            oneJson.put("quantity", list.get(i).getQuantity());
            groupJson.put(list.get(i).getName(), oneJson);
        }
        
        PrintWriter out;
        try {
            out = new PrintWriter(filename);
            out.println(groupJson.toString(1));
            out.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
	}
}