package _Desafio01.model;

import java.util.List;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public class Question02 {

	/*
	 * recebe uma lista de usuarios e retorna quantos usuarios admin tem na lista
	 */

	public Mono<Long> countAdmin(final List<MyUser> userList) {

		return Mono.just(userList).flatMapMany(Flux::fromIterable).filter(MyUser::getIsAdmin).count();
	}

	public static void main(String[] args) {
		Question02 q = new Question02();

		MyUser u1 = new MyUser(1, "Fernando", "fer@gmail", "123", true);
		MyUser u2 = new MyUser(2, "Fulano", "fulano@gmail", "321", false);
		MyUser u3 = new MyUser(3, "siclano", "siclano@gmail", "111", true);

		List<MyUser> userList = List.of(u1, u2, u3);
		
		Mono<Long> adminCount = q.countAdmin(userList);
		
		adminCount.subscribe(count -> System.out.println("número de admin = " + count));
		
		
	}

}