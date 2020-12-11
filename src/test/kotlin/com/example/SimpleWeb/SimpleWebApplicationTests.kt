package com.example.SimpleWeb

import org.junit.jupiter.api.Test
import org.springframework.boot.test.context.SpringBootTest
import kotlin.math.sqrt

@SpringBootTest
class SimpleWebApplicationTests {

	@Test
	fun equationTest(){

		val y = squareEquation(1.0,5.0, 2.0, 2.1)

		println("Y wynosi: $y")

		val value = 16.0

		if(y==value)
			assert(true)
		else
			assert(false)

	}

	fun squareEquation(a: Double, b: Double, c: Double, x: Double):Double{
		return sqrt(a*x*x+b*x+c)
	}

	@Test
	fun contextLoads() {
		assert(true)
	}

}
