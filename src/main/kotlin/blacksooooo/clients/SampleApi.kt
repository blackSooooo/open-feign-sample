package blacksooooo.clients

import org.springframework.cloud.openfeign.FeignClient
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping

@FeignClient(
    name = "\${sample.api.name}",
    url = "\${sample.api.url}",
)
interface SampleApi {
    @GetMapping("/test")
    fun test(): ResponseEntity<Boolean>
}