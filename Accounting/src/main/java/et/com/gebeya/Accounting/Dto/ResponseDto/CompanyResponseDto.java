package et.com.gebeya.Accounting.Dto.ResponseDto;
import lombok.*;
import java.sql.Timestamp;

@Setter
@Getter
@AllArgsConstructor
@ToString
@NoArgsConstructor

public class CompanyResponseDto {
    private Timestamp createdon;
    private Timestamp updatedOn;
    private String companyname;
    private String address;
    private String contactPerson;
    private String phone;
    private String email;
    private String taxId;
    private Boolean isActive;


}
