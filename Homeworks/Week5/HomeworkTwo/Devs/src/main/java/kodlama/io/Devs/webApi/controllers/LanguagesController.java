package kodlama.io.Devs.webApi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlama.io.Devs.business.abstracts.LanguageService;
import kodlama.io.Devs.business.requests.languages.CreateLanguageRequest;
import kodlama.io.Devs.business.requests.languages.DeleteLanguageRequest;
import kodlama.io.Devs.business.requests.languages.UpdateLanguageRequest;
import kodlama.io.Devs.business.responses.GetAllLanguagesResponse;
import kodlama.io.Devs.business.responses.GetLanguageByIdResponse;


@RestController
@RequestMapping("/api/language")
public class LanguagesController {
    
    LanguageService languageService;

    @Autowired
    public LanguagesController(LanguageService service){
        super();
        this.languageService = service;
    }

    @GetMapping("/getall")
    public List<GetAllLanguagesResponse> getAll(){

        return languageService.getAll();

    }

    @PostMapping("/add")
    public void add(CreateLanguageRequest createLanguageRequest) throws Exception{

        this.languageService.add(createLanguageRequest);
        
    }

    @DeleteMapping("/delete")
    public void delete(DeleteLanguageRequest deleteLanguageRequest){

        this.languageService.delete(deleteLanguageRequest);
        
    }

    @PutMapping("/update")
    public void update(UpdateLanguageRequest updateLanguageRequest){

        this.languageService.update(updateLanguageRequest);
        
    }

    @GetMapping("/getbyid")
    public GetLanguageByIdResponse getById(int id){

        return languageService.getById(id);
        
    }

}
