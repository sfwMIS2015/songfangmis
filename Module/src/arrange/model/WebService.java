package arrange.model;
import java.util.*;
public class WebService {
	private WorkArrangeDAO workArrangeDAO;
	private WorkChangeDAO workChangeDAO;
	
	public WebService(String USERS,WorkArrangeDAO workArrangeDAO,WorkChangeDAO workChangeDAO) {
        this(workArrangeDAO,workChangeDAO);
    }
    public WebService(WorkArrangeDAO workArrangeDAO,WorkChangeDAO workChangeDAO) {
		this.workArrangeDAO=workArrangeDAO;
		this.workChangeDAO=workChangeDAO;
	}
    //
   /* public boolean isCustomerExisted(Customer customer) {
    	Customer storedAcct=customerDAO.getCustomer(customer);
		return storedAcct!=null;
    }
	
    public boolean checkLogin(Customer customer){
		if(customer.getName()!=null && customer.getPassword()!=null){
			Customer storedAcct=customerDAO.getCustomer(customer);
			return storedAcct!=null && storedAcct.getPassword().equals(customer.getPassword());
		}
		return false;
	}
    
    public boolean isGetPasswordOK(Customer customer){
		if(customer.getName()!=null && customer.getEmail()!=null){
			Customer storedAcct=customerDAO.getCustomer(customer);
			return storedAcct!=null && storedAcct.getEmail().equals(customer.getEmail());
		}
		return false;
	}
 *//**   public Customer getPassword(Customer customer) {
		
		return customerDAO.getPassword(customer);
	}*//*
    public Customer getCustomer(Customer customer) {
		
		return customerDAO.getCustomer(customer);
	}
    
	public void addCustomer(Customer customer){
		customerDAO.addCustomer(customer);
	}
	public List<Customer> getCustomers(Customer customer){
		return customerDAO.getCustomers(customer);
	}
	public void updateCustomer(Customer customer) {
		customerDAO.updateCustomer(customer);
	}
	public void deleteCustomer(Customer customer){
		customerDAO.deleteCustomer(customer);
	}
	
	//
	public void addAdministrator(Administrator administrator){
		administratorDAO.addAdministrator(administrator);
	}
	public List<Administrator> getAdministrators(Administrator administrator){
		return administratorDAO.getAdministrators(administrator);
	}
	public void updateAdministrator(Administrator administrator) {
		administratorDAO.updateAdministrator(administrator);
	}
	public void deleteAdministrator(Administrator administrator){
		administratorDAO.deleteAdministrator(administrator);
	}
	//
	 public boolean isCollectionExisted(Collection collection) {
	        return collectionDAO.isCollectionExisted(collection);
	    }
		
		public void addCollection(Collection collection){
			collectionDAO.addCollection(collection);
		}
		public List<Collection> getCollections(Collection collection){
			return collectionDAO.getCollections(collection);
		}
		public void updateCollection(Collection customer) {
			collectionDAO.updateCollection(customer);
		}
		public void deleteCollection(Collection collection){
			collectionDAO.deleteCollection(collection);
		}
		//
		public void addCOrder(COrder corder){
			corderDAO.addCOrder(corder);
		}
		public List<COrder> getCOrders(COrder corder){
			return corderDAO.getCOrders(corder);
		}
		public void updateCOrder(COrder corder) {
			corderDAO.updateCOrder(corder);
		}
		public void deleteCOrder(COrder corder){
			corderDAO.deleteCOrder(corder);
		}
		//
		public void addEvaluation(Evaluation evaluation){
			evaluationDAO.addEvaluation(evaluation);
		}
		public List<Evaluation> getEvaluations(Evaluation evaluation){
			return evaluationDAO.getEvaluations(evaluation);
		}
		public void updateEvaluation(Evaluation evaluation) {
			evaluationDAO.updateEvaluation(evaluation);
		}
		public void deleteEvaluation(Evaluation evaluation){
			evaluationDAO.deleteEvaluation(evaluation);
		}
		//
		public void addGoods(Goods goods){
			goodsDAO.addGoods(goods);
		}
		public List<Goods> getGoodses(Goods goods){
			return goodsDAO.getGoods(goods);
		}
		public void updateGoods(Goods goods) {
			goodsDAO.updateGoods(goods);
		}
		public void deleteGoods(Goods goods){
			goodsDAO.deleteGoods(goods);
		}
		//
		public void addGoodsquantity(Goodsquantity goodsquantity){
			goodsquantityDAO.addGoodsquantity(goodsquantity);
		}
		public List<Goodsquantity> getGoodsquantities(Goodsquantity goodsquantity){
			return goodsquantityDAO.getGoodsquantities(goodsquantity);
		}
		public void updateGoodsquantity(Goodsquantity goodsquantity) {
			goodsquantityDAO.updateGoodsquantity(goodsquantity);
		}
		public void deleteGoodsquantity(Goodsquantity goodsquantity){
			goodsquantityDAO.deleteGoodsquantity(goodsquantity);
		}
		//
		public boolean isSellerExisted(Seller seller) {
	        return sellerDAO.isSellerExisted(seller);
	    }
		
		public void addSeller(Seller seller){
			sellerDAO.addSeller(seller);
		}
		public List<Seller> getSellers(Seller seller){
			return sellerDAO.getSellers(seller);
		}
		public void updateSeller(Seller seller) {
			sellerDAO.updateSeller(seller);
		}
		public void deleteSeller(Seller seller){
			sellerDAO.deleteSeller(seller);
		}
		//
		public void addShoppingcart(Shoppingcart shoppingcart){
			shoppingcartDAO.addShoppingcart(shoppingcart);
		}
		public List<Shoppingcart> getShoppingcarts(Shoppingcart shoppingcart){
			return shoppingcartDAO.getShoppingcarts(shoppingcart);
		}
		public void updateShoppingcart(Shoppingcart shoppingcart) {
			shoppingcartDAO.updateShoppingcart(shoppingcart);
		}
		public void deleteShoppingcart(Shoppingcart shoppingcart){
			shoppingcartDAO.deleteShoppingcart(shoppingcart);
		}
		//
		public void addSOrder(SOrder sorder){
			sorderDAO.addSOrder(sorder);
		}
		public List<SOrder> getSOrders(SOrder sorder){
			return sorderDAO.getSOrders(sorder);
		}
		public void updateSOrder(SOrder sorder) {
			sorderDAO.updateSOrder(sorder);
		}
		public void deleteSOrder(SOrder sorder){
			sorderDAO.deleteSOrder(sorder);
		}*/
		
}
