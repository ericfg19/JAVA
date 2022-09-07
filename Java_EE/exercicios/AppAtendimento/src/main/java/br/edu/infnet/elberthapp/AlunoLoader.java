package br.edu.infnet.elberthapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.elberthapp.model.domain.Aluno;
import br.edu.infnet.elberthapp.model.domain.Usuario;
import br.edu.infnet.elberthapp.model.service.AlunoService;

@Order(2)
@Component
public class AlunoLoader implements ApplicationRunner {

	@Autowired 
	private AlunoService alunoService;

	@Override
	public void run(ApplicationArguments args) throws Exception {
		Usuario usuario = new Usuario();
		usuario.setId(1);

		String[] disciplinas = {"Java", "Web", "Database"};
		Aluno aluno = new Aluno("Elberth Moraes", "elberth@elberth.com");
		aluno.setCurso("Computacao");
		aluno.setDisciplinas(disciplinas);
		aluno.setRegiao("Sudeste");
		
		aluno.setUsuario(usuario);
		
		alunoService.incluir(aluno);
	}
}