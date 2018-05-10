package entidades;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the "Equipos_Grupo" database table.
 * 
 */
@Entity
@Table(name="\"Equipos_Grupo\"") 
@NamedQuery(name="Equipos_Grupo.findAll", query="SELECT e FROM Equipos_Grupo e")
public class Equipos_Grupo implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private Equipos_Grupo_Identidad id;
	
	
	
	@Column(name="\"GolenContra\"")
	private Integer golenContra;

	@Column(name="\"GolesFavor\"")
	private Integer golesFavor;

	@Column(name="\"PartidosEmpatados\"")
	private Integer partidosEmpatados;

	@Column(name="\"PartidosGanados\"")
	private Integer partidosGanados;

	@Column(name="\"PartidosJugados\"")
	private Integer partidosJugados;

	@Column(name="\"PartidosPerdidos\"")
	private Integer partidosPerdidos;

	@Column(name="\"Posicion\"")
	private Integer posicion;

	@Column(name="\"Puntos\"")
	private Integer puntos;

	//bi-directional many-to-one association to Equipo
	@ManyToOne
	@JoinColumn(name="\"EquipoId\"")
	private Equipo equipo;

	//bi-directional many-to-one association to Grupo
	@ManyToOne
	@JoinColumn(name="\"GrupoId\"")
	private Grupo grupo;

	public Equipos_Grupo() {
	}

	public Integer getGolenContra() {
		return this.golenContra;
	}

	public void setGolenContra(Integer golenContra) {
		this.golenContra = golenContra;
	}

	public Integer getGolesFavor() {
		return this.golesFavor;
	}

	public void setGolesFavor(Integer golesFavor) {
		this.golesFavor = golesFavor;
	}

	public Integer getPartidosEmpatados() {
		return this.partidosEmpatados;
	}

	public void setPartidosEmpatados(Integer partidosEmpatados) {
		this.partidosEmpatados = partidosEmpatados;
	}

	public Integer getPartidosGanados() {
		return this.partidosGanados;
	}

	public void setPartidosGanados(Integer partidosGanados) {
		this.partidosGanados = partidosGanados;
	}

	public Integer getPartidosJugados() {
		return this.partidosJugados;
	}

	public void setPartidosJugados(Integer partidosJugados) {
		this.partidosJugados = partidosJugados;
	}

	public Integer getPartidosPerdidos() {
		return this.partidosPerdidos;
	}

	public void setPartidosPerdidos(Integer partidosPerdidos) {
		this.partidosPerdidos = partidosPerdidos;
	}

	public Integer getPosicion() {
		return this.posicion;
	}

	public void setPosicion(Integer posicion) {
		this.posicion = posicion;
	}

	public Integer getPuntos() {
		return this.puntos;
	}

	public void setPuntos(Integer puntos) {
		this.puntos = puntos;
	}

	public Equipo getEquipo() {
		return this.equipo;
	}

	public void setEquipo(Equipo equipo) {
		this.equipo = equipo;
	}

	public Grupo getGrupo() {
		return this.grupo;
	}

	public void setGrupo(Grupo grupo) {
		this.grupo = grupo;
	}

}