package et.com.gebeya.Accounting.Model;


import jakarta.persistence.*;
import lombok.*;



@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
@Entity
public class Users {



        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        @ManyToOne
        @JoinColumn(name = "company_id")
        private CompanyInfo company;

        private String username;
        private String password;
        private String email;
        private String roll;




}
