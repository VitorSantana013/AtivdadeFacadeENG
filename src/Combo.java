public class Combo {

    private Burguer burguer = new Burguer();
    private Bebida bebida = new Bebida();
    private Sobremesa sobremesa = new Sobremesa();

    public int CriarCombo(int tipo){
        if (tipo == 1){
            burguer.setGramas(500);
            bebida.setMl(500);
            sobremesa.Sobremesa("Grande");
            burguer.setPreco(20.00);
            burguer.setDescricao("Lanche: X-Burguer "+ burguer.getGramas()+ "gramas " + "R$"+burguer.getPreco() + "/");
            bebida.setPreco(10.00);
            bebida.setDescricao("Bebida: Fanta "+ bebida.getMl()+ "ml " + "R$ " + bebida.getPreco() + "/");
            sobremesa.setPreco(12.00);
            sobremesa.setDescricao("Sobremesa: Sorvete - " + sobremesa.getTamanho() + " R$" + sobremesa.getPreco());
        } else if (tipo == 2) {
            burguer.setGramas(600);
            bebida.setMl(800);
            sobremesa.Sobremesa("Grande");
            burguer.setPreco(25.00);
            burguer.setDescricao("Lanche: X-Frango Extra " + burguer.getGramas() + "gramas " + "R$" + burguer.getPreco() + "/");
            bebida.setPreco(18.00);
            bebida.setDescricao("Bebida: Coca Cola " + bebida.getMl() + "ml " + "R$"+bebida.getPreco() + "/");
            sobremesa.setPreco(20.00);
            sobremesa.setDescricao("Sobremesa: Açai - " + sobremesa.getTamanho() + " R$" + sobremesa.getPreco());
        }
        return tipo;
    }
    @Override
    public String toString(){
        return burguer.getDescricao() + bebida.getDescricao() + sobremesa.getDescricao();
    }
}
