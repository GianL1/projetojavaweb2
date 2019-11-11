package br.com.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import org.springframework.hateoas.ResourceSupport;
//import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
//import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "tb_empresa")
@Getter
@Setter
@EqualsAndHashCode(of = {"id"})
public class Empresa extends ResourceSupport implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long codigo;

	@NotBlank(message="Cnpj é obrigatório")
	private String cnpj;

	@NotBlank(message="Nome é obrigatório")
	private String nome;

	private boolean ativo = true;


	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public boolean isAtivo() {
		return ativo;
	}

	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}


}