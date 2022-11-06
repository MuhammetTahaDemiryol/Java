package Kodlama.io.Devs.webApi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import Kodlama.io.Devs.business.abstracts.ProgrammingLanguageService;
import Kodlama.io.Devs.entities.concretes.ProgrammingLanguage;

@RequestMapping("/api/languages")
@RestController
public class ProgrammingLanguagesController {
    
    private ProgrammingLanguageService languageService;

    @Autowired
    public ProgrammingLanguagesController(ProgrammingLanguageService programmingLanguageService) {
        this.languageService = programmingLanguageService;
    }

    @GetMapping("/getall")
    public List<ProgrammingLanguage> getAll(){
        return languageService.getAll();
    }

    @GetMapping("/getById/{id}")
    public ProgrammingLanguage getById(@PathVariable int id){
        return languageService.getById(id);
    }

    @PostMapping("/add-programminglanguage")
    public void add(@RequestBody ProgrammingLanguage programmingLanguage) throws Exception {
        languageService.add(programmingLanguage);
    }

    @DeleteMapping("/delete-programminglanguage")
    public void deleteById(@RequestParam int id) {
        languageService.deleteById(id);
    }
    
    @PutMapping("/update-programminglanguage")
    public void update(@RequestBody ProgrammingLanguage programmingLanguage) {
        languageService.update(programmingLanguage);
    }

}
