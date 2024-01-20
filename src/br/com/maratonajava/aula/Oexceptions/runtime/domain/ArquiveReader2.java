package br.com.maratonajava.aula.Oexceptions.runtime.domain;

import java.io.Closeable;
import java.io.IOException;

public class ArquiveReader2 implements Closeable {

    @Override
    public void close() throws IOException {
        System.out.println("ArquiveReader2: Fechando Leitura do ArquiveReader2...");
    }
    
}
