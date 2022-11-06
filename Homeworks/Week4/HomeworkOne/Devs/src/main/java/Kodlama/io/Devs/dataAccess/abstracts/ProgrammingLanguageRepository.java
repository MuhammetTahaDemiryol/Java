package Kodlama.io.Devs.dataAccess.abstracts;

import java.util.List;

import Kodlama.io.Devs.entities.concretes.ProgrammingLanguage;

public interface ProgrammingLanguageRepository {
    
    List<ProgrammingLanguage> getAll();
    ProgrammingLanguage getById(int id);
    void update(ProgrammingLanguage programmingLanguage);
    void deleteById(int id);
    void add(ProgrammingLanguage programmingLanguage);
}
