package com.wipro.neww;

import java.util.Optional;

public class OptionalDemo {

	public static void main(String[] args) {
		Optional<Integer> op = Optional.ofNullable(21);
		op.ifPresent(v -> System.out.println(v));
		

	}

}
