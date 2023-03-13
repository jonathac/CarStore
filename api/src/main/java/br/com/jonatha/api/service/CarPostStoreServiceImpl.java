package br.com.jonatha.api.service;

import br.com.jonatha.api.client.CarPostStoreClient;
import br.com.jonatha.api.dto.CarPostDTO;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CarPostStoreServiceImpl implements CarPostStoreService {

  @Autowired
  private CarPostStoreClient carPostStoreClient;

  @Override
  public List<CarPostDTO> getCarForSales() {
    return carPostStoreClient.carForSaleClient();
  }

  @Override
  public void changeCarForSale(CarPostDTO carPost, String id) {
    carPostStoreClient.changeCarForSaleClient(carPost, id);
  }

  @Override
  public void removeCarForSale(String id) {
    carPostStoreClient.deleteCarForSaleClient(id);
  }

}
