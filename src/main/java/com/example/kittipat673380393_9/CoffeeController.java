package com.example.kittipat673380393_9;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class CoffeeController {

    @Autowired
    private CoffeeService coffeeService;

    // GET /coffees
    @GetMapping("/coffees")
    public List<Coffee> getAllCoffee() {
        return coffeeService.getAllCoffee();
    }

    // GET /coffees/{id}
    @GetMapping("/coffees/{id}")
    public Coffee getCoffeeById(@PathVariable Long id) {
        return coffeeService.getCoffeeById(id);
    }

    // POST /coffees
    @PostMapping("/coffees")
    public Coffee addCoffee(@RequestBody Coffee coffee) {
        return coffeeService.addCoffee(coffee);
    }

    // PUT /coffees/{id}
    @PutMapping("/coffees/{id}")
    public Coffee updateCoffee(@PathVariable Long id,
            @RequestBody Coffee coffee) {

        return coffeeService.updateCoffee(id, coffee);
    }

    // DELETE /coffees/{id}
    @DeleteMapping("/coffees/{id}")
    public String deleteCoffee(@PathVariable Long id) {

        if (coffeeService.deleteCoffee(id)) {
            return "Delete Success";
        }

        return "Coffee Not Found";
    }

}