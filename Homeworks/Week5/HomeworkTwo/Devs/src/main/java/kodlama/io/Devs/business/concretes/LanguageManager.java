package kodlama.io.Devs.business.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.io.Devs.business.constants.Messages;
import kodlama.io.Devs.business.abstracts.LanguageService;
import kodlama.io.Devs.business.requests.languages.CreateLanguageRequest;
import kodlama.io.Devs.business.requests.languages.DeleteLanguageRequest;
import kodlama.io.Devs.business.requests.languages.UpdateLanguageRequest;

import kodlama.io.Devs.business.responses.GetAllLanguagesResponse;
import kodlama.io.Devs.business.responses.GetLanguageByIdResponse;
import kodlama.io.Devs.dataAccess.abstracts.LanguageRepository;
import kodlama.io.Devs.entities.concretes.Language;

@Service
public class LanguageManager implements LanguageService{

    private LanguageRepository languageRepository;

    @Autowired
    public LanguageManager(LanguageRepository languageRepository){
        super();
        this.languageRepository = languageRepository;
    }

    @Override
    public List<GetAllLanguagesResponse> getAll() {
        List<Language> languages = languageRepository.findAll();
        List<GetAllLanguagesResponse> languagesResponses = new ArrayList<GetAllLanguagesResponse>();

        for(Language language: languages){

            GetAllLanguagesResponse response = new GetAllLanguagesResponse();
            response.setId(language.getId());
            response.setName(language.getName());

            languagesResponses.add(response);

        }

            return languagesResponses;
    }

    @Override
    public void add(CreateLanguageRequest createLanguageRequest)  {

        if (checkIfLanguageNameExists(createLanguageRequest.getName()) == false
                || checkIfNameIsEmpty(createLanguageRequest.getName()) == false) {
            return;
        }

        Language language = new Language();
        language.setName(createLanguageRequest.getName());
        languageRepository.save(language);
    }

    @Override
    public void delete(DeleteLanguageRequest deleteLanguageRequest) {
            
        if(checkIfId(deleteLanguageRequest.getId()) == false) {
            return;
        }
        
        languageRepository.deleteById(deleteLanguageRequest.getId());
        
    }

    @Override
    public void update(UpdateLanguageRequest updateLanguageRequest) {

        if (checkIfLanguageNameExists(updateLanguageRequest.getName()) == false
                || checkIfNameIsEmpty(updateLanguageRequest.getName()) == false
                || checkIfId(updateLanguageRequest.getId()) == false) {
            return;
        }

        Language language = new Language();
        language.setId(updateLanguageRequest.getId());
        language.setName(updateLanguageRequest.getName());
        languageRepository.save(language);
       
        
    }

    @Override
    public GetLanguageByIdResponse getById(int id) {
        
        if(checkIfId(id) == false) {
            return null;
        }
       
        Language language = languageRepository.findById(id).get();
        GetLanguageByIdResponse response = new GetLanguageByIdResponse();
        response.setName(language.getName());
        return response;
    }

    
    

    private boolean checkIfLanguageNameExists(String name) {
		Language language = this.languageRepository.getByName(name);
		if (language != null) {
			System.out.println(Messages.LANGUAGE_NAME_EXISTS + " : " + name);
			return false;
		}
		return true;
	}

	private boolean checkIfNameIsEmpty(String name) {
		if (name.equals("") || name.equals(null)) {
			System.out.println(Messages.LANGUAGE_NAME_EMPTY);
			return false;
		}
		return true;
	}

	private boolean checkIfId(int id) {
		if (!this.languageRepository.existsById(id)) {
			System.out.println(Messages.LANGUAGE_NOT_FOUND);
			return false;
		}
		return true;
	}

}
