package proj.bankingapp.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import proj.bankingapp.entity.Account;

public interface AccountRepository extends JpaRepository<Account, Long> {

}
