package org.desafio.models;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "despesasAgrupadas")
@XmlAccessorType(XmlAccessType.FIELD)
public class DespesasAgrupadasEBO {
	private List<DespesaMensalEBO> despesasMensais;
	private List<DespesaCategoriaEBO> despesasCategoria;
	private List<DespesaFonteRecursoEBO> despesasFonteRecurso;

	/**
	 * @return the despesasMensais
	 */
	public List<DespesaMensalEBO> getDespesasMensais() {
		return despesasMensais;
	}

	/**
	 * @param despesasMensais the despesasMensais to set
	 */
	public void setDespesasMensais(List<DespesaMensalEBO> despesasMensais) {
		this.despesasMensais = despesasMensais;
	}

	/**
	 * @return the despesasCategoria
	 */
	public List<DespesaCategoriaEBO> getDespesasCategoria() {
		return despesasCategoria;
	}

	/**
	 * @param despesasCategoria the despesasCategoria to set
	 */
	public void setDespesasCategoria(List<DespesaCategoriaEBO> despesasCategoria) {
		this.despesasCategoria = despesasCategoria;
	}

	/**
	 * @return the despesasFonteRecurso
	 */
	public List<DespesaFonteRecursoEBO> getDespesasFonteRecurso() {
		return despesasFonteRecurso;
	}

	/**
	 * @param despesasFonteRecurso the despesasFonteRecurso to set
	 */
	public void setDespesasFonteRecurso(List<DespesaFonteRecursoEBO> despesasFonteRecurso) {
		this.despesasFonteRecurso = despesasFonteRecurso;
	}
}
