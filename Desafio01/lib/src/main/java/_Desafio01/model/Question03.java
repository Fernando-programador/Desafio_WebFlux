package _Desafio01.model;

import reactor.core.publisher.Mono;

public class Question03 {

	/*
	 * verificar se o usuario passado é valido, caso seja retona void, caso
	 * contrario deve disparar uma exception para esse desafio vamos considerar que
	 * o usuario é válido qundo ele tem uma senha com mais de 8 caracteres
	 */

	public Mono<Void> userIsValid(final MyUser user) {

		return Mono.justOrEmpty(user.getPassword())
				.flatMap(pass -> {
			if (isValidPassword(pass)) {
				return Mono.error(new Exception("Password invalid!!!"));
			} else {
				return Mono.empty();
			}

		});
	}

	private boolean isValidPassword(String pass) {
		if (pass == null || pass.length() <= 8)
			return true;
		return false;
	}

	public static void main(String[] args) {
		Question03 q = new Question03();

		MyUser u1 = new MyUser(1, "Fernando", "fer@gmail", "123456789", true);

		Mono<Void> myPass = q.userIsValid(u1);

		myPass.subscribe();

	}

}
