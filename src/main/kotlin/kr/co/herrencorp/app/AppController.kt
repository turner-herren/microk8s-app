package kr.co.herrencorp.app

import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import java.util.UUID

@RestController
class AppController {

    @GetMapping("/")
    fun get(): ResponseEntity<String> {
        return ResponseEntity.ok(UUID.randomUUID().toString())
    }

    @GetMapping("/alive")
    fun alive(): ResponseEntity<String> {
        return ResponseEntity.ok("OK")
    }
}