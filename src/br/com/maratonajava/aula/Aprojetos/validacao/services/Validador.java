package br.com.maratonajava.aula.Aprojetos.validacao.services;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validador {
    private final String NAME_REGEX = "(^|\\s)(([a-zA-Z]){2,10}( |$)+){1,5}";
    private final String EMAIL_REGEX = "(^|\\s)([\\w-])+@([\\w]){2,64}([\\.]([\\w]){2,64})+($|\\s)";
    private final String PHONE_REGEX = "(^|\\s)(([\\(])\\d\\d([\\)])|\\d\\d)?([\\s])*([\\d]){4,5}(-| )*([\\d]){4}($|\\s)";
    private final String CPF_REGEX = "(^|\\s)((([\\d]){3}(\\.([\\d]){3}){2}([-])([\\d]){2})|([\\d]){11})($| )";


    Pattern pattern;

    public boolean hasPhoneNumber (String phoneString){
        pattern = Pattern.compile(PHONE_REGEX);
        Matcher matcher = pattern.matcher(phoneString);
        return matcher.find();
    }

    public boolean hasEmail (String emailString){
        pattern = Pattern.compile(EMAIL_REGEX);
        Matcher matcher = pattern.matcher(emailString);
        return matcher.find();
    }

    public boolean hasName (String nameString){
        pattern = Pattern.compile(NAME_REGEX);
        Matcher matcher = pattern.matcher(nameString);
        return matcher.find();
    }

    public boolean hasCpf (String cpfString){
        pattern = Pattern.compile(CPF_REGEX);
        Matcher matcher = pattern.matcher(cpfString);
        return matcher.find();
    }

}
