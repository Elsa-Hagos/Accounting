package et.com.gebeya.Accounting.Repository;

import et.com.gebeya.Accounting.Model.CompanyInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface testRepo extends JpaRepository<CompanyInfo, Long >, JpaSpecificationExecutor<CompanyInfo> {

    boolean existsByName (String CompanyName);
}
