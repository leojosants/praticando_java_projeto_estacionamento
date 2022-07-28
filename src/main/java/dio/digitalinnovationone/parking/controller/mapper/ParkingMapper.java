package dio.digitalinnovationone.parking.controller.mapper;

import dio.digitalinnovationone.parking.controller.dto.ParkingDTO;
import dio.digitalinnovationone.parking.model.Parking;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ParkingMapper {

    private  static final ModelMapper MODEL_MAPPER = new ModelMapper();

    public ParkingDTO parkingDTO(Parking parking) {
        return MODEL_MAPPER.map(parking, ParkingDTO.class);
    }

    public List<Parking> toParkingDTOList(List<Parking> parkingList) {
        return null;
    }
}
