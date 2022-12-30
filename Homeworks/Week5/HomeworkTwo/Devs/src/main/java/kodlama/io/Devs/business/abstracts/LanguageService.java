package kodlama.io.Devs.business.abstracts;

import java.util.List;

import kodlama.io.Devs.business.requests.languages.CreateLanguageRequest;
import kodlama.io.Devs.business.requests.languages.DeleteLanguageRequest;
import kodlama.io.Devs.business.requests.languages.UpdateLanguageRequest;

import kodlama.io.Devs.business.responses.GetAllLanguagesResponse;
import kodlama.io.Devs.business.responses.GetLanguageByIdResponse;

public interface LanguageService {
    
    List<GetAllLanguagesResponse> getAll();

    void add(CreateLanguageRequest createLanguageRequest);

    void delete(DeleteLanguageRequest deleteLanguageRequest);

    void update(UpdateLanguageRequest updateLanguageRequest);

    GetLanguageByIdResponse getById(int id);
}
