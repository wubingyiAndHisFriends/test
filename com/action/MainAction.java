package com.action;

import com.intf.service.MainServiceIntface;
import com.opensymphony.xwork2.ActionSupport;
import com.product.Product;
import com.service.MainService;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.List;

@Namespace("/")
@Controller
public class MainAction extends ActionSupport {

    @Autowired
    private MainServiceIntface service;

    private List<Product> productList;
    private Product product;

    @org.apache.struts2.convention.annotation.Action(value="home", results={@Result(name=SUCCESS, location="/index.jsp" )})
    public String home(){
        System.out.println("go to home page");
        return SUCCESS;
    }

    @org.apache.struts2.convention.annotation.Action(value="list",results={@Result(name=SUCCESS,location = "/list.jsp")})
    public String list(){
        this.productList = service.findList();
        System.out.println("go to list page");
        return  SUCCESS;
    }
    @org.apache.struts2.convention.annotation.Action(value="product",results={@Result(name=SUCCESS,location="/product.jsp")})
    public String product(){
        this.product = service.findProduct();
        System.out.println("go to product page");
        return  SUCCESS;
    }

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
}
