package org.desafio.models;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "despesasAgrupadas")
@XmlAccessorType(XmlAccessType.FIELD)
public class DespesasAgrupadasDTO {
	private List<DespesaMensalDTO> despesasMensais;
	private List<DespesaCategoriaDTO> despesasCategoria;
	private List<DespesaFonteRecursoDTO> despesasFonteRecurso;

	/**
	 * @return the despesasMensais
	 */
	public List<DespesaMensalDTO> getDespesasMensais() {
		return despesasMensais;
	}

	/**
	 * @param despesasMensais the despesasMensais to set
	 */
	public void setDespesasMensais(List<DespesaMensalDTO> despesasMensais) {
		this.despesasMensais = despesasMensais;
	}

	/**
	 * @return the despesasCategoria
	 */
	public List<DespesaCategoriaDTO> getDespesasCategoria() {
		return despesasCategoria;
	}

	/**
	 * @param despesasCategoria the despesasCategoria to set
	 */
	public void setDespesasCategoria(List<DespesaCategoriaDTO> despesasCategoria) {
		this.despesasCategoria = despesasCategoria;
	}

	/**
	 * @return the despesasFonteRecurso
	 */
	public List<DespesaFonteRecursoDTO> getDespesasFonteRecurso() {
		return despesasFonteRecurso;
	}

	/**
	 * @param despesasFonteRecurso the despesasFonteRecurso to set
	 */
	public void setDespesasFonteRecurso(List<DespesaFonteRecursoDTO> despesasFonteRecurso) {
		this.despesasFonteRecurso = despesasFonteRecurso;
	}
}
