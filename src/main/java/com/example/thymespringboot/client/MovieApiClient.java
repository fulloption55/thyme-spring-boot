package com.example.thymespringboot.client;


import com.example.thymespringboot.config.MovieApiConfig;
import com.example.thymespringboot.model.SfCinemaCity;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.HttpServerErrorException;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import java.net.SocketTimeoutException;

@Log4j2
@Component
public class MovieApiClient {
    @Autowired
    private MovieApiConfig movieApiConfig;

    private RestTemplate restTemplate = new RestTemplate();

    public <T> ResponseEntity<SfCinemaCity> getNowMovie(String language) {
        String endpoint = movieApiConfig.getShowtimeEndpoint();
        ResponseEntity<SfCinemaCity> responseEntity;
        try {
            log.info(endpoint);
            responseEntity = restTemplate.getForEntity(endpoint, SfCinemaCity.class);
        } catch(HttpClientErrorException | HttpServerErrorException e) {
            return null;
        } catch (RestClientException rcEx) {
            if (rcEx.getRootCause() instanceof SocketTimeoutException) {
                log.error("Sending request was failed due to SocketTimeoutException from [{}]", endpoint, rcEx);
                return null;
            }
            log.error("Sending request was failed due to Connection from [{}]", endpoint, rcEx);
            return null;

        } catch (Exception ex) {
            log.error("Sending request was failed", ex);
            return null;
        }
        log.info(responseEntity.toString());
        return responseEntity;
    }

}
