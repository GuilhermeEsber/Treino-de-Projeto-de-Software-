package br.edu.unifei.guilhermeesber.trabalho;

public class FonteDeAguaFactory {

    public FonteDeAgua criarFonte(String tipo) {
        if (tipo == null) return null;

        if (tipo.equalsIgnoreCase("rio")) {
            Rio r = new Rio();
            r.setNome("Rio Padrão");
            return r;
        } else if (tipo.equalsIgnoreCase("lago")) {
            Lago l = new Lago();
            l.setNome("Lago Padrão");
            return l;
        } else if (tipo.equalsIgnoreCase("poco")) {
            PocoArtesiano p = new PocoArtesiano();
            p.setNome("Poço Padrão");
            return p;
        } else if (tipo.equalsIgnoreCase("reservatorio")) {
            Reservatorio r = new Reservatorio();
            r.setNome("Reservatório Padrão");
            return r;
        }

        return null;
    }
}