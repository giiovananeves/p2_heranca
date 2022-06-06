public class Principal {

    public static void main(String[] args) {
        Pessoafisica pessoafisica = new Pessoafisica();
        Pessoajuridica pessoajuridica = new Pessoajuridica();

        pessoafisica.setEndereço("Rua Dona Nena");
        pessoafisica.setNome("Marcelo");
        pessoafisica.setCPF(564858997);

        pessoajuridica.setEndereço("Rua joaquim de almeida");
        pessoajuridica.setNome("Giovana");
        pessoajuridica.setCNPJ(6415465);
        
        System.out.println(pessoafisica.getCPF());
        System.out.println(pessoajuridica.getCNPJ());
        System.out.println(pessoafisica.getNome());
        System.out.println(pessoajuridica.getEndereço());


    }  
}
