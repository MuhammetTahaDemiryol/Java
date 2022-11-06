package Kodlama.io.Devs.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Kodlama.io.Devs.business.abstracts.ProgrammingLanguageService;
import Kodlama.io.Devs.dataAccess.abstracts.ProgrammingLanguageRepository;
import Kodlama.io.Devs.entities.concretes.ProgrammingLanguage;

@Service
public class ProgrammingLanguageManager implements ProgrammingLanguageService {

    private ProgrammingLanguageRepository programmingLanguageRepository;

    @Autowired
    public ProgrammingLanguageManager(ProgrammingLanguageRepository programmingLanguageRepositor) {
        this.programmingLanguageRepository = programmingLanguageRepositor;
    }


    @Override
    public List<ProgrammingLanguage> getAll() {
        return programmingLanguageRepository.getAll();
    }

    @Override
    public ProgrammingLanguage getById(int id) {
        return programmingLanguageRepository.getById(id);
    }

    @Override
    public void add(ProgrammingLanguage programmingLanguage) throws Exception {
        if (programmingLanguage.getNAME().isEmpty()) {
			throw new Exception("Name can not be empty!");
		}
		if (languageIsExist(programmingLanguage.getNAME())) {
			throw new Exception("Already in use, please select another name!");
		} else {
			programmingLanguageRepository.add(programmingLanguage);
		}
        
    }

    @Override
    public void deleteById(int id) {
        programmingLanguageRepository.deleteById(id);
        
    }

    @Override
    public void update(ProgrammingLanguage programmingLanguage) {
        programmingLanguageRepository.update(programmingLanguage);
        
    }

    private boolean languageIsExist(String name) {
		for (ProgrammingLanguage language : programmingLanguageRepository.getAll()) {
			if (language.getNAME().equals(name)) {
				return true;
			}
		}
		return false;

	}
    
}
