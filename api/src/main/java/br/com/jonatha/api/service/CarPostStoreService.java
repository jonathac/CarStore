package br.com.jonatha.api.service;

import br.com.jonatha.api.dto.CarPostDTO;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public interface CarPostStoreService {

  List<CarPostDTO> getCarForSales();

  void changeCarForSale(CarPostDTO carPostDTO, String id);

  void removeCarForSale(String id);
}
