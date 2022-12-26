package blacksooooo.clients

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class SampleController(
    private val sampleClient: SampleClient
) {
    @GetMapping("/test")
    fun test(): Boolean {
        return sampleClient.test()
    }
}