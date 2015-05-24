package ac.za.cput.company_manager.Service.Implementation;

import ac.za.cput.company_manager.Service.SupplierService;
import ac.za.cput.company_manager.domain.Supplier;
import ac.za.cput.company_manager.repository.SupplierRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SupplierServiceImpl implements SupplierService{

    @Autowired
    SupplierRepository repository;

    @Override
    public List<Supplier> getSupplier()
    {
        List<Supplier> supplierList = new ArrayList();

        Iterable<Supplier>  supplierIterable = repository.findAll();

        for (Supplier supplier  : supplierIterable) {
            supplierList.add(supplier);
        }

        return supplierList;
    }
}
