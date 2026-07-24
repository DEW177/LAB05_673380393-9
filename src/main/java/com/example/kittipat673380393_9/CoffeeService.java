package com.example.kittipat673380393_9;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class CoffeeService {

    private List<Coffee> coffees = new ArrayList<>();

    public CoffeeService() {
        coffees.add(new Coffee(1L, "Espresso", 45.0));
        coffees.add(new Coffee(2L, "Latte", 55.0));
    }

    // GET ALL
    public List<Coffee> getAllCoffee() {
        return coffees;
    }

    // GET BY ID
    public Coffee getCoffeeById(Long id) {
        for (Coffee coffee : coffees) {
            if (coffee.getId().equals(id)) {
                return coffee;
            }
        }
        return null;
    }

    // POST
    public Coffee addCoffee(Coffee coffee) {
        Long id = (long) (coffees.size() + 1);
        coffee.setId(id);
        coffees.add(coffee);
        return coffee;
    }

    // PUT
    public Coffee updateCoffee(Long id, Coffee newCoffee) {

        for (Coffee coffee : coffees) {

            if (coffee.getId().equals(id)) {

                coffee.setName(newCoffee.getName());
                coffee.setPrice(newCoffee.getPrice());

                return coffee;
            }
        }

        return null;
    }

    // DELETE
    public boolean deleteCoffee(Long id) {

        for (Coffee coffee : coffees) {

            if (coffee.getId().equals(id)) {
                coffees.remove(coffee);
                return true;
            }
        }

        return false;
    }

}