package crud.controller;

import crud.model.Skill;
import crud.repository.Database.DatabaseSkillRepository;
import crud.repository.SkillRepository;
import crud.service.SkillService;

import java.util.List;

public class SkillController {
    private SkillRepository skillRepository = new DatabaseSkillRepository();
    private SkillService skillService = new SkillService(skillRepository);

    public Skill create(Skill skill){
        return skillService.save(skill);
    }
    public Skill read(Integer id){
        return skillService.getById(id);
    }

    public List<Skill> readAll(){
        return skillService.getAll();
    }

    public void update(Skill skill){
        skillService.update(skill);
    }

    public void delete(Integer id){
        skillService.deleteById(id);
    }

}
