package br.edu.unifei.guilhermeesber.trabalho;

import java.util.HashMap;
import java.util.Map;

public class SistemaDeGerenciamento {

    private String nomeSistema;
    private String versao;
    private double qtd;
    
    private Map<String, FonteDeAgua> fontes = new HashMap<>();

    public void iniciar() {
        System.out.println("=================================================");
        System.out.println("Sistema iniciado: " + nomeSistema + " v" + versao);
        System.out.println("=================================================");
    }

    public void carregarFontes() {
        System.out.println("\n--- 💧 Carregando Fontes de Água ---");
        FonteDeAguaFactory factory = new FonteDeAguaFactory();

        Rio rio = (Rio) factory.criarFonte("rio");
        rio.setNome("Rio Grande");
        rio.setVolumeMedio(15000);
        rio.setVelocidadeFluxo(2.5);
        rio.setQualidadeBase("Regular");
        fontes.put("Rio", rio);

        Lago lago = (Lago) factory.criarFonte("lago");
        lago.setNome("Lago Azul");
        lago.setAreaSuperficial(5000);
        lago.setProfundidadeMedia(15);
        lago.setQualidadeBase("Boa");
        fontes.put("Lago", lago);
        
        PocoArtesiano poco = (PocoArtesiano) factory.criarFonte("poco");
        poco.setNome("Poço Central");
        poco.setPressaoAgua(8.0);
        poco.setQualidadeBase("Ótima");
        fontes.put("Poço Artesiano", poco);
        
        Reservatorio reservatorio = (Reservatorio) factory.criarFonte("reservatorio");
        reservatorio.setNome("Reservatório Sul");
        reservatorio.setCapacidadeMaxima(200000);
        reservatorio.setNivelAtual(180000);
        reservatorio.setQualidadeBase("Excelente");
        fontes.put("Reservatório", reservatorio);
        
        System.out.println("4 Fontes carregadas com sucesso.");
    }

    public void monitorar() {
    }

    public void processarCiclo() {
        carregarFontes();
        
        EstacaoDeTratamento eta = new EstacaoDeTratamento();
        eta.setTaxaFiltragem(0.95);
        eta.setNivelCloracao(1.5);
        TanqueDeArmazenamento tanque = new TanqueDeArmazenamento();
        tanque.setCapacidade(50000);
        Cliente clientePadrao = new Cliente();
        clientePadrao.setNome("Sr. João");
        clientePadrao.setTipoCliente("Residencial");
        
        Sensor sensor = new Sensor();
        CentralDeControle central = new CentralDeControle();
        PainelDeMonitoramento painel = new PainelDeMonitoramento();
        sensor.addObservador(central);
        sensor.addObservador(painel);


        for (Map.Entry<String, FonteDeAgua> entry : fontes.entrySet()) {
            String tipo = entry.getKey();
            FonteDeAgua fonte = entry.getValue();
            
            System.out.println("\n#################################################");
            System.out.println("### Processando Ciclo para Fonte: " + fonte.nome + " (" + tipo + ")");
            System.out.println("#################################################");

            double qtdCaptada = fonte.captarAgua();
            System.out.printf("Captação: %.2f litros captados de %s.\n", qtdCaptada, fonte.nome);
            
            if (fonte instanceof Reservatorio) {
                ((Reservatorio) fonte).liberarAgua(qtdCaptada);
            }

            AnaliseDeQualidade analise = new AnaliseDeQualidade();
            analise.setPh(7.0 + (Math.random() * 1.5 - 0.75));
            analise.setTurbidez(Math.random() * 5); 
            analise.setMetaisPesados(Math.random() < 0.05 ? "Alto" : "Baixo");
            String relatorioAnalise = analise.gerarRelatorio();
            System.out.println("Análise de Qualidade: " + relatorioAnalise);
            
            eta.filtrar();
            eta.clorar();
            double qtdTratada = eta.enviarParaTanque(qtdCaptada);
            tanque.receberAgua(qtdTratada);
            System.out.printf("Tratamento: %.2f litros enviados ao tanque. Volume Atual: %.2f\n", qtdTratada, tanque.getVolumeAtual());
            
            System.out.println("\n--- Início do Monitoramento ---");

            sensor.setNivel(qtdTratada * 0.01); 
            sensor.setVazao(qtdTratada * 0.005);
            sensor.medir();
            System.out.println("--- Fim do Monitoramento ---\n");
            
            double qtdDistribuir = Math.min(qtd, tanque.getVolumeAtual()); 
            double fornecido = tanque.fornecerAgua(qtdDistribuir);
            
            RedeDeDistribuicao rede = new RedeDeDistribuicao();
            rede.setPressaoMedia(3.5);
            Duto duto = new Duto();
            duto.setExtensao(50);
            Hidrometro hidrometro = new Hidrometro();
            hidrometro.setNumeroSerie("HM-" + tipo.substring(0, 2).toUpperCase());
            
            System.out.println("\n--- 🌐 Distribuição de " + fornecido + "L na rede ---");
            rede.distribuir();
            duto.transportarAgua(fornecido);
            boolean vazamento = duto.verificarVazamentos();
            if (vazamento) {
                Alerta alerta = new Alerta();
                alerta.setTipo("Vazamento");
                alerta.setMensagem("Vazamento detectado no duto da rede " + tipo + "!");
                alerta.emitir();
            }
            hidrometro.registrarConsumo(fornecido);
            clientePadrao.solicitarAgua(fornecido);

            ContaDeAgua conta = new ContaDeAgua();
            conta.setMesReferencia("Novembro/2025");
            conta.gerarConta(hidrometro.getLeituraAtual());
            clientePadrao.pagarConta();
            
            System.out.println("\n--- Ciclo para " + fonte.nome + " Concluído ---\n");
        }
    }

    public void setNomeSistema(String nomeSistema) {
        this.nomeSistema = nomeSistema;
    }

    public void setVersao(String versao) {
        this.versao = versao;
    }

    public void setQtd(double qtd) {
        this.qtd = qtd;
    }
}