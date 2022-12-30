package kodlama.io.Devs.business.abstracts;

import java.util.List;

import kodlama.io.Devs.business.requests.technologies.CreateLanguageTechnologyRequest;
import kodlama.io.Devs.business.requests.technologies.DeleteLanguageTechnologyRequest;
import kodlama.io.Devs.business.requests.technologies.UpdateLanguageTechnologyRequest;

import kodlama.io.Devs.business.responses.GetAllTechnologiesResponse;
import kodlama.io.Devs.business.responses.GetTechnologyByIdResponse;

public interface TechnologyService {
    
    List<GetAllTechnologiesResponse> getAll();

    void add(CreateLanguageTechnologyRequest createLanguageTechnologyRequest);

    void delete(DeleteLanguageTechnologyRequest deleteLanguageTechnologyRequest);

    void update(UpdateLanguageTechnologyRequest updateLanguageTechnologyRequest);

    GetTechnologyByIdResponse getById(int id);

}
