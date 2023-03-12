package model;

import lombok.*;

@AllArgsConstructor
@Getter
@Setter
@ToString

public class Weather {

    private String city;
    private String country;
    private int temp;

}
