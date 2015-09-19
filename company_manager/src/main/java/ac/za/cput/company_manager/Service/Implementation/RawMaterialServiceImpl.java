package ac.za.cput.companymanager.Service.Implementation;

import ac.za.cput.companymanager.Service.RawMaterialService;
import ac.za.cput.companymanager.domain.RawMaterial;
import ac.za.cput.companymanager.repository.RawMaterialRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class RawMaterialServiceImpl implements RawMaterialService{

    @Autowired
    RawMaterialRepository repository;

    @Override
    public List<RawMaterial> getRawMaterial()
    {
        List<RawMaterial> rawMaterialsList = new ArrayList();

        Iterable<RawMaterial>  rawMaterialIterable = repository.findAll();

        for (RawMaterial rawMaterial  : rawMaterialIterable) {
            rawMaterialsList.add(rawMaterial);
        }

        return rawMaterialsList;
    }
}
