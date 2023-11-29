package _Desafio01.model;

import java.util.Arrays;
import java.util.List;

import reactor.core.publisher.Flux;

public class Question01{

	/*
	 * Recebe uma lista de longs incrementa 1 nos valores e retorna um flux dos mesmos
	 */
	
	
			
		 public Flux<Long>  inc(final List<Long> listaNumero){
			  
			 
			 return Flux.fromIterable(listaNumero).map(number -> number + 1);
	 }
		 public static void main(String[] args) {
			
			 Question01 question01 = new Question01();
		List<Long> newList = Arrays.asList(1L, 2L, 3L, 4L, 5L, 6L, 7L);
		 
		Flux<Long> result = question01.inc(newList);
		
		result.subscribe(System.out::println);
			
		 }
		 
}
	