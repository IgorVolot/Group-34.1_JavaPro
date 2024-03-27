package ait.car.dto;

import lombok.*;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@ToString
@Builder
public class CarDto {
    private String manufacturer;
    private int year;
    @Singular
    private List<String> models;


}
