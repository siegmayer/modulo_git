public class Progama {
    public static void main(String[]args){
        PessoaFisica pessoaFisica = new PessoaFisica();
        pessoaFisica.setNome("Brayan");
        pessoaFisica.setSobreNome("Franklin");
        pessoaFisica.setCpf(23321321l);

        PessoaJuridica pessoaJuridica = new PessoaJuridica();
        pessoaJuridica.setNome("Bruce");
        pessoaJuridica.setSobreNome("Franklin");
        pessoaJuridica.setCnpj(2138193871728l);
    }

}
