package br.com.fatec.engsoftware.designpatterns.semana06.singleton;

public class Fila {

    private Fila() {
    }

    private static Fila Instance;

    public static Fila getInstance() {
        if(Instance==null){
            Instance = new Fila();
        }
        return Instance;
    }

    public void imprimeDocumento() {
    }

    public void removeDocumento() {
    }

    public void removeTodosDocumentos() {
    }

}
