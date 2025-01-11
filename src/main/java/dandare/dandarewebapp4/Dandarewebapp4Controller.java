package dandare.dandarewebapp4;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class Dandarewebapp4Controller {

    @GetMapping("/lista")
    public String index(){
        String lista = "<!DOCTYPE html>\n" +
                "<html lang=\"en\">\n" +
                "<head>\n" +
                "    <meta charset=\"UTF-8\">\n" +
                "    <title>Autor Daniel Lamek nr albumu 178838 !</title>\n" +
                "    <style>\n" +
                "       table, th, td {\n" +
                "       border: 1px solid black;\n" +
                "       border-collapse: collapse;\n" +
                "      }\n" +
                "   </style>\n" +
                "</head>\n" +
                "<body>\n" +
                "Lista utworów dostępnych w bazie:<br><br>\n" +
                "<table style=\"width:100%\">\n";
        lista += Utwor.listaUtworowToString();
        lista += "</table>\n" +
                "</body>\n" +
                "</html>";
        return lista;
    }

}
