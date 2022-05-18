package kodlamaio.northwind.business.abstracts;

import kodlamaio.northwind.core.utilities.results.DataResult;
import kodlamaio.northwind.core.utilities.results.Result;
import kodlamaio.northwind.entities.concretes.Product;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ProductService {
    DataResult<List<Product>> getAll();
    DataResult<List<Product>> getAllSorted();
    DataResult<List<Product>> getAll(int pageNo,int pageSize);
    Result add(Product product);

    DataResult<Product> getByProductName(String productName);

    DataResult<Product> getByProductNameAndCategoryId(String productName,int categoryId);

    DataResult<List<Product>> getByProductNameOrCategoryId(String productName, int categoryId);

    DataResult<List<Product>> geyByCategoryIdIN(List<Integer> categories);

    DataResult<List<Product>> getByProductNameContains(String productNmae);

    DataResult<List<Product>> getByProductNameStarsWith(String productNmae);


}