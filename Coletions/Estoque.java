package br.com.generation.coletions;

public class Estoque {
          String produto;
          int codproduto;
          
       

		public Estoque(String produto, int codproduto) {
			super();
			this.produto = produto;
			this.codproduto = codproduto;
		}



		public String getProduto() {
			return produto;
		}



		public void setProduto(String produto) {
			this.produto = produto;
		}



		public int getQuantidade() {
			return codproduto;
		}



		public void setQuantidade(int codproduto) {
			this.codproduto = codproduto;
		}



		@Override
		public String toString() {
			return "Estoque [produto=" + produto + ", codproduto=" + codproduto + "]";
		}
		
		
}
