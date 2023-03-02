package extia.hackathon.postgres.adapters;

import esgi.hackathon.domain.ApplicationError;
import esgi.hackathon.domain.functional.model.Account;
import esgi.hackathon.domain.ports.out.AccountPersistenceSpi;
import io.vavr.control.Either;
import io.vavr.control.Option;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountPersistenceService implements AccountPersistenceSpi {
    @Override
    public Either<ApplicationError, Account> save(Account o) {
        return null;
    }

    @Override
    public List<Account> findAll() {
        return null;
    }

    @Override
    public Option<Account> findById(Long aLong) {
        return null;
    }
}
