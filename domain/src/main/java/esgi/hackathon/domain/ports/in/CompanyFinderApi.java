package esgi.hackathon.domain.ports.in;

import esgi.hackathon.domain.functional.model.Company;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public interface CompanyFinderApi {

    List<Company> findAll();

}
