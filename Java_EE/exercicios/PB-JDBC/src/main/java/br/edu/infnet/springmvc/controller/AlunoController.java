package br.edu.infnet.springmvc.controller;

import br.edu.infnet.springmvc.model.domain.Aluno;
import br.edu.infnet.springmvc.model.service.AlunoService;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AlunoController {
    
    AlunoService alunoService = new AlunoService();
    
    @RequestMapping("")
    public String consulta(Model model) {
        
        List<Aluno> alunos = alunoService.consultarAlunos();
        for (Aluno aluno : alunos) {
            System.out.println(aluno);
        }
        //model.addAttribute("lista", alunoService.consultarAlunos());
        
        return "consulta";
    }
}
