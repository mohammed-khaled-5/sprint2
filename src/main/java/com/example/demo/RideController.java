package com.example.demo;

import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;

import com.example.demo.Core.Ride;
import com.example.demo.application.IRidesService;
import com.example.demo.application.RidesService;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.HttpClientErrorException.NotFound;

@RestController
public class RideController {
    private IRidesService service = new RidesService();

    @PostMapping("/rides/add")
    public Boolean add(@RequestBody Ride ride) {
        return service.add(ride);
    }
    @GetMapping("/rides")
    public List<Ride> getAll() {
        return service.getAll();
    }

    @GetMapping("/rides/{id}")
    public Ride get(@PathVariable int id) {
        return service.get(id);
    }

    @DeleteMapping("/rides/{id}/delete")
    public boolean EndRide(@PathVariable int id) {
        return service.deleteRide(id);
    }
}