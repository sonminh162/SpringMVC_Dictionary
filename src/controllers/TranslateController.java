package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.HashMap;
import java.util.Map;

@Controller
public class TranslateController {
    private static Map<String, String> dictionary = new HashMap<>();

    static {
        dictionary.put("hello", "xin chào");
        dictionary.put("world", "thế giới");
        dictionary.put("car", "xe hơi");
        dictionary.put("motor", "xe máy");
    }

    @GetMapping("/translator")
    public String home(){
        return "index";
    }

    @PostMapping("/translator")
    public String search(@RequestBody String request, Model model){
        String[] array = request.split("=");

        String word = "";
        String result = "";
        try {
            word = array[1];
            if (dictionary.get(word) != null) {
                result = dictionary.get(word);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        model.addAttribute("word",word);
        model.addAttribute("result",result);

        return "result";
    }
}
