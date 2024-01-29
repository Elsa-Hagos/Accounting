package et.com.gebeya.Accounting.Dto.RequestDto;
import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@ToString
@NoArgsConstructor

public class CompanyRequestDto {
    private String companyname;
    private String address;
    private String contactPerson;
    private String phone;
    private String email;
    private String taxId;


}
