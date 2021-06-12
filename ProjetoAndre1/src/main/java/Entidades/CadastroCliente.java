
package Entidades;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity

public class CadastroCliente implements Serializable{

    @OneToMany(mappedBy = "cadastroCliente")
    private List<Agendamento> agendamentos;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    
    private Integer Id;
    private String nome;
    private String telefone;
    
    @Temporal(TemporalType.DATE)
    private Date Data_Nasc;
    

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

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Date getData_Nasc() {
        return Data_Nasc;
    }

    public String getData_NascFormatada() {
        return new SimpleDateFormat("dd/MM/YY").format(Data_Nasc);
    }
    
    
    public void setData_Nasc(Date Data_Nasc) {
        this.Data_Nasc = Data_Nasc;
    }

    @Override
    public String toString() {
        return nome; //To change body of generated methods, choose Tools | Templates.
    }

   
    
    
 
    
}
