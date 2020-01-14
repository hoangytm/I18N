package hoangytm.muiltiple_languages.i18n;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Locale;

@RestController
public class Controller {

    @Autowired
    private ApplicationContext context;

    @Autowired
    Translator translator;

    @GetMapping("*/test")
    public String Hello() {
        return translator.toLocale("label.password");

    }
}
