package br.com.maratonajava.aula.Avarags.funcionario.domain;

import java.text.DecimalFormat;

public abstract class Funcionario extends Pessoa {
    private float[] wages = new float[2];
    private float wageMedia;
    protected DecimalFormat format = new DecimalFormat("###,##0.00");

    private boolean verContemNegativo(float[] arr) {
        boolean contem = false;
        for (float aux : arr) {
            if (aux < 0) {
                contem = true;
            }
        }
        return contem;
    }

    public Funcionario(String name, int age, float... wages) {
        if (age < 18) {
            throw new IllegalArgumentException("ERRO: Idade mínima para cadastro é de 18 anos!");
        } else if (verContemNegativo(wages)) {
            throw new IllegalArgumentException("ERRO: Não permitida entrada de valores negativos para salário!");
        } else if (age < 0) {
            throw new IllegalArgumentException("ERRO: Não permitida entrada de valores negativos para idade!");
        } else {
            this.setName(name);
            this.setAge(age);
            this.setWages(wages);
        }
    }

    public String info() {
        String wagesInfo = "";
        for (float aux : this.getWages()) {
            wagesInfo += ("- R$:" + format.format(aux) + "\n");
        }
        return String.format("------DADOS------\nNome: %s\nIdade: %d\nSalarios: \n%s----------------\n", this.getName(), this.getAge(), wagesInfo);
    }

    public String wagesMedia() {
        return String.format("Média dos salários: \nR$:%s", format.format(this.getWageMedia()));
    }

    public float[] getWages() {
        return wages;
    }

    public void setWages(float[] wages) {
        this.wages = wages;

        int totWages = this.getWages().length;
        float sumTotWages = 0;
        for (float aux : wages) {
            sumTotWages += aux;
        }
        this.setWageMedia(sumTotWages / totWages);
    }

    private float getWageMedia() {
        return wageMedia;
    }

    private void setWageMedia(float wageMedia) {
        this.wageMedia = wageMedia;
    }
}
