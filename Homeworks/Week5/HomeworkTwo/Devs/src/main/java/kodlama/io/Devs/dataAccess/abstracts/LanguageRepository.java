package kodlama.io.Devs.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import kodlama.io.Devs.entities.concretes.Language;

@Repository
public interface LanguageRepository extends JpaRepository<Language, Integer>{
    Language getByName(String name);
}
