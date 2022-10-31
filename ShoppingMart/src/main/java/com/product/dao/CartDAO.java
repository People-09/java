package com.product.dao;

import java.util.ArrayList;

import com.product.Model.Cloth;
import com.product.Model.Electronics;
public interface CartDAO {

	public void buyElectItem(Electronics electronics);
    public ArrayList<Electronics> displayElectItem();
    public void buyClothItem(Cloth cloth);
}
