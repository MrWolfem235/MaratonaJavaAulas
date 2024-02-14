package br.com.maratonajava.aula.Aprojects.agenda.classes;

public enum EventFields {
    TITLE()
    ,DESCRIPTION
    ,EVENTINIT
    ,EVENTEND
    ;

    private Object field;

    private void EventFields(Object field){
        this.field = field;
    }
}
