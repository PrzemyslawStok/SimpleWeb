package com.example.SimpleWeb

import org.junit.jupiter.api.Test
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class SimpleWebApplicationTests {

	@Test
	fun equationTest(){

		val y = squareEquation(1.0,5.0, 2.0, 1.0)

		val value = 10.0

		if(y==value)
			assert(true)
		else
			assert(false)

	}

	fun squareEquation(a: Double, b: Double, c: Double, x: Double):Double{
		return a*x*x+b*x+c
	}

	@Test
	fun contextLoads() {
		assert(true)
	}

}
