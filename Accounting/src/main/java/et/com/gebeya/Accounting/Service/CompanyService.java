package et.com.gebeya.Accounting.Service;

import et.com.gebeya.Accounting.Dto.RequestDto.CompanyRequestDto;
import et.com.gebeya.Accounting.Dto.ResponseDto.CompanyResponseDto;

public interface CompanyService {
    public CompanyResponseDto createCompany (CompanyRequestDto companyRequestDto);
}
