package com.aluradesafio.conversorDeMonedas.Principal;

public record Conversion(String base_code,
                         String target_code,
                         double conversion_result) {
}
