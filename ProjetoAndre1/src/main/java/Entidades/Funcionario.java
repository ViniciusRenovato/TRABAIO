
package Entidades;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Funcionario implements Serializable {

    @OneToOne(mappedBy = "funcionario")
    private Servicos servicos;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    
    private Integer Id;
    private String Funcao;
    private String NomeFuncionario;
    
    
    @Temporal(TemporalType.DATE)
    private Date Data_Nasc;

    

    public Servicos getServicos() {
        return servicos;
    }

    public void setServicos(Servicos servicos) {
        this.servicos = servicos;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer Id) {
        this.Id = Id;
    }

    public String getFuncao() {
        return Funcao;
    }

    public void setFuncao(String Funcao) {
        this.Funcao = Funcao;
    }

    public String getNomeFuncionario() {
        return NomeFuncionario;
    }

    public void setNomeFuncionario(String NomeFuncionario) {
        this.NomeFuncionario = NomeFuncionario;
    }


    public Date getData_Nasc() {
        return Data_Nasc;
    }

    public void setData_Nasc(Date Data_Nasc) {
        this.Data_Nasc = Data_Nasc;
    }

    @Override
    public String toString() {
        return NomeFuncionario; //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
