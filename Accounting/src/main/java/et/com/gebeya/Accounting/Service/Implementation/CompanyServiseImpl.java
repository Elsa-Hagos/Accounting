package et.com.gebeya.Accounting.Service.Implementation;

import et.com.gebeya.Accounting.Dto.RequestDto.CompanyRequestDto;
import et.com.gebeya.Accounting.Dto.ResponseDto.CompanyResponseDto;
import et.com.gebeya.Accounting.Model.CompanyInfo;
import et.com.gebeya.Accounting.Repository.CompanyRepo;
import et.com.gebeya.Accounting.Service.CompanyService;
import et.com.gebeya.Accounting.Utils.MappingUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
@Service
@Component

public class CompanyServiseImpl implements CompanyService {
    @Autowired
    private CompanyRepo companyRepo;
@Autowired
private  MappingUtil mappingUtil;

 @Transactional
 public CompanyResponseDto createCompany(CompanyRequestDto companyRequestDto) {
     String companyName= companyRequestDto.getCompanyname();
     if (companyRepo.findBycompanyname(companyName)){
         throw new  RuntimeException("company is already registered ");
     }







     CompanyInfo companyInfo=mappingUtil.convertToCompanyEntity(companyRequestDto);
     companyInfo.setIsActive(true);
     CompanyInfo savedCompany=companyRepo.save(companyInfo);
     return mappingUtil.convertToCompanyResponseDto(savedCompany);
 }
}