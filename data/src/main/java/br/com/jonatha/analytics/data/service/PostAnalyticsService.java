package br.com.jonatha.analytics.data.service;

import br.com.jonatha.analytics.data.dto.CarPostDTO;
import org.springframework.stereotype.Service;

@Service
public interface PostAnalyticsService {

    void saveDataAnalytics(CarPostDTO carPostDTO);

}
