package com.gokul.android_test_library;


import android.util.Log;

import com.google.gson.JsonObject;

public class Customer {
    private String firstName;
    private String lastName;
    private String mobile;
    private String VRN;
    private String insurer;
    private String vehicleMake;
    private String vehicleModel;
    private String vehicleColor;
    private String vehicleYear;


    public Customer(String custFirstName,
                    String custLastName,
                    String custMobile,
                    String custVRN,
                    String custInsurer) {
        firstName = custFirstName;
        lastName = custLastName;
        mobile = custMobile;
        VRN = custVRN;
        insurer = custInsurer;
        //setting default values for vehicle while the customer is created
        //
        setVehicle("ALFA ROMEO","MITO LUSSO T 120","BLACK","2009");

    }


    public void setVehicle(String make,String model, String color, String year){
        vehicleMake = make;
        vehicleModel = model;
        vehicleColor = color;
        vehicleYear =  year;
        JsonObject customerJSON = new JsonObject();
        customerJSON.addProperty("firstName", firstName);
        customerJSON.addProperty("lastName", lastName);
        customerJSON.addProperty("vrn", VRN);
        customerJSON.addProperty("telephone", mobile);
        customerJSON.addProperty("vehicleMake", vehicleMake);
        customerJSON.addProperty("vehicleModel", vehicleModel);
        customerJSON.addProperty("vehicleColor", vehicleColor);
        customerJSON.addProperty("vehicleYear", vehicleYear);
        Log.e("",""+customerJSON);
    }

    public void setVehicleMake(String vehicleMake) {
        this.vehicleMake = vehicleMake;
    }

    public void setVehicleModel(String vehicleModel) {
        this.vehicleModel = vehicleModel;
    }

    public void setVehicleColor(String vehicleColor) {
        this.vehicleColor = vehicleColor;
    }

    public void setVehicleYear(String vehicleYear) {
        this.vehicleYear = vehicleYear;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getVRN() {
        return VRN;
    }

    public void setVRN(String VRN) {
        this.VRN = VRN;
    }

    public String getInsurer() {
        return insurer;
    }

    public void setInsurer(String insurer) {
        this.insurer = insurer;
    }

    public JsonObject buildJSON(){
        JsonObject customerJSON = new JsonObject();
        customerJSON.addProperty("firstName", firstName);
        customerJSON.addProperty("lastName", lastName);
        customerJSON.addProperty("vrn", VRN);
        customerJSON.addProperty("telephone", mobile);
        customerJSON.addProperty("vehicleMake", vehicleMake);
        customerJSON.addProperty("vehicleModel", vehicleModel);
        customerJSON.addProperty("vehicleColor", vehicleColor);
        customerJSON.addProperty("vehicleYear", vehicleYear);
        //need to finalize on insurer and tenant parameters with cloud team
        if(insurer!= null && insurer.trim().length()>0)
            customerJSON.addProperty("insurer", insurer);
        customerJSON.addProperty("tenantID", "tenant01");
        return customerJSON;
    }


}
