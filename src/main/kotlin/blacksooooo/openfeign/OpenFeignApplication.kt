package blacksooooo.openfeign

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class OpenFeignApplication

fun main(args: Array<String>) {
	runApplication<OpenFeignApplication>(*args)
}
