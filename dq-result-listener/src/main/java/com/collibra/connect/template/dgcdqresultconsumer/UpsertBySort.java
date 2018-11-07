package com.collibra.connect.template.dgcdqresultconsumer;

import java.util.Iterator;

import org.json.JSONArray;
import org.json.JSONObject;
import org.mule.api.annotations.param.Payload;
/**
 * 
 * @author gnaanagoguls
 *
 */
public class UpsertBySort {
	public JSONArray jsonToJavaObject(@Payload String jsonData) {
		JSONArray resultArray = new JSONArray();
		JSONObject jsonObject = new JSONObject(jsonData);
		@SuppressWarnings("unchecked")
		Iterator<String> Keys = jsonObject.keys();
		while(Keys.hasNext()){
			String key = Keys.next();
			JSONArray jsonArray = (JSONArray) jsonObject.getJSONArray(key);
			for(int i=0;i<jsonArray.length();i++){
				JSONObject aResultObject = (JSONObject) jsonArray.getJSONObject(i);
				resultArray.put(aResultObject);
			}
			
		}
		return resultArray;
		
	}
}
