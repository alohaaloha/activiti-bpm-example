package com.example.dto;

import java.util.ArrayList;
import java.util.Map;

/**
 * Created by aloha on 24-Jan-17.
 */
public class ExecutionDTO {

    /**
     * task id / process key
     * */
    private String id;


    /**
     * list of form properties
     * each property is map with two key/val pairs
     * id:propertyId
     * value:propertyValue
     * */
    private ArrayList<Map<String, String>> formProperties;


    public ExecutionDTO(){}

    public ExecutionDTO(String id, ArrayList<Map<String, String>> formProperties) {
        this.id = id;
        this.formProperties = formProperties;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ArrayList<Map<String, String>> getFormProperties() {
        return formProperties;
    }

    public void setFormProperties(ArrayList<Map<String, String>> formProperties) {
        this.formProperties = formProperties;
    }
}
