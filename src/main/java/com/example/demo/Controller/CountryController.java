package com.example.demo.Controller;

import com.example.demo.Model.Country;
import com.example.demo.Service.CountryService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CountryController {

    private final CountryService countryService;

    public CountryController(CountryService countryService) {
        this.countryService = countryService;
    }


    @PostMapping ("/addCountry")
    public ResponseEntity<Country> addCountry(@RequestBody Country country){
        return ResponseEntity.ok(countryService.addCountry(country));

    }

    @GetMapping("/getName")
    public ResponseEntity<List<Country>> getName(){
       return ResponseEntity.ok(countryService.getCountry());    }

    @PutMapping("/editCountry")
    public ResponseEntity<Country> editCountry(@RequestBody Country country){
        return  ResponseEntity.ok(countryService.EditCountry(country));
    }
    @DeleteMapping("/deleteCountry")
    public boolean deleteData(@RequestBody Country country){
        int id=country.getId();
        return countryService.deleteCountry(id);
    }

}
