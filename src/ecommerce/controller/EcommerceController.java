package ecommerce.controller;

import ecommerce.model.Ecommerce;
import ecommerce.repository.EcommerceRepository;
import java.util.ArrayList;


public class EcommerceController implements EcommerceRepository{

	private ArrayList<Ecommerce> listaProd = new ArrayList<Ecommerce>();
	int numero = 0;
	
	@Override
	public void ListarProdutos() {
		    for (var ecommerce : listaProd) {
				ecommerce.ListarProdutos();
		
		    }
	}

	@Override
	public void deletar(int numero) {
		// TODO Auto-generated method stub
		
	}
}
	
		
		
