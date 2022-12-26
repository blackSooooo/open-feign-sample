package blacksooooo.clients

import feign.Logger
import feign.Retryer
import org.springframework.cloud.openfeign.EnableFeignClients
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import java.util.concurrent.TimeUnit

@Configuration
@EnableFeignClients
class SampleConfig {

    @Bean
    fun feignLoggerLevel(): Logger.Level {
        return Logger.Level.FULL
    }

    @Bean
    fun retry(): Retryer {
        return Retryer.Default(100L, TimeUnit.SECONDS.toMillis(3L), 5)
    }
}