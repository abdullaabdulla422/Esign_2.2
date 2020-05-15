package com.ebs.rental.objects;

import com.ebs.rental.webutils.SoapUtils;

import org.json.JSONObject;

@SuppressWarnings("ALL")
public class Equipmentsubstatusdesc extends SoapUtils {

	private static final String TAG_RESULT = "Result";
	private static final String TAG_MESSAGE = "Message";

	private String Result;
	private String Message;

	public String getResult() {
		return Result;
	}

	private void setResult(String result) {
		Result = result;
	} 

	public static Equipmentsubstatusdesc parseUser(String response) throws Exception {
		Equipmentsubstatusdesc rental = new Equipmentsubstatusdesc();

		JSONObject userDetails = new JSONObject(response);

		rental.setResult(userDetails.getString(TAG_RESULT));

		return rental;
	}

	public static Equipmentsubstatusdesc parseMessage(String response) throws Exception {
		Equipmentsubstatusdesc rental = new Equipmentsubstatusdesc();

		JSONObject userDetails = new JSONObject(response);

		rental.setMessage(userDetails.getString(TAG_MESSAGE));

		return rental;
	}

	public String getMessage() {
		return Message;
	}

	private void setMessage(String message) {
		Message = message;
	}
}