package et.com.gebeya.Accounting.Utils;

import et.com.gebeya.Accounting.Dto.RequestDto.CompanyRequestDto;
import et.com.gebeya.Accounting.Dto.ResponseDto.CompanyResponseDto;
import et.com.gebeya.Accounting.Model.CompanyInfo;
import et.com.gebeya.Accounting.Repository.CompanyRepo;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class MappingUtil {
    private static final ModelMapper modelMapper = new ModelMapper();

    private final CompanyRepo companyRepo;

    public CompanyResponseDto convertToCompanyResponseDto(CompanyInfo companyInfo) {
        return modelMapper.map(companyInfo, CompanyResponseDto.class);
    }

    public  CompanyInfo convertToCompanyEntity(CompanyRequestDto companyRequestDto) {
        return modelMapper.map(companyRequestDto, CompanyInfo.class);
    }
}
