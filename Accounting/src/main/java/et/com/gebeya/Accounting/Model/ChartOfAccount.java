package et.com.gebeya.Accounting.Model;


import jakarta.persistence.*;
import lombok.*;


@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
@Entity
    public class ChartOfAccount {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        private String accountCode;
        private String accountDescription;
        private String accountType;



}
