package ru.sonicxd2.ghoul;

import java.util.concurrent.atomic.AtomicInteger;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GhoulController {
    private AtomicInteger counter = new AtomicInteger(1000);

    @GetMapping("/count")
    public String get() {
        int total = counter.get();
        if (!counter.compareAndSet(total, total-7)) {
            return get();
        }
        return total + " - 7 = " + counter.get();
    }
    
}
