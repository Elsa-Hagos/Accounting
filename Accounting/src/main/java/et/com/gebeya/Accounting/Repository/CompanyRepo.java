package et.com.gebeya.Accounting.Repository;

import et.com.gebeya.Accounting.Model.CompanyInfo;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;


@Repository
public interface CompanyRepo extends JpaRepository <CompanyInfo,Long> , JpaSpecificationExecutor<CompanyInfo> {

   boolean findBycompanyname (String CompanyName);
}
