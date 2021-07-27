package com.example.session_test.api;

import com.example.session_test.data.SessionVo;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@CrossOrigin(origins="https://www.w3school.com")
@RequestMapping(path = "/api")
@RequiredArgsConstructor
public class DataController {

    private final SessionVo sessionVo;

    @GetMapping("/data")
    public @ResponseBody Map<String, String> getData() {
        return sessionVo.getDataMap();
    }

    @PutMapping("/data/{key}")
    public void setData(@PathVariable String key, @RequestBody String value) {
        sessionVo.getDataMap().put(key, value);
    }

}
