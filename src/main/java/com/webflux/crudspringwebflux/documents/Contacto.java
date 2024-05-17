package com.webflux.crudspringwebflux.documents;

import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "contacto")
public class Contacto {
    private String id;
    private String nombre;
    private String email;
    private String telefono;
}
