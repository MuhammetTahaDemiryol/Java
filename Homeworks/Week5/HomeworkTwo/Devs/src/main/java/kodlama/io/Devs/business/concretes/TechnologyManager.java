package kodlama.io.Devs.business.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.io.Devs.business.abstracts.TechnologyService;
import kodlama.io.Devs.business.requests.technologies.CreateLanguageTechnologyRequest;
import kodlama.io.Devs.business.requests.technologies.DeleteLanguageTechnologyRequest;
import kodlama.io.Devs.business.requests.technologies.UpdateLanguageTechnologyRequest;

import kodlama.io.Devs.business.responses.GetAllTechnologiesResponse;
import kodlama.io.Devs.business.responses.GetTechnologyByIdResponse;
import kodlama.io.Devs.dataAccess.abstracts.LanguageRepository;
import kodlama.io.Devs.dataAccess.abstracts.TechnologyRepository;
import kodlama.io.Devs.entities.concretes.Technology;

@Service
public class TechnologyManager implements TechnologyService {

    private LanguageRepository repository;
    private TechnologyRepository technologyRepository;

    @Autowired
    public TechnologyManager(LanguageRepository languageRepository, TechnologyRepository languageTechnologyRepository) {

        super();
        this.repository = languageRepository;
        this.technologyRepository = languageTechnologyRepository;
    }

    @Override
    public List<GetAllTechnologiesResponse> getAll() {

        List<Technology> technologies = technologyRepository.findAll();
        List<GetAllTechnologiesResponse> technologyResponses = new ArrayList<GetAllTechnologiesResponse>();

        for (Technology technology : technologies) {
            GetAllTechnologiesResponse response = new GetAllTechnologiesResponse();
            response.setName(technology.getName());
            response.setLanguage((technology.getLanguage().getName()));

            technologyResponses.add(response);
        }

        return technologyResponses;

    }

    @Override
    public void add(CreateLanguageTechnologyRequest createLanguageTechnologyRequest) {

        Technology technology = new Technology();
        technology.setName(createLanguageTechnologyRequest.getName());
        technology.setLanguage(repository.getReferenceById(createLanguageTechnologyRequest.getLanguageId()));

        technologyRepository.save(technology);
    }

    @Override
    public void delete(DeleteLanguageTechnologyRequest deleteLanguageTechnologyRequest) {

        technologyRepository.deleteById(deleteLanguageTechnologyRequest.getId());

    }

    @Override
    public void update(UpdateLanguageTechnologyRequest updateLanguageTechnologyRequest) {

        Technology technology = new Technology();
        technology.setId(updateLanguageTechnologyRequest.getId());
        technology.setName(updateLanguageTechnologyRequest.getName());
        technology.setLanguage(repository.getReferenceById(updateLanguageTechnologyRequest.getLanguageId()));
        technologyRepository.save(technology);

    }

    @Override
    public GetTechnologyByIdResponse getById(int id) {

        Technology technology = technologyRepository.findById(id).get();
        GetTechnologyByIdResponse response = new GetTechnologyByIdResponse();
        response.setName(technology.getName());
        response.setId(technology.getId());
        return response;
    }

}
