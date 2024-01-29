package et.com.gebeya.Accounting.Model;
import java.util.Set;
import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDate;
import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
@Entity
    public class CustomerChartOfAccounts {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        @ManyToMany
        @JoinTable(
                name = "customer_chart_company",
                joinColumns = @JoinColumn(name = "customer_chart_id"),
                inverseJoinColumns = @JoinColumn(name = "company_id")
        )
        private Set<CompanyInfo> companies;

        private String accountCode;
        private String accountDescription;
        private String accountType;



}
