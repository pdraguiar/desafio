package org.desafio.tests;

import static org.assertj.core.api.Assertions.assertThat;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.desafio.entities.Despesa;
import org.desafio.repositories.DespesasRepository;
import org.desafio.services.impl.DespesasService;
import org.desafio.services.interfaces.IDespesasService;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.Bean;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
public class DespesasServiceTest {
	@MockBean
    private DespesasRepository despesasRepository;
	
	@Autowired
    private IDespesasService iDespesasService;
	
	@TestConfiguration
    static class DespesasServiceTestContextConfiguration {
  
        /**
         * Método chamado quando o CDI for injetar o IDespesasService.
         * @return DespesasService.
         */
        @Bean
        public IDespesasService iDespesasService() {
            return new DespesasService();
        }
    }
	
	/**
	 * Seta os mocks das chamadas ao repository.
	 */
	@Before
	public void setUp() {
	    Despesa despesa = new Despesa();
	    despesa.setMes(new Byte("1"));
	    despesa.setValorLiquidado(new BigDecimal("1000.00"));
	    
	    List<Despesa> listaDespesas = new ArrayList<Despesa>();
	    listaDespesas.add(despesa);
	 
	    Mockito.when(despesasRepository.getDespesasMensais()).thenReturn(listaDespesas);
	    Mockito.when(despesasRepository.getDespesasPorCategoria()).thenReturn(listaDespesas);
	    Mockito.when(despesasRepository.getDespesasPorFonteRecurso()).thenReturn(listaDespesas);
	}
	
	@Test
	public void getDespesasMensais() {
		List<Despesa> despesas = iDespesasService.getDespesasMensais();
		
		assertThat(despesas).isNotEmpty();
	}
	
	@Test
	public void getDespesasPorCategoria() {
		List<Despesa> despesas = iDespesasService.getDespesasPorCategoria();
		
		assertThat(despesas).isNotEmpty();
	}
	
	@Test
	public void getDespesasPorFonteRecurso() {
		List<Despesa> despesas = iDespesasService.getDespesasPorFonteRecurso();
		
		assertThat(despesas).isNotEmpty();
	}
}
