package com.example.thi_kthp_module4.model.dto;

import com.example.thi_kthp_module4.model.Country;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Accessors(chain = true)
public class CountryDTO {
    private String id;

    private String nameCountry;

    public CountryDTO(Long id, String nameCountry) {
        this.id = id.toString();
        this.nameCountry = nameCountry;
    }

    public Country toCountry() {
        return new Country()
                .setId(Long.parseLong(id))
                .setNameCountry(nameCountry);
    }
}
