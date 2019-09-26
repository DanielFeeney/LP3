package br.edu.ifms.banco;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import br.edu.ifms.model.Classe;

public class BancoDeDados {
	private static List<Classe> listaClasse;
	private static Integer cont;
	
	static {
		cont = 1;
		listaClasse = new ArrayList<Classe>();
		Classe classe1 = new Classe();
		classe1.setCodigo(cont++);
		classe1.setTitulo("Cavaleiro");
		classe1.setDescricao("Possui muita força, velocidade moderada");
		classe1.setObservacao("Armas: espada e escudo, vantagens: corta, monta cavalo;");
		classe1.setDataCadastro(new Date());
		classe1.setDinheiroInicial(120.0);
		classe1.setMagia(false);		
		classe1.setRacaComVantagem('H');		
		classe1.setModificador(3);
		
		classe1.setDataAtualizacao(new Date());
		
		listaClasse.add(classe1);
		
		Classe classe2 = new Classe();
		classe2.setCodigo(cont++);
		classe2.setTitulo("Mago");
		classe2.setDescricao("Possui conhecimento, magia usada com preparação prévia");
		classe2.setObservacao("Armas: cajado, vantagens: magia, voar");		
		classe2.setDataCadastro(new Date());
		
		classe2.setDataAtualizacao(new Date());
		
		classe2.setDinheiroInicial(1200.0);
		
		classe2.setMagia(true);
		
		classe2.setRacaComVantagem('E');
		
		classe2.setModificador(5);
		
		listaClasse.add(classe2);		
	}
	
	public void adicionar(Classe classe) {
		classe.setCodigo(cont++);
		classe.setDataCadastro(new Date());
		classe.setDataAtualizacao(new Date());
		listaClasse.add(classe);
	}
	
	public void atualizar(Classe classe) {
		Classe classeAux = buscar(classe.getCodigo());
		classe.setDataCadastro(classeAux.getDataCadastro());
		classe.setDataAtualizacao(new Date());
		listaClasse.remove(classeAux);
		listaClasse.add(classe);
	}
	
	public Classe buscar(Integer codigo) {
		for(Classe classe : listaClasse) {
			if(classe.getCodigo().equals(codigo)) {
				return classe;
			}
		}
		return null;
	}
	
	public void remover(Classe classe) {
		listaClasse.remove(classe);
	}

	public List<Classe> getListaClasse() {
		return listaClasse;
	}

	public void setListaClasse(List<Classe> listaClasse) {
		BancoDeDados.listaClasse = listaClasse;
	}
	
}
