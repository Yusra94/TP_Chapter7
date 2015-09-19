package ac.za.cput.companymanager.Service.Implementation;

import ac.za.cput.companymanager.Service.ProductService;
import ac.za.cput.companymanager.domain.Product;
import ac.za.cput.companymanager.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductServiceImpl implements ProductService{

    @Autowired
    ProductRepository repository;

    @Override
    public List<Product> getProduct()
    {
        List<Product> productList = new ArrayList();

        Iterable<Product>  productIterable = repository.findAll();

        for (Product product  : productIterable) {
            productList.add(product);
        }

        return productList;
    }
}
