package edu.sjsu.cmpe.objects;

import java.util.Date;

import org.apache.james.mime4j.field.datetime.DateTime;

public class SensorObject {

	private int objectId;
	private int objectInstanceId;

	private boolean vehicleDetected;
	private Date vehicleDetectionTimestamp;

	public SensorObject() {

		this.objectId = 10;
		this.objectInstanceId = 0;
	}

	public SensorObject(boolean preSet) {

		this.objectId = 10;
		this.objectInstanceId = 0;
//		this.vehicleDetected = true;
//		vehicleDetectionTimestamp = new Date();
		this.vehicleDetected = false;
		vehicleDetectionTimestamp = null;
	}
	
	public void reset() {
		this.objectId = 10;
		this.objectInstanceId = 0;
		this.vehicleDetected = false;
		vehicleDetectionTimestamp = null;	
	}
	
	public void setEntry(Date detectionTimestamp) {
		this.vehicleDetected = true;
		vehicleDetectionTimestamp = detectionTimestamp;
	}

	public String getResourceDescription(int resourceId) {

		if(vehicleDetected == true) {
//			Date date = new Date();
//			date.toString();
			return String.valueOf(vehicleDetectionTimestamp.getTime());
		}else
			return "";
		
//		switch (resourceId) {
//		case 0:
//			return "vehicleDetected";
//		default:
//			return "error";
//		}
	}

	public int getObjectId() {
		return objectId;
	}

	public void setObjectId(int objectId) {
		this.objectId = objectId;
	}

	public int getObjectInstanceId() {
		return objectInstanceId;
	}

	public void setObjectInstanceId(int objectInstanceId) {
		this.objectInstanceId = objectInstanceId;
	}

	public boolean isVehicleDetected() {
		return vehicleDetected;
	}

	public void setVehicleDetected(boolean vehicleDetected) {
		this.vehicleDetected = vehicleDetected;
	}

	public Date getVehicleDetectionTimestamp() {
		return vehicleDetectionTimestamp;
	}

	public void setVehicleDetectionTimestamp(Date vehicleDetectionTimestamp) {
		this.vehicleDetectionTimestamp = vehicleDetectionTimestamp;
	}
}
