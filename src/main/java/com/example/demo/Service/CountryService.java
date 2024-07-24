package com.example.demo.Service;

import com.example.demo.Model.Country;
import com.example.demo.Repository.CountryRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CountryService {
    private final CountryRepository countryRepository;

    public CountryService(CountryRepository countryRepository) {
        this.countryRepository = countryRepository;
    }


    public Country addCountry(Country country){
        return countryRepository.save(country);
    }

    public List<Country> getCountry(){
        return countryRepository.findAll();
    }

    public Country EditCountry(Country country){
        return countryRepository.save(country);
    }
    public boolean deleteCountry(int id){
       Optional<Country> country=countryRepository.findById(id);
       if(country.isPresent()){
           countryRepository.delete(country.get());
           return   true;
       }
       return false;


    }
}
