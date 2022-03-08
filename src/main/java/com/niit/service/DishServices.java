package com.niit.service;

import com.niit.model.Dishes;

import java.util.List;

public interface DishServices {

   public Dishes addDishesToDb(Dishes dishes);

   List<Dishes> viewDishes();

//   boolean deleteDishesById(int id) throws Exception;
   String deleteDishesById(int id) throws Exception;
}
