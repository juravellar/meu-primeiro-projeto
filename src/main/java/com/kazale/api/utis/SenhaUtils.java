package com.kazale.api.utis;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class SenhaUtils {
	
	/**
	 * Gera um hash utilizando o Bcrypt.
	 * 
	 * @param senha
	 * @return
	 */
	
	public static String gerarBCrypt(String senha) {
		if (senha ==null) {
			return senha;
		}
		
		BCryptPasswordEncoder bCrytEncoder = new BCryptPasswordEncoder();
		return bCrytEncoder.encode(senha);		
	}
	
	/**
	 * Verifica se a senha é válida.
	 * 
	 * @param senha
	 * @param senhaEncoded
	 * @return boolean
	 */
	
	public static boolean senhaValida(String senha, String senhaEncoded) {
		BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
		return bCryptPasswordEncoder.matches(senha, senhaEncoded);
	}
	
}



