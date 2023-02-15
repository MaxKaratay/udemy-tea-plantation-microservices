package com.tea.plantation.dto;

import com.tea.plantation.domain.Identifiable;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Null;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.UUID;

@Getter
@Setter
@Builder
@ToString
@AllArgsConstructor
public class TeaDto implements Identifiable<String> {
    @Null
    private String id;
    @Null // plantation service generate uuid for tea
    private UUID uuid;
    @NotBlank
    private String name;
    @NotBlank
    private String type;
}
