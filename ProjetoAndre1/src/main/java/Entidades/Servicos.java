
package Entidades;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Servicos implements Serializable {

    @OneToMany(mappedBy = "servicos")
    private List<Agendamento> agendamentos;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    
    private Integer Id;
    private String NomeServico;
    private String valor;
    @OneToOne
    private Funcionario funcionario; 
    private String duracao;

    
    public List<Agendamento> getAgendamentos() {
        return agendamentos;
    }

    public void setAgendamentos(List<Agendamento> agendamentos) {
        this.agendamentos = agendamentos;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer Id) {
        this.Id = Id;
    }

    public String getNomeServico() {
        return NomeServico;
    }

    public void setNomeServico(String NomeServico) {
        this.NomeServico = NomeServico;
    }

 

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }
    
    public String getDuracao() {
        return duracao;
    }

    public void setDuracao(String duracao) {
        this.duracao = duracao;
    }

    
}
