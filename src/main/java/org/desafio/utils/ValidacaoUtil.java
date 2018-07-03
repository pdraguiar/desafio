package org.desafio.utils;

import java.util.List;

public class ValidacaoUtil {

	/**
	 * Valida se obj é nulo.
	 * @param <T>
	 * 
	 * @param obj - objeto a ser validado.
	 * @return true se obj não nulo, false se  contrário.
	 */
	public static <T> boolean isNotNull(T obj) {
		return obj != null;
	}

	/**
	 * Valida se content é uma lista vazia.
	 * @param <T>
	 * 
	 * @param content - lista a ser validada.
	 * @return true se content não é uma lista vazia, false se contrário.
	 */
	public static <T> boolean isNotEmptyList(List<T> content) {
		return isNotNull(content) && !content.isEmpty();
	}
}
