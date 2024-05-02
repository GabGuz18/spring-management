package com.example.management;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "sale")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Sale {
    @Id
    private ObjectId id;
}
