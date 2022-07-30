package dio.digitalinnovationone.parking.controller;

import dio.digitalinnovationone.parking.CloudParkingApplication;
import io.restassured.RestAssured;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.server.LocalServerPort;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class ParkingControllerTestIT {

    @LocalServerPort
    private int randomPort;

    @BeforeEach
    public void setupTest() {
        System.out.println(randomPort);
        RestAssured.port = randomPort;
    }

    @Test
    void findAll() {
    }

    @Test
    void create() {
    }
}