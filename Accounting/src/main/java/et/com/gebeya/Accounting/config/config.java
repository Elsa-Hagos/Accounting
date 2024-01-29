package et.com.gebeya.Accounting.config;

import et.com.gebeya.Accounting.Model.CompanyInfo;
import et.com.gebeya.Accounting.Repository.CompanyRepo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.repository.query.FluentQuery;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

@Configuration
public class config {

    @Bean
    public CompanyRepo companyRepo() {
        return new CompanyRepo() {
            @Override
            public List<CompanyInfo> findAll(Sort sort) {
                return null;
            }

            @Override
            public Page<CompanyInfo> findAll(Pageable pageable) {
                return null;
            }

            @Override
            public <S extends CompanyInfo> S save(S entity) {
                return null;
            }

            @Override
            public <S extends CompanyInfo> List<S> saveAll(Iterable<S> entities) {
                return null;
            }

            @Override
            public Optional<CompanyInfo> findById(Long aLong) {
                return Optional.empty();
            }

            @Override
            public boolean existsById(Long aLong) {
                return false;
            }

            @Override
            public List<CompanyInfo> findAll() {
                return null;
            }

            @Override
            public List<CompanyInfo> findAllById(Iterable<Long> longs) {
                return null;
            }

            @Override
            public long count() {
                return 0;
            }

            @Override
            public void deleteById(Long aLong) {

            }

            @Override
            public void delete(CompanyInfo entity) {

            }

            @Override
            public void deleteAllById(Iterable<? extends Long> longs) {

            }

            @Override
            public void deleteAll(Iterable<? extends CompanyInfo> entities) {

            }

            @Override
            public void deleteAll() {

            }

            @Override
            public Optional<CompanyInfo> findOne(Specification<CompanyInfo> spec) {
                return Optional.empty();
            }

            @Override
            public List<CompanyInfo> findAll(Specification<CompanyInfo> spec) {
                return null;
            }

            @Override
            public Page<CompanyInfo> findAll(Specification<CompanyInfo> spec, Pageable pageable) {
                return null;
            }

            @Override
            public List<CompanyInfo> findAll(Specification<CompanyInfo> spec, Sort sort) {
                return null;
            }

            @Override
            public long count(Specification<CompanyInfo> spec) {
                return 0;
            }

            @Override
            public boolean exists(Specification<CompanyInfo> spec) {
                return false;
            }

            @Override
            public long delete(Specification<CompanyInfo> spec) {
                return 0;
            }

            @Override
            public <S extends CompanyInfo, R> R findBy(Specification<CompanyInfo> spec, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
                return null;
            }

            @Override
            public void flush() {

            }

            @Override
            public <S extends CompanyInfo> S saveAndFlush(S entity) {
                return null;
            }

            @Override
            public <S extends CompanyInfo> List<S> saveAllAndFlush(Iterable<S> entities) {
                return null;
            }

            @Override
            public void deleteAllInBatch(Iterable<CompanyInfo> entities) {

            }

            @Override
            public void deleteAllByIdInBatch(Iterable<Long> longs) {

            }

            @Override
            public void deleteAllInBatch() {

            }

            @Override
            public CompanyInfo getOne(Long aLong) {
                return null;
            }

            @Override
            public CompanyInfo getById(Long aLong) {
                return null;
            }

            @Override
            public CompanyInfo getReferenceById(Long aLong) {
                return null;
            }

            @Override
            public <S extends CompanyInfo> Optional<S> findOne(Example<S> example) {
                return Optional.empty();
            }

            @Override
            public <S extends CompanyInfo> List<S> findAll(Example<S> example) {
                return null;
            }

            @Override
            public <S extends CompanyInfo> List<S> findAll(Example<S> example, Sort sort) {
                return null;
            }

            @Override
            public <S extends CompanyInfo> Page<S> findAll(Example<S> example, Pageable pageable) {
                return null;
            }

            @Override
            public <S extends CompanyInfo> long count(Example<S> example) {
                return 0;
            }

            @Override
            public <S extends CompanyInfo> boolean exists(Example<S> example) {
                return false;
            }

            @Override
            public <S extends CompanyInfo, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
                return null;
            }

            @Override
            public boolean findByName(String CompanyName) {
                return false;
            }
        };
    }

}
