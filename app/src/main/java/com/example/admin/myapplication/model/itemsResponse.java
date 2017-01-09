package com.example.admin.myapplication.model;

import java.util.List;

/**
 * Created by Admin on 1/6/2017.
 */

public class itemsResponse {
    private List<items> itemsList;

    public List<items> getItemsList() {
        return itemsList;
    }

    public void setItemsList(List<items> itemsList) {
        this.itemsList = itemsList;
    }
}
