package et.com.gebeya.Accounting.Model;
import lombok.*;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import java.sql.Timestamp;



@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
@Entity
@Table(name = "CompanyInfo")
public class CompanyInfo {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;
        @Column(name = "created_on" )
        private Timestamp createdon;
        @Column(name = "updated_on")
        private Timestamp updatedOn;
        @Column (name = "company_name ",length = 255)
        @NotBlank(message = "CompanyName is mandatory")
        private String companyname;
        @Column(name = "address" , length = 255)
        @NotBlank(message = "Address is mandatory ")
        private String address;
        @Column(name = "contact_person" , length = 255)
        @NotBlank(message = "Contact Person is mandatory ")
        private String contactPerson;
        @Column(name = "phone" , length = 255)
        @NotBlank(message = "Phone is mandatory ")
        private String phone;
        @Column(name = "email" , length = 255)
        private String email;
        @Column(name = "tax_id" , length = 15)
        @NotBlank(message = "Tax ID is mandatory ")
        private String taxId;
        @Column(name = "is_active" , length = 10)
        @NotBlank(message = "Active Status is mandatory")
        private Boolean isActive;

}
