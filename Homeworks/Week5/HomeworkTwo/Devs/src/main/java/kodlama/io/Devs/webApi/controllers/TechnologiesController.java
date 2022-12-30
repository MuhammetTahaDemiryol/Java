package kodlama.io.Devs.webApi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlama.io.Devs.business.abstracts.TechnologyService;
import kodlama.io.Devs.business.requests.technologies.CreateLanguageTechnologyRequest;
import kodlama.io.Devs.business.requests.technologies.DeleteLanguageTechnologyRequest;
import kodlama.io.Devs.business.requests.technologies.UpdateLanguageTechnologyRequest;
import kodlama.io.Devs.business.responses.GetAllTechnologiesResponse;
import kodlama.io.Devs.business.responses.GetTechnologyByIdResponse;

@RestController
@RequestMapping("/api/technologies")
public class TechnologiesController {
    
    TechnologyService languageTechnologyService;

    @Autowired
    public TechnologiesController(TechnologyService service){

        super();
        this.languageTechnologyService = service;

    }

    @GetMapping("/getall")
	public List<GetAllTechnologiesResponse> getAll(){
		return languageTechnologyService.getAll();
	}
	
	@PostMapping("/add")
	public void add(CreateLanguageTechnologyRequest createLanguageTechnologyRequest) {
		this.languageTechnologyService.add(createLanguageTechnologyRequest);
	}
	
	@DeleteMapping("/delete")
	public void delete(DeleteLanguageTechnologyRequest deleteLanguageTechnologyRequest) {
		this.languageTechnologyService.delete(deleteLanguageTechnologyRequest);
	}
	
	@PutMapping("/update")
	public void update(UpdateLanguageTechnologyRequest updateLanguageTechnologyRequest) {
		this.languageTechnologyService.update(updateLanguageTechnologyRequest);
	}

	@GetMapping("/getbyid")
	public GetTechnologyByIdResponse getById(int id){
		return languageTechnologyService.getById(id);
	}


}
