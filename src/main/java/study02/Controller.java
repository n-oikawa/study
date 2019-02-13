package study02;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@AllArgsConstructor
public class Controller {

    @Autowired
    private final DbMapper dbMapper;

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public Map hello() {
        Map<String, Object> res = new HashMap<>();
        res.put("response", "hello");
        return res;
    }

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public Map list() {

        Map<String, Object> res = new HashMap<>();

        dbMapper.insert(LocalDateTime.now());

        List list = dbMapper.select();

        res.put("response1", list.get(0));
        res.put("response2", list.get(list.size() - 1));
        return res;
    }
}