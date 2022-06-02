package org.etniqa.sql.injection.retrieve.creds.dto;

import lombok.AllArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@ToString
public class ProductResponse {
    private final String id;
    private final String name;
    private final String price;
}
