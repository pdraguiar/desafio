package org.desafio.services.impl;

import java.util.List;

import org.desafio.entities.Despesa;
import org.desafio.repositories.DespesasRepository;
import org.desafio.services.interfaces.IDespesasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class DespesasService implements IDespesasService{
	@Autowired
	private DespesasRepository despesasRepository;
	
	/* (non-Javadoc)
	 * @see org.desafio.services.interfaces.IDespesasService#getDespesasMensais()
	 */
	@Override
	@Transactional(readOnly = true)
	public List<Despesa> getDespesasMensais() {
		List<Despesa> despesasMensais = despesasRepository.getDespesasMensais();
		
		return despesasMensais;
	}

	/* (non-Javadoc)
	 * @see org.desafio.services.interfaces.IDespesasService#getDespesasPorCategoria()
	 */
	@Override
	public List<Despesa> getDespesasPorCategoria() {
		List<Despesa> despesasCategoria = despesasRepository.getDespesasPorCategoria();
		
		return despesasCategoria;
	}

	/* (non-Javadoc)
	 * @see org.desafio.services.interfaces.IDespesasService#getDespesasPorFonteRecurso()
	 */
	@Override
	public List<Despesa> getDespesasPorFonteRecurso() {
		List<Despesa> despesasCategoria = despesasRepository.getDespesasPorFonteRecurso();
		
		return despesasCategoria;
	}
}
