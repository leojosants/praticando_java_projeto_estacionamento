package dio.digitalinnovationone.parking.service;

import dio.digitalinnovationone.parking.exception.ParkingNotFoundException;
import dio.digitalinnovationone.parking.model.Parking;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.*;
import java.util.stream.Collectors;

@Service
public class ParkingService {

    private static final Map<String, Parking> parkingMap = new HashMap<>();

    static {
        var id = getUUID();
        var id1 = getUUID();

        Parking parking = new Parking(id, "DMS-1111", "SC", "CELTA", "PRETO");
        Parking parking1 = new Parking(id1, "AMS-1111", "MG", "VW GOL", "VERMELHO");

        parkingMap.put(id, parking);
        parkingMap.put(id1, parking1);
    }

    public List<Parking> findAll() {
        return new ArrayList<>(parkingMap.values());
    }

    private static String getUUID() {
        return UUID.randomUUID().toString().replace("-", "");
    }

    public Parking findById(String id) {
        Parking parking = parkingMap.get(id);

        if (parking == null) {
            throw  new ParkingNotFoundException(id);
        }

        return parking;
    }

    public Parking create(Parking parkingCreate) {
        String uuid = getUUID();

        parkingCreate.setId(uuid);
        parkingCreate.setEntryDate(LocalDateTime.now());

        parkingMap.put(uuid, parkingCreate);

        return parkingCreate;

    }
}
