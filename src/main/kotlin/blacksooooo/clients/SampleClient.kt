package blacksooooo.clients

import org.springframework.stereotype.Component

@Component
class SampleClient(
    private val sampleApi: SampleApi
) {
    fun test(): Boolean {
        return sampleApi.test()
            ?.body ?: throw RuntimeException()
    }
}