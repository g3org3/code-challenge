package com.jorgeadolfo.codechallenge.codechallenge.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@Builder
@NoArgsConstructor
public class HealthCheckOutboundDto {
    String status;
}
