package com.example.dcart;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ShoppingCartList extends ArrayList<Item> {
    private Map<String, Integer> mMap = new HashMap<>();
    private static ShoppingCartList ourInstance = new ShoppingCartList();
    public static ShoppingCartList getInstance(){
        return ourInstance;
    }
    private ShoppingCartList(){
        super();
    }
}
