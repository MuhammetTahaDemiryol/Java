package Kodlama.io.Devs.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import Kodlama.io.Devs.dataAccess.abstracts.ProgrammingLanguageRepository;
import Kodlama.io.Devs.entities.concretes.ProgrammingLanguage;

@Repository
public class InMemoryProgrammingLanguageRepository implements ProgrammingLanguageRepository{
   
    List<ProgrammingLanguage> programmingLanguages;


    public InMemoryProgrammingLanguageRepository() {
		programmingLanguages = new ArrayList<ProgrammingLanguage>();
		programmingLanguages.add(new ProgrammingLanguage(1, "C#"));
		programmingLanguages.add(new ProgrammingLanguage(2, "Java"));
		programmingLanguages.add(new ProgrammingLanguage(3, "Pyhton"));

	}

    @Override
    public List<ProgrammingLanguage> getAll() {
        return programmingLanguages;
    }

    @Override
    public ProgrammingLanguage getById(int id) {
        for(ProgrammingLanguage pl : programmingLanguages){
            if (pl.getID() == id){
                return pl;
            }
        }

        return null;
    }

    @Override
    public void update(ProgrammingLanguage programmingLanguage) {
        for(ProgrammingLanguage pl : programmingLanguages){
            if (programmingLanguage.getID() == pl.getID()){
                pl.setID(programmingLanguage.getID());
                pl.setNAME(programmingLanguage.getNAME());
            }
        }
        
    }

    @Override
    public void deleteById(int id) {
        for(ProgrammingLanguage pl : programmingLanguages){
            if (pl.getID() == id){
                programmingLanguages.remove(pl);
            }
        }
    
    }

    @Override
    public void add(ProgrammingLanguage programmingLanguage) {
        programmingLanguages.add(programmingLanguage);
        
    }
    
}
