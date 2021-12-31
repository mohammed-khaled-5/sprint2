package com.example.demo;
import java.util.ArrayList;
import java.util.List;
import com.example.demo.Core.Customer;
import com.example.demo.Core.Driver;
import com.example.demo.application.IuserService;
import com.example.demo.application.userService;
import org.springframework.web.bind.annotation.*;

@RestController
public class userController {
    private IuserService service = new userService();
    //customer calls
    @PostMapping("/customer/add")
    public Boolean add(@RequestBody Customer c) {
        return service.addCustomer(c);
    }
    @GetMapping("/customer")
    public List<Customer> getAllCustomers() {
        return service.getAllCustomers();
    }
    @PostMapping("/customer/login")
    public Boolean login(@RequestBody Customer c) {
        return service.CustomerLogin(c.getuserName(),c.getPassword());
    }
    //driver calls
    @PostMapping("/driver/addFavArea")
    public Boolean addArea(@RequestBody Driver d) {
        return service.FavArea(d.getFavArea(), d.getId());
    }
    @PostMapping("/driver/add")
    public Boolean add(@RequestBody Driver d) {
        return service.adddriver(d);
    }
    @GetMapping("/driver/{id}/verify")
    public Boolean verify(@PathVariable int id) {
        return service.verifyRegistration(id);
    }
    @GetMapping("/driver")
    public List<Driver> getAllDrivers() {
        return service.getAllDrivers();
    }
    @PostMapping("/driver/login")
    public Boolean login(@RequestBody Driver d) {
        return service.DriverLogin(d.getuserName(),d.getPassword());
    }
}
