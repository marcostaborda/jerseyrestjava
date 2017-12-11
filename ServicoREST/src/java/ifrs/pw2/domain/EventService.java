/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifrs.pw2.domain;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author marcos
 */
public class EventService {

    private final List<Event> db = new LinkedList<>();
    
    public EventService(String url) {
        db.add(new Event(1, "ChimaCode", url + "/image/chimacode.png", "http://mostra.poa.ifrs.edu.br/2017/index.html","Quer melhorar suas habilidades de desenvolvimento web? Então participe do Chima CODE, no dia 23 de novembro de 2017. \n" +
"A atividade é gratuita e está sendo organizada pelos alunos de Gerência de Projetos do curso de Sistemas para Internet do Instituto Federal - Campus Porto Alegre(IFRS). "));
        db.add(new Event(2, "Mostra POA", url +  "/image/mostrapoa.PNG", "http://chimacode.xyz/","O objetivo geral do evento é contribuir para a difusão do conhecimento produzido nas dimensões do ensino, da pesquisa e da extensão no âmbito das Instituições de Ensino Técnico, Superior e Pós-Graduação."));
    }
    public List<Event> getEvents(){
        return db;
    }
}
