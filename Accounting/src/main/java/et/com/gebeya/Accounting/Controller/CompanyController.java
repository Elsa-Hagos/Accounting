package et.com.gebeya.Accounting.Controller;

import et.com.gebeya.Accounting.Dto.RequestDto.CompanyRequestDto;
import et.com.gebeya.Accounting.Dto.ResponseDto.CompanyResponseDto;
import et.com.gebeya.Accounting.Service.CompanyService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/api/v1/Company/")
@RequiredArgsConstructor
public class CompanyController {



@Autowired
private  CompanyService companyService;

        /**
         COMPANY CONTROLLERS
         **/
        @PostMapping("/create-company")
        public ResponseEntity<CompanyResponseDto> createSubject(@RequestBody CompanyRequestDto subjectRequestDto){
           CompanyResponseDto createdSubject=companyService.createCompany(subjectRequestDto);
            return new ResponseEntity<>(createdSubject, HttpStatus.CREATED);
        }
}
